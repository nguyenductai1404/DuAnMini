package com.test.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.entity.Product;



public interface ProductDAO extends JpaRepository<Product, Integer> {
	

	
//	@Query("SELECT a FROM Product a WHERE a.category.id LIKE ?1")
//	Page<Product> timTheoLoai(String tu, Pageable p);


	@Query("SELECT p FROM Product p WHERE p.category.id=?1 and p.available=true")
	List<Product> findByCategoryId(String cid);
	
	@Query("SELECT p FROM Product p WHERE p.available=true")
	List<Product> findAvailable();

	@Query("SELECT p FROM Product p WHERE p.available=true")
	Page<Product> findAvailable(Pageable pa);

	@Query("SELECT p FROM Product p WHERE p.price=?1")
	List<Product> findByPrice(Double price);
	@Query("SELECT p FROM Product p WHERE p.name LIKE ?1")
	List<Product> findByName(String name);

	
	

}
