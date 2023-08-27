package com.spring.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.model.UserEntity;

public interface UserEntityRepository extends JpaRepository<UserEntity,Long> {
    
    Optional<UserEntity> findByEmail(String email);

}
