package com.dexter.camel.model.event;

public class Parameter {

    public Field field;
    public String value;

    @Override
    public String toString() {
        return "Parameter{" +
                "field=" + field +
                ", value='" + value + '\'' +
                '}';
    }
}
