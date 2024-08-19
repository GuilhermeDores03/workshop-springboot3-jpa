package com.projectwebsevice.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectwebsevice.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
