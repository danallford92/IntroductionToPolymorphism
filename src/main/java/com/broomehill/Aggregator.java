package com.broomehill;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aggregator {

    public static void main(String[] args) {
        Map<Integer, Integer> result = agg(List.of(1, 1, 1, 2, 2, 3, 3, 4, 10));

        System.out.println(result.get(1));
        System.out.println(result.get(2));
        System.out.println(result.get(3));
        System.out.println(result.get(4));
        System.out.println(result.get(10));

        System.out.println(result.get(1) == 3);
        System.out.println(result.get(2) == 4);
        System.out.println(result.get(3) == 6);
        System.out.println(result.get(4) == 4);
        System.out.println(result.get(10) == 10);
    }

    public static Map<Integer, Integer> agg(List<Integer> ints) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int currentValue: ints) {
            if(result.get(currentValue) == null) {
                result.put(currentValue, 0);
            }
            result.put(currentValue, currentValue + result.get(currentValue));
        }
        return result;
    }

    // [1, 2, 3, 2, 5, 2, 3] -> {1: 1, 2: 6, 3: 6, 5: 5}

}
