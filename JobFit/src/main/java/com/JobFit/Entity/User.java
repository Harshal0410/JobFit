package com.JobFit.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@NotNull
	private String address;
	@Email
	private String email;
	
	private String phone;
	@NotNull
	private String password;
	
	private List<User> friends;
	@ManyToMany
	private List<Job> jobs;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, @NotNull String address, @Email String email, String phone, @NotNull String password) {
		super();
		this.userId = userId;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<User> getFriends() {
		return friends;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", address=" + address + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + ", friends=" + friends + "]";
	}
}
