package com.spring.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.security.model.CarEntity;
import com.spring.security.repository.CarRepository;

@Service
public class CarService {
    
    @Autowired
    private CarRepository carRepository;
    
    public List<CarEntity> findAll(){

        return carRepository.findAll();

    }

    public void delete(Long id){

        carRepository.deleteById(id);

    }

    public void save(CarEntity carDTO) {

        carRepository.save(carDTO);
    }

    public CarEntity findById(Long id){

        return carRepository.findById(id).get();

    }

}
