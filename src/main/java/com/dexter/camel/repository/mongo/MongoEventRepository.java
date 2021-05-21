package com.dexter.camel.repository.mongo;

import com.dexter.camel.model.mongo.MongoEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoEventRepository extends MongoRepository<MongoEvent, Long> {
}
