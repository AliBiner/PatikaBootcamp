package com.alibiner.Week5.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> students =  new LinkedHashMap<>();

        students.put("Melisa",90);
        students.put("Ali",80);
        students.put("Ali",70);

        System.out.println(students);
    }
}
