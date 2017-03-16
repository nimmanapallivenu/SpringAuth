package com.venu.springboot.auth.service;

import com.venu.springboot.auth.entity.User;

public interface UserService {

	public void save(User user);

	public User findByUsername(String username);
} 
