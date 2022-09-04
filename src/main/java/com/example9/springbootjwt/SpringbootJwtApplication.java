package com.example9.springbootjwt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example9.springbootjwt.model.User;
import com.example9.springbootjwt.repository.UserRepository;

@SpringBootApplication
public class SpringbootJwtApplication {
	
	@Autowired
	private UserRepository repository;
	
	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
				new User(101, "user1", "password1", "user1@gmail.com"),
				new User(102, "user2", "password2", "user2@gmail.com"),
				new User(103, "user3", "password3", "user3@gmail.com")
		).collect(Collectors.toList());
		repository.saveAll(users);
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJwtApplication.class, args);
	}

}
