package com.Dating.Suggestions.Service;

import com.Dating.Suggestions.EntityDto.UsersDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
     void add(UsersDto dto) ;
     void remove(Integer id);
     void update(UsersDto dto);
     List<UsersDto> all();
     UsersDto get(Integer id);
     List<UsersDto> match(Integer id);
}
