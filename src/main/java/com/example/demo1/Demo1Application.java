package com.example.demo1;

import com.example.demo1.entity.User;
import com.example.demo1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@SpringBootApplication
public class Demo1Application {





	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "ok";
	}
}
