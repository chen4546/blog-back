package com.example.demo1.controller;

import com.example.demo1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo1.entity.User;

//import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/login")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("")
    public List<User> index(){
        return userMapper.findAll();
    }
    @PostMapping("/user")
    public String insertUser(@RequestBody User user) {
        userMapper.insert(user);
        return "User inserted successfully";
    }
    @PutMapping("/password")
    public String updatePassword(@RequestBody Map<String, String> data) {
        String newPassword = data.get("newPassword");
        // 执行修改密码的逻辑
        return "Password updated successfully";
    }

    @PutMapping("/username")
    public String updateUsername(@RequestBody Map<String, String> data) {
        String newUsername = data.get("newUsername");
        // 执行修改用户名的逻辑
        return "Username updated successfully";
    }
}
