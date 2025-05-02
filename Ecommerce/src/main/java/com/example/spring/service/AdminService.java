package com.example.spring.service;

import com.example.spring.model.Admin;

public interface AdminService {
	
	Admin save(Admin admin);
	Admin getadmin(int adminid);
	void delete(int adminid);
	

}
