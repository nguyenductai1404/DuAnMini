package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.test.entity.Product;

public interface ProductService {

	List<Product> findAll();

	Product findById(Integer id);

	List<Product> findByCategoryId(String cid);

	Product create(Product product);

	Product update(Product product);

	void delete(Integer id);

	List<Product> findAvailable();

	Page<Product> findAvailable(Pageable pa);

	List<Product> findByPrice(Double price);

	List<Product> findByName(String name);

	
}
