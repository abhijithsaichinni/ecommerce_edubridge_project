package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.User;
import com.example.spring.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;

	public UserController(@Autowired UserService userservice) {
		super();
		this.userservice = userservice;
	}
	
	@PostMapping("/user")
	public User newUser(@RequestBody User user) {
		return userservice.save(user);
	}
	
	@GetMapping("/user/{userid}")
	public User getUser(@PathVariable int userid) {
		return userservice.getuser(userid);
	}
	
	@GetMapping("/users")
	public List<User> getAllUser() {
		return userservice.getAllusers();
	}
	
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return userservice.save(user);
	}
	
	@DeleteMapping("/user/{userid}")
	public void deleteUser(@PathVariable int userid) {
		userservice.delete(userid);
	}
	
	

}
