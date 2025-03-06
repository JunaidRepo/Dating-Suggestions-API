package com.Dating.Suggestions.Service;

import com.Dating.Suggestions.EntityDto.UsersDto;

import java.util.List;

public interface UserService {
     void add(UsersDto dto);
     void remove(int id);
     void update(int id);
     void all();
     void get(int id);
     List<UsersDto> match(int id);
}
