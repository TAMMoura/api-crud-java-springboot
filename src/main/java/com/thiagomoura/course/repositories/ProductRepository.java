package com.thiagomoura.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagomoura.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
