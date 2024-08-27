package com.example.validations.models;

import com.example.validations.customs.StrongPassword;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    private int id;

    @Size(min = 2, max = 50, message = "Name is too small!!")
    private String name;

    @StrongPassword()
    private String password;

    @NotBlank(message = "email can not be null")
    @Email(message = "Enter a valid email ID")
    private String email;
}
