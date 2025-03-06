package com.Dating.Suggestions.Mapper;


import com.Dating.Suggestions.Entity.Interest;
import com.Dating.Suggestions.Entity.Users;
import com.Dating.Suggestions.EntityDto.InterestDto;
import com.Dating.Suggestions.EntityDto.UsersDto;

import java.util.List;

public class Mapper {

    public static UsersDto mapToUserDto(Users use){
        List<InterestDto> dt=use.getuInterest().stream().map(i->new InterestDto(i.getId(),i.getInterest())).toList();
        return new UsersDto(use.getId(),use.getuName(),use.getuGender(),use.getuAge(),dt);
    }

    public static Users mapToUser(UsersDto dto) {
        List<Interest> lst = dto.getInterest().stream().map(i ->new Interest(i.getId(),i.getInterest())).toList();
        return new Users(dto.getId(),dto.getName(),dto.getGender(),dto.getAge(),lst);
    }
}
