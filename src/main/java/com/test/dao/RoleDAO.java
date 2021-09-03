package com.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Role;

public interface RoleDAO extends JpaRepository<Role, String>{

}
