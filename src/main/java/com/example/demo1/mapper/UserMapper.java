package com.example.demo1.mapper;

import com.example.demo1.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM mytest.user;")
    List<User> findAll();
}
