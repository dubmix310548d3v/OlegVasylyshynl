package com.dexter.camel.model.mongo;

import org.springframework.data.annotation.Id;

public class MongoEvent {

    @Id
    public String id;

    public String json;

    public MongoEvent() {}

    public MongoEvent(String json) {
        this.json = json;
    }

    @Override
    public String toString() {
        return "MongoEvent{" +
                "id='" + id + '\'' +
                ", json='" + json + '\'' +
                '}';
    }
}
