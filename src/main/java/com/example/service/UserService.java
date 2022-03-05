package com.app.service;

import java.util.List;

import com.app.pojos.User;

public interface UserService {
	public List<User> getAllUsers();
	public User registerUser(User user);
	public User checkLogin(String email,String password);

}
