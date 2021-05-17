package com.dexter.camel;

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
        mongoEventRepository.save(new MongoEvent("test event"));
        return mongoEventRepository.findAll();
    }

}
