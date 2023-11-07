package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;

@RestController
@RequestMapping("/User")
public class Usercontroller {
	
	public User userbooking(@RequestBody User user) {
		
		return user;
		
	}
	

}
