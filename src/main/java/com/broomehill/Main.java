package com.broomehill;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> namesToAge = new HashMap<>();

        namesToAge.put("Bob", 18);
        namesToAge.put("Fred", 99);
        namesToAge.put("Tom", 13);

        System.out.println(namesToAge);


        Map<Integer, String> agesToName = new HashMap<>();

        for(String name: namesToAge.keySet()){
            agesToName.put(namesToAge.get(name), name);
        }

//        for(String name: namesToAge.keySet()) {
//            int oldAge = namesToAge.get(name);
//            int newAge = oldAge+1;
//
//            namesToAge.put(name, newAge);
//        }
//
        System.out.println(agesToName);

        // ....

    }
}
