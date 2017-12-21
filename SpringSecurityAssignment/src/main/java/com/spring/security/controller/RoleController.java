package com.spring.security.controller;

import com.spring.security.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    RoleRepository roleRepository;

    @RequestMapping("/roles")
    public List getUsers() {
        return roleRepository.findAll();
    }
} 