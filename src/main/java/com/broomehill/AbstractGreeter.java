package com.broomehill;

public abstract class AbstractGreeter {

    public void greet() {
        System.out.println(format("Hello"));
    }

    public abstract String format(String text);
}
