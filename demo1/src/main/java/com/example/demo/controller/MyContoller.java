package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.model.User;

@RestController
public class MyContoller {
	
	@GetMapping("/home")
	public String getdata() {
		return "home";
	}
	
	@PostMapping("/user")
	public User postdata(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user);
		System.out.println(user.getAddress().getCity());

		return user;
		
	}
}
//alt+shift+r