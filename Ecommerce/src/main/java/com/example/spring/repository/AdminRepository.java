package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.model.Admin;

public interface AdminRepository extends JpaRepository<Admin , Integer> {

}
