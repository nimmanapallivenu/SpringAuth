package com.venu.springboot.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venu.springboot.auth.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
