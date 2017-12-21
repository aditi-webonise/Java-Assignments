package com.spring.security.controller;

import com.spring.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/users")
    public List getUsers() {
        return userRepository.findAll();
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

} 