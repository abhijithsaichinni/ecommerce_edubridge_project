package com.example.spring.service;

import java.util.List;

import com.example.spring.model.User;

public interface UserService {
	
	User save(User user);
	User getuser(int userid);
	List<User> getAllusers();
	void delete(int userid);
	
}
