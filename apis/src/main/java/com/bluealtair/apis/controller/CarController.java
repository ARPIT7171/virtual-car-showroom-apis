package com.bluealtair.apis.controller;

import com.bluealtair.apis.data.entities.Car;
import com.bluealtair.apis.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/get-car")
    public ResponseEntity<Optional<Car>> getCar(String id) throws Exception {
        Optional<Car> result= Optional.ofNullable(carService.getCarById(id));
        return ResponseEntity.ok(result);
    }
    @GetMapping("/get-all-id")
    public ResponseEntity<List<Car>> getAllLeaveApplicationByUser() {
        List<Car> result = carService.getAllCars();
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("/add-car")
    public ResponseEntity<Car> createCar(@RequestBody Car car) throws Exception {
        Car result = carService.createCar(car);
//        List<Car> carList =
        return ResponseEntity.created(new URI("/api/add-car/" + result.getId()))
                .body(result);
    }
    @PutMapping("/update-car")
    public ResponseEntity<Car> updateCar(@RequestBody Car car) throws Exception {
        Car result = carService.createCar(car);
        return ResponseEntity.created(new URI("/api/add-car/" + result.getId()))
                .body(result);
    }
    @DeleteMapping("/delete-car")
    public ResponseEntity<Car> deleteCar(String id) {
        carService.delete(id);
        return ResponseEntity.noContent().build();
    }
}


//
