package com.bluealtair.apis.service;

import com.bluealtair.apis.data.entities.Car;
import com.bluealtair.apis.data.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }
    public Car getCarById(String id){
        Optional<Car> result = carRepository.findById(id);
        return result.get();
    }

    public Car createCar(Car car){
        return carRepository.save(car);
    }
    public Car updateCar(Car car){
        return carRepository.save(car);
    }
    public void delete(String id) {
        carRepository.deleteById(id);
    }

}
