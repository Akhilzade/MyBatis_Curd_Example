package com.ibatis.controller;

import com.ibatis.mapper.UserMapper;
import com.ibatis.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserController {

	@Autowired
	private UserMapper userMapper;

	@GetMapping("/all")
	public List<User> getAll() {
		return userMapper.findAll();
	}


	@PostMapping("/save")
	private List<User> update(User user) {

        user.setId(4);
		user.setName("Ram");
		user.setSalary(123778L);
		 userMapper.insert(user);
		 return  userMapper.findAll();

	}



}
