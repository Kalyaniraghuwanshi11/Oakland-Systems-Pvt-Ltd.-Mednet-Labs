package com.example.WebPage.service;

import java.util.List;

import com.example.WebPage.model.User;

public interface UserService {

    public String register(User user);

    public int login(User user);

    public List<User> getAllUsers();
}
