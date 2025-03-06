package com.Dating.Suggestions.Service.Implementation;
import com.Dating.Suggestions.EntityDto.UsersDto;
import com.Dating.Suggestions.Repo.repo;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp {
    private final repo repo;
    public UserServiceImp(repo repo){
        this.repo=repo;
    }

//    public List<UsersDto> match(int id){
//
//    }
//


}
