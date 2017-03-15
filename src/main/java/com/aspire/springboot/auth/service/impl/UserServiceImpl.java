package com.aspire.springboot.auth.service.impl;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.aspire.springboot.auth.entity.Role;
import com.aspire.springboot.auth.entity.User;
import com.aspire.springboot.auth.repository.RoleRepository;
import com.aspire.springboot.auth.repository.UserRepository;
import com.aspire.springboot.auth.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(new HashSet<Role>(roleRepository.findAll()));
		userRepository.save(user);

	}

	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
