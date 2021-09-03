package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.test.dao.ProductDAO;
import com.test.entity.Product;
import com.test.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDAO pdao;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return pdao.findAll();
	}

	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return pdao.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(String cid) {
		// TODO Auto-generated method stub
		return pdao.findByCategoryId(cid);
	}

	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		return pdao.save(product);
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return pdao.save(product);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		 pdao.deleteById(id);
	}

	@Override
	public List<Product> findAvailable() {
		// TODO Auto-generated method stub
		return pdao.findAvailable();
	}

	@Override
	public Page<Product> findAvailable(Pageable pa) {
		// TODO Auto-generated method stub
		return pdao.findAvailable(pa);
	}

	@Override
	public List<Product> findByPrice(Double price) {
		// TODO Auto-generated method stub
		return pdao.findByPrice(price);
	}

	@Override
	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		return pdao.findByName(name);
	}

	

}
