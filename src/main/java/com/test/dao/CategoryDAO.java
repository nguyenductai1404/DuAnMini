package com.test.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Category;


public interface CategoryDAO extends JpaRepository<Category, String>{

}
