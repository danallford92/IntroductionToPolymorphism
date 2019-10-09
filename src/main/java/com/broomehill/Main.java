package com.broomehill;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        ComposedGreeter greeter = new ComposedGreeter(new LowerCaseFormatter());

        greeter.greet();

//        UpperCaseGreeter upperCaseGreeter = new UpperCaseGreeter();
//        LowerCaseGreeter lowerCaseGreeter = new LowerCaseGreeter();
//
//        upperCaseGreeter.greet();
//        lowerCaseGreeter.greet();
    }
}
