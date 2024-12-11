package com.example.userapplicationspringboot.controller;


import com.example.userapplicationspringboot.model.User;
import com.example.userapplicationspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user/")
public class UserController {

    @Autowired
    private UserService userService;




    @GetMapping("/getAllUserService")
    public List<User> getAllUserService() {
        return userService.findAll();
    }

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }
}
