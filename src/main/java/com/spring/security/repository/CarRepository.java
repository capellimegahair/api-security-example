package com.spring.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.model.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Long>{
    
}
