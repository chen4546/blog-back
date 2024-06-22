package com.example.demo1.mapper;

import com.example.demo1.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM mytest.user;")
    List<User> findAll();
    @Insert("INSERT INTO mytest.user (id, username, password, age) VALUES (#{id}, #{username}, #{password}, #{age})")
    void insert(User user);
}
