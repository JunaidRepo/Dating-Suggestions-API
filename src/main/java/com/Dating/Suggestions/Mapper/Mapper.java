package com.Dating.Suggestions.Mapper;


import com.Dating.Suggestions.Entity.Interest;
import com.Dating.Suggestions.Entity.Intrest_Details;
import com.Dating.Suggestions.EntityDto.InterestDto;
import com.Dating.Suggestions.EntityDto.Intrest_DetailsDto;

import java.util.List;

public class Mapper {

    public static Intrest_DetailsDto mapToUserDto(Intrest_Details use){
        List<InterestDto> dt=use.getuInterest().stream().map(i->new InterestDto(i.getId(),i.getInterest())).toList();
        return new Intrest_DetailsDto(use.getId(),use.getuName(),use.getuGender(),use.getuAge(),dt);
    }

    public static Intrest_Details mapToUser(Intrest_DetailsDto dto) {
        List<Interest> lst = dto.getInterest().stream().map(i ->new Interest(0,i.getInterest())).toList();
        return new Intrest_Details(dto.getId(),dto.getName(),dto.getGender(),dto.getAge(),lst);
    }
}
