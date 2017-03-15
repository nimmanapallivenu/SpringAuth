package com.aspire.springboot.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aspire.springboot.auth.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
