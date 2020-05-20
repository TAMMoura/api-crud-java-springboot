package com.thiagomoura.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagomoura.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
