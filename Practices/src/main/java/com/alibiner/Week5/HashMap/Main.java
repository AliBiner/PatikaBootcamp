package com.alibiner.Week5.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Ali",90);
        students.put("Ali",80);

        System.out.println(students.get("Ali"));
        System.out.println(students);

        students.remove("Ali");

        System.out.println(students.containsKey("Ali"));
        System.out.println(students);

    }
}
