package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CategoryDAO;
import com.test.entity.Category;
import com.test.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryDAO cdao;

	@Override
	public List<Category> findAll() {
		return cdao.findAll();
	}

}
