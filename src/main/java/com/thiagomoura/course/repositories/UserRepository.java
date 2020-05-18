package com.thiagomoura.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagomoura.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
