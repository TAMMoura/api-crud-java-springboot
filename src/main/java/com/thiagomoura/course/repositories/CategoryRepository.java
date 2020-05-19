package com.thiagomoura.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagomoura.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
