package com.Dating.Suggestions.Service.Implementation;
import com.Dating.Suggestions.Entity.Interest;
import com.Dating.Suggestions.Entity.Users;
import com.Dating.Suggestions.EntityDto.UsersDto;
import com.Dating.Suggestions.Exceptions.InterestException.MinimumInterest;
import com.Dating.Suggestions.Exceptions.UserExceptions.AgeNotValid;
import com.Dating.Suggestions.Exceptions.UserExceptions.CorrectDetails;
import com.Dating.Suggestions.Exceptions.UserExceptions.Missing;
import com.Dating.Suggestions.Mapper.Mapper;
import com.Dating.Suggestions.Repo.repo;
import com.Dating.Suggestions.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImp implements UserService {
    private final repo repo;
    public UserServiceImp(repo repo){
        this.repo=repo;
    }

    @Override
    public void add(UsersDto dto){
        dto.setId(0);
        if(dto.getAge() ==0 || dto.getGender()==null ||dto.getInterest()==null|| dto.getInterest().isEmpty() ||dto.getName()==null){
            StringBuilder sb=new StringBuilder();
            if(dto.getAge()==0) sb.append("Age ");
            if(dto.getGender()==null) sb.append("Gender ");
            if(dto.getInterest()==null || dto.getInterest().isEmpty()) sb.append("Interest ");
            throw new Missing(sb.toString());
        }
        if(dto.getAge()<18) throw new AgeNotValid();
        if(dto.getInterest().size()<2) throw new MinimumInterest();
        Users u= Mapper.mapToUser(dto);
        repo.save(u);
    }

    @Override
    public UsersDto get(Integer id){
        if(id==null) throw new CorrectDetails();
        Optional<Users> opt=repo.findById(id);
        if(opt.isEmpty()) throw new CorrectDetails();
        return Mapper.mapToUserDto(opt.get());
    }

    @Override
    public void remove(Integer id){
        Optional<Users> opt=repo.findById(id);
        if(opt.isEmpty()) throw new CorrectDetails();
        repo.deleteById(id);
    }
    @Override
    public void update(UsersDto dto){
        if(dto.getId()==null) throw new CorrectDetails();
        Optional<Users> opt=repo.findById(dto.getId());
        if(opt.isEmpty()) throw new CorrectDetails();
        if(dto.getAge() ==0 || dto.getGender()==null ||dto.getInterest()==null|| dto.getInterest().isEmpty() ||dto.getName()==null){
            StringBuilder sb=new StringBuilder();
            if(dto.getAge()==0) sb.append("Age ");
            if(dto.getGender()==null) sb.append("Gender ");
            if(dto.getInterest()==null || dto.getInterest().isEmpty()) sb.append("Interest ");
            throw  new Missing(sb.toString());
        }
        repo.save(Mapper.mapToUser(dto));

    }
    @Override
    public List<UsersDto> all(){
        List<Users> useList=repo.findAll();
        if (useList.isEmpty()) return Collections.emptyList();
        return useList.stream().map(i->Mapper.mapToUserDto(i)).toList();

    }

    @Override
    public List<UsersDto> match(Integer id){
        Optional<Users> opt=repo.findById(id);
        if(opt.isEmpty()) throw new CorrectDetails();
        List<Users> totalUser=repo.findAll();
        List<UsersDto> totalDto=totalUser.stream()
                .filter(i->i.getId()!=opt.get().getId() &&!(i.getuGender()).equals(opt.get().getuGender()))
                .sorted((i,j)->{
                    int val1=Math.abs(i.getuAge()-opt.get().getuAge());
                    int val2=Math.abs(j.getuAge()-opt.get().getuAge());
                    if(val1==val2){
                     return interestsSort(new HashSet<>(j.getuInterest()) ,new HashSet<>(opt.get().getuInterest()))-
                             interestsSort(new HashSet<>(i.getuInterest()) ,new HashSet<>(opt.get().getuInterest()));
                    }
                    return val1-val2;
                })
                .map(i->Mapper.mapToUserDto(i)).toList();
        return totalDto;

    }
    private int  interestsSort(Set<Interest> s1, Set<Interest> s2) {
        Set<Interest> s3=new HashSet<>(s1);
         s3.retainAll(s2);
        return s3.size();
    }



}
