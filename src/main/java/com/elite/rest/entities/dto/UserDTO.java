package com.elite.rest.entities.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    @NotBlank(message = "name cannot be blank")
    @Size(min = 3, max = 50, message = "name must be between 3 and 50 characters")
    private String name;
    @NotBlank(message = "name cannot be blank")
    @Email(message="email shoul be a valid value ")
    private String email;

   
}