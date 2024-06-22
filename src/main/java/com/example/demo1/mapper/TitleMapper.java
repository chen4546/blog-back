package com.example.demo1.mapper;
import com.example.demo1.entity.Title;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TitleMapper {
    @Select("SELECT * FROM mytest.user_title;")
    List<Title> findAll();
    @Insert("INSERT INTO mytest.user_title (title_id, id, content ) VALUES (  #{title_id},#{id}, #{content} )")
    void insert(Title user_title);
}
