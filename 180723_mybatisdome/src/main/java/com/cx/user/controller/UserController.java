package com.cx.user.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cx.user.model.User;
import com.cx.user.service.UserService;

@RestController("/user")
public class UserController {
	
	@Autowired
	private UserService service ;
	
	@PostMapping("/createUser")
	public String createUser() {
		User userModel = new User();
		userModel.setAge(1);
		userModel.setCreateTime(new Date().getTime());
		userModel.setUserName("作者");
		service.createUser(userModel);
		return "SUCCESS";
	}
}
