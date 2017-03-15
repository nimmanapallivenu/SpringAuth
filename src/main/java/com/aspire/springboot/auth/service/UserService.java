package com.aspire.springboot.auth.service;

import com.aspire.springboot.auth.entity.User;

public interface UserService {

	public void save(User user);

	public User findByUsername(String username);
} 
