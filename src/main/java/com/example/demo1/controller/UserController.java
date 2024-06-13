package com.example.demo1.controller;

import com.example.demo1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo1.entity.User;

//import javax.annotation.Resource;
import java.util.List;

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
}
