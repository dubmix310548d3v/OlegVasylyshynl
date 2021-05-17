package com.dexter.camel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoEventRepository extends MongoRepository<MongoEvent, Long> {
}
