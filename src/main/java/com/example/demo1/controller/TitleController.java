package com.example.demo1.controller;

import com.example.demo1.entity.Title;
import com.example.demo1.entity.User;
import com.example.demo1.mapper.TitleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/title")
public class TitleController {
    @Autowired
    private TitleMapper titleMapper;
    @GetMapping("")
    public List<Title> index(){
        return titleMapper.findAll();
    }
    @PostMapping("/upload")
    private String upload(@RequestBody Title title){
        titleMapper.insert(title);
        return "上传成功";
    }
}
