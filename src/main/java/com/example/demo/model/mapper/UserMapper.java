package com.example.demo.model.mapper;

import com.example.demo.model.dto.UserDto;
import com.example.demo.model.entity.User;

public class UserMapper {
    public static UserDto map(User entity){
        UserDto dto = new UserDto();
        dto.setId(entity.getId());
        dto.setLogin(entity.getLogin());
        dto.setPassword(entity.getPassword());
        return dto;
    }
    public static User map(UserDto dto){
        User entity = new User();
        entity.setId(dto.getId());
        entity.setPassword(dto.getPassword());
        entity.setLogin(dto.getLogin());
        return entity;
    }
}
