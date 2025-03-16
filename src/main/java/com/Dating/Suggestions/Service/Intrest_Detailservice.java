package com.Dating.Suggestions.Service;

import com.Dating.Suggestions.EntityDto.Intrest_DetailsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Intrest_Detailservice {
     void add(Intrest_DetailsDto dto) ;
     void remove(Integer id);
     void update(Intrest_DetailsDto dto);
     List<Intrest_DetailsDto> all();
     Intrest_DetailsDto get(Integer id);
     List<Intrest_DetailsDto> match(Integer id);
}
