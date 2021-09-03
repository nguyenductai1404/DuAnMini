package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.test.dao.AccountDAO;
import com.test.entity.Account;
import com.test.entity.Product;
import com.test.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDAO adao;
	
	@Autowired
	BCryptPasswordEncoder pe;

	@Override
	public Account findById(String username) {
		// TODO Auto-generated method stub
		return adao.findById(username).get();
	}


	public List<Account> getAdministrators() {
		return adao.getAdministrators();
	}


	public List<Account> findAll() {
		return adao.findAll();
	}
	

	public Account create(Account account) {
		return adao.save(account);
	}


	public Account update(Account account) {
		// TODO Auto-generated method stub
		return adao.save(account);
	}


	public void delete(String username) {
		// TODO Auto-generated method stub
		adao.deleteById(username);
	}


	@Override
	public List<Account> findByName(String name) {
		// TODO Auto-generated method stub
		return adao.findByName(name);
	}
}
