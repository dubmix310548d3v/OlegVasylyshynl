package com.dexter.camel.model.event;

import java.util.ArrayList;
import java.util.List;

public class Event implements XmlAble{

    public List<Act> acts = new ArrayList<>();

    @Override
    public String toString() {
        return "Event{" +
                "acts=" + acts +
                '}';
    }
}
