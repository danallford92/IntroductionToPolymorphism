package com.broomehill;

public class ComposedGreeter {

    TextFormatter formatter;

    public ComposedGreeter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void greet() {
        System.out.println(formatter.format("Hello"));
    }
}
