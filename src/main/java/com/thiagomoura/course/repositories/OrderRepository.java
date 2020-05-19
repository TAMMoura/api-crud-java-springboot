package com.thiagomoura.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagomoura.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
