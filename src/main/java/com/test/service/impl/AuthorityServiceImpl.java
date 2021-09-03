package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.AccountDAO;
import com.test.dao.AuthorityDAO;
import com.test.entity.Account;
import com.test.entity.Authority;
import com.test.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService {
	@Autowired
	AuthorityDAO dao;
	@Autowired
	AccountDAO acdao;

	
	public List<Authority> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	
	public Authority create(Authority auth) {
		// TODO Auto-generated method stub
		return dao.save(auth);
	}

	
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = acdao.getAdministrators();
		return dao.authoritiesOf(accounts);
	}

}
