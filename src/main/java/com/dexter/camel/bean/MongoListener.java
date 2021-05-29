package com.dexter.camel.bean;

import com.dexter.camel.model.mongo.MongoEvent;
import com.dexter.camel.util.XmlUtil;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MongoListener {

    private final Logger log = LoggerFactory.getLogger(this.getClass());


    public void process(Exchange exchange){
        String xml = exchange.getIn().getBody(String.class);
        log.info("Body : {}", xml);

        MongoEvent mongoEvent = XmlUtil.getObject(xml, MongoEvent.class);
        log.info("Was received mongoEvent : {}", mongoEvent);

        // save in H2 database
    }

}
