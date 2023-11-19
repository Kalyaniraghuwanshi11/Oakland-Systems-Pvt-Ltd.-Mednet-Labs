package com.example.WebPage.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.WebPage.model.User;
import com.example.WebPage.repository.UserRepo;

public class UserServiceImplementation {
    @Autowired
    private UserRepo repo;

    public void registerUser(User user) {
        repo.save(user);

    }

}
