package com.venu.springboot.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venu.springboot.auth.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
