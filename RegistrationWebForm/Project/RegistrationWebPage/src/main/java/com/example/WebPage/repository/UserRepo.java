package com.example.WebPage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WebPage.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
