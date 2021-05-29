package com.dexter.camel.bean;

import com.dexter.camel.model.event.Event;
import com.dexter.camel.model.mongo.MongoEvent;
import com.dexter.camel.repository.mongo.MongoEventRepository;
import com.dexter.camel.util.XmlUtil;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventProcessor {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MongoEventRepository mongo;

    public void process(Exchange exchange) {
        log.info("Exchange : {}", exchange);

        MongoEvent mongoEvent = new MongoEvent();
        mongoEvent.event = exchange.getIn().getBody(String.class);
        mongo.save(mongoEvent);

        log.info("MongoEvent was successfully saved : {}", mongoEvent);
        exchange.getOut().setBody(XmlUtil.toXml(mongoEvent), String.class);
    }

}
