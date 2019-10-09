package com.broomehill;

public class LowerCaseGreeter extends AbstractGreeter {


    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
