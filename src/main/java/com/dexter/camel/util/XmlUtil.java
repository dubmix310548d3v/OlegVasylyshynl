package com.dexter.camel.util;

import com.dexter.camel.model.event.*;
import com.dexter.camel.model.mongo.MongoEvent;
import com.thoughtworks.xstream.XStream;

public class XmlUtil {

    private static final XStream xStream = new XStream();

    static {
        xStream.alias("event", Event.class);
        xStream.alias("act", Act.class);
        xStream.alias("parameter", Parameter.class);
        xStream.useAttributeFor(Parameter.class, "field");
        xStream.useAttributeFor(Parameter.class, "value");
        xStream.alias("MongoEvent", MongoEvent.class);
    }

    public static String toXml(XmlAble xmlAble) {
        return xStream.toXML(xmlAble);
    }

    public static<T> T getObject(String xml, Class<T> clazz) {
        return (T) xStream.fromXML(xml);
    }

    public static void main(String[] args) {
        Event event = new Event();
        Act act = new Act();
        act.action = Action.CREATE_USER;
        Parameter parameter = new Parameter();
        parameter.field = Field.NAME;
        parameter.value = "DEXTER";
        act.parameters.add(parameter);
        event.acts.add(act);


        String s = toXml(event);
        System.out.println(s);
        System.out.println(getObject(s, Event.class));
    }

}
