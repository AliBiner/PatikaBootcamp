package com.alibiner.Week5.Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> breadQueue = new LinkedList<>();

        breadQueue.add("Ahmet");
        breadQueue.add("Ali");
        breadQueue.add("Lütfiye");
        breadQueue.add("Yasin");
        breadQueue.add("Ecrin");

        System.out.println(breadQueue);

        System.out.println(breadQueue.size());

        System.out.println(breadQueue.element()); // first in value

        System.out.println(
                breadQueue.offer("Melisa")
        );

        System.out.println(breadQueue);

        System.out.println(breadQueue.peek()); // first in value

        System.out.println(breadQueue);

        System.out.println( breadQueue.poll()); // remove first in

        System.out.println(breadQueue);

    }
}
