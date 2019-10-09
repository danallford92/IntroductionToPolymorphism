package com.broomehill;

public class UpperCaseGreeter extends AbstractGreeter {


    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
