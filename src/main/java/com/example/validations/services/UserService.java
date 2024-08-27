package com.example.validations.services;

import com.example.validations.models.User;
import lombok.Getter;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    private final User user;

    public UserService(User user) {
        this.user = user;
    }

    public User setUser(User userInput) {
        user.setId(userInput.getId());
        user.setName(userInput.getName());
        user.setEmail(userInput.getEmail());
        user.setPassword(userInput.getPassword());
        return user;
    }
}
