package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    // 這是一個註解
    // 這是第二個註解
    private final UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @PostMapping("/create")
    public void CreateUser(@RequestBody User user) {

    }

    @PutMapping("/{UserId}")
    public void UpdateUser(@RequestBody User user, @PathVariable("UserId")String UserId){

    }

    @DeleteMapping("/{UserId}")
    public void DeleteUser(@RequestBody User user){

    }

    @GetMapping("/{UserId}")
    public User GetUserDetail(@PathVariable("UserId")String UserId){
        return userMapper.getUserById(UserId);
    }

    @GetMapping("/all")
    public List<User> GetUserList(){
        return userMapper.getUserList();
    }
}