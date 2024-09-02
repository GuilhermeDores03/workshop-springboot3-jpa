package com.projectwebsevice.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectwebsevice.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
