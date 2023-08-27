package com.spring.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.security.model.UserEntity;
import com.spring.security.repository.UserEntityRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserEntityRepository userEntityRepository;
    
    public Optional<UserEntity> findByEmail(String email){
        
        return userEntityRepository.findByEmail(email);

    }

    public void save(UserEntity user){

        userEntityRepository.save(user);

    }

}
