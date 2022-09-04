package com.example9.springbootjwt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "user_tbl")
public class User {
	@Id
	private int id;
	private String userName;
	private String password;
	private String email;
}
