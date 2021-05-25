package com.dexter.camel.model.event;

import java.util.ArrayList;
import java.util.List;

public class Act {

    public Action action;
    public List<Parameter> parameters = new ArrayList<>();


    @Override
    public String toString() {
        return "Act{" +
                "action=" + action +
                ", parameters=" + parameters +
                '}';
    }
}
