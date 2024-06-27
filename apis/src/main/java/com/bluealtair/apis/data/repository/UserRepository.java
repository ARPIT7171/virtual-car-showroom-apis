package com.bluealtair.apis.data.repository;

import com.bluealtair.apis.data.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,Long>{

}