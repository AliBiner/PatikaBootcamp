package com.alibiner.Week5.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> students = new TreeMap<>();

        students.put("Melisa",90);
        students.put("Ali",80);
        students.put("Ali",70);

        System.out.println(students);
    }
}
