package com.example.ncp_practice.api;

import com.example.ncp_practice.entity.User;
import com.example.ncp_practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    public UserService userService;

    // 모든 사용자 조회
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // 사용자 생성
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}