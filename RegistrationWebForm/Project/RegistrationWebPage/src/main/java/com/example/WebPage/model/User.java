package com.example.WebPage.model;

import com.example.WebPage.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Autowired
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String userName;
    public String password;

    public String getUserId() {
        return null;
    }

    public char[] getPassword() {
        return null;
    }

    public void setId(int i) {
    }

    public void setUsername(String string) {
    }

    public void addAttribute(String user) {

    }
}
