package com.alibiner.Week5.StreamMaps;

import java.util.Iterator;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String,Integer> scores = new java.util.HashMap<>();

        scores.put("Ali", 85);

        scores.put("Ayşe", 92);

        scores.put("Mehmet", 78);

        scores.put("Zeynep", 90);

        scores.put("Burak", 88);

        // result is not sort by input queue
        for (String key : scores.keySet()){
            Integer value = scores.get(key);
            System.out.println(key + " " + value);
        }


    }
}
