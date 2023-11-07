package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private long Userid;
	
	private String name;
	
	private String email;
	
	private String phonenumber;
	

}
