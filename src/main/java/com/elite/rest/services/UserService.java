package com.elite.rest.services;

import com.elite.rest.entities.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public interface UserService {
	UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);
    UserDTO getUserById(Long id);
    Page<UserDTO> getAllUsers(Pageable pageable);
}
