package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.RoleDAO;
import com.test.entity.Role;
import com.test.service.RoleService;
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleDAO dao;
	
	public List<Role> findAll() {
		return dao.findAll();
	}
}
