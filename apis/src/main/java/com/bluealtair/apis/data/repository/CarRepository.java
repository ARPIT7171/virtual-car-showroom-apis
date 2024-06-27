package com.bluealtair.apis.data.repository;

import com.bluealtair.apis.data.entities.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends MongoRepository<Car,String>{
    @Query(value = "{'user_id': ?0}")
    List<Car> findAllLeavesByUserId(String userId);
}

