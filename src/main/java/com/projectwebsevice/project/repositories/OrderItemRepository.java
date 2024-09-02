package com.projectwebsevice.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectwebsevice.project.entities.OrderItem;
import com.projectwebsevice.project.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
	
}
