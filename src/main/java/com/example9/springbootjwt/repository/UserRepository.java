package com.example9.springbootjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example9.springbootjwt.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
	User findByUserName(String username);

}
