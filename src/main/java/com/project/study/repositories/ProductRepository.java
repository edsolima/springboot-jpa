package com.project.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.study.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
