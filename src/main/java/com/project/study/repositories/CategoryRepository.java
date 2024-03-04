package com.project.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.study.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
