package com.example.WebPage.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.WebPage.service.repo;
import com.example.WebPage.model.User;
import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/Home")

public class HomeController {
    @Autowired
    User UserRepo;

    public HomeController() {
    }

    @GetMapping("/example")
    public String exampleMethod(Model model) {
        User user = new User();
        user.setId(1);
        user.setUsername("exampleUser");
        return null;
    }

    @PostMapping("/userLogin")
    public String loginUser(@ModelAttribute("user") User user) {
        String userId = user.getUserId();
        User userdata = repo.findbyUserId(userId);
        if (user.getPassword().equals(userdata.getPassword())) {
            return "home";

        } else {
            return "error";
        }
    }

    public User getRepo() {
        return UserRepo;
    }

    public void setRepo(User repo) {
        UserRepo = repo;
    }

}
