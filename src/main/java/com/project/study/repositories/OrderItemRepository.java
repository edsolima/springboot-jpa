package com.project.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.study.entities.OrderItem;
import com.project.study.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
}
