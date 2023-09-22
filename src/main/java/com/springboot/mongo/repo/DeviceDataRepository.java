package com.springboot.mongo.repo;

import com.springboot.mongo.model.DeviceData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceDataRepository extends MongoRepository<DeviceData,String> {
}
