package com.test.service;

import java.util.List;

import com.test.entity.Account;
import com.test.entity.Product;

public interface AccountService {
	
	public Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();
	
	Account create(Account account);

	Account update(Account account);

	void delete(String username);


	public List<Account> findByName(String name);
	
	
}	
