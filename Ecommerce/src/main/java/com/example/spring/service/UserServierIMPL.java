package com.example.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.model.User;
import com.example.spring.repository.UserRepository;

@Service
public class UserServierIMPL implements UserService {

@Autowired
private final UserRepository userrepository;


	public UserServierIMPL(@Autowired UserRepository userrepository) {
	super();
	this.userrepository = userrepository;
}

	@Override
	public User save(User user) {
		return userrepository.save(user);
	}

	@Override
	public User getuser(int userid) {
		
		Optional<User>user = userrepository.findById(userid);
			if(user!=null && user.isPresent()) {
				
				return user.get();
				
			}
		
		return null;
	}

	@Override
	public List<User> getAllusers() {
		
		return userrepository.findAll();
	}

	@Override
	public void delete(int userid) {
		
		userrepository.deleteById(userid);

	}

}
