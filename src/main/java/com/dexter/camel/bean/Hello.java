package com.dexter.camel.bean;

import com.dexter.camel.repository.mongo.MongoEventRepository;
import com.dexter.camel.model.mongo.MongoEvent;
import com.dexter.camel.model.sql.Some;
import com.dexter.camel.repository.sql.SomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("hello")
public class Hello {

    @Autowired
    private SomeRepository someRepository;
    @Autowired
    private MongoEventRepository mongoEventRepository;

    public Iterable<Some> process(){
        return someRepository.findAll();
    }

    public Iterable<MongoEvent> process2(){
//        mongoEventRepository.save(new MongoEvent("test event"));
        return mongoEventRepository.findAll();
    }

}
