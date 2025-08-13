package com.alibiner.Week7.Functional_Interface;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        MathOperations sum = Integer::sum;
        MathOperations multiply = (a,b)-> a*b;

        System.out.println(sum.operate(2,3));

    }
}
