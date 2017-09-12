package com.cihangirmercan;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity // This tells Hibernate to make a table out of this class
public class User {
	@Id
	@NotBlank(message = "Username is null!")
	private String username;
	
	@NotBlank(message = "E-mail is null!")
	@Email(message = "Invalid E-mail!")
	private String email;
	
	@NotBlank(message = "Password is null!")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}