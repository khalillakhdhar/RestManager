package com.elite.rest.entities.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.elite.rest.entities.User;
import com.elite.rest.entities.dto.UserDTO;

@Component
public class UserMapper {
    private final ModelMapper modelMapper;
// injection des dependences 
    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public UserDTO toDTO(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

    public User toEntity(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }
}