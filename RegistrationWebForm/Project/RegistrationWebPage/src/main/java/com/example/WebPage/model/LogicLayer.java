package com.example.WebPage.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WebPage.repository.UserRepo;
import com.example.WebPage.service.UserService;

@Service
public class LogicLayer implements UserService {

    @Autowired
    public UserRepo userRepo;

    public int login() {
        return -1;

    }

    @Override
    public String register(User user) {
        userRepo.save(user);
        String str = "New user " + user.userName + " is Successfuly registered";
        return str;
    }

    @Override
    public List<User> getAllUsers() {

        List<User> list = userRepo.findAll();
        return list;
    }

    @Override
    public int login(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

}
