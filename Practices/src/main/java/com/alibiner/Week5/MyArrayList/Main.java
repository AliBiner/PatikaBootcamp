package com.alibiner.Week5.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>(3);

        System.out.println("-------------------");
        System.out.println("is empty: " + list.isEmpty());

        list.add("ali");
        list.add("deneme");
        list.add("ayşe");
        list.add("furkan");
        list.add("test");
        list.add("lütfiye");
        list.add("deneme");
        list.add("ecrin");

        System.out.println(list.toString());
        System.out.println("--------------");

        System.out.println("array size: "+ list.size());
        System.out.println("array capacity: " + list.getCapacity());

        System.out.println("------------");
        System.out.println("3th index value of array : " +  list.get(3));

        System.out.println("-------------");
        list.remove(3);
        System.out.println("remove 3th index: " + list );

        System.out.println("-------------------");
        System.out.println("index of test : "+ list.indexOf("ayşe"));

        System.out.println("-------------------");
        System.out.println("last index of deneme : "+ list.lastIndexOf("deneme"));

        System.out.println("-------------------");
        System.out.println("is empty: " + list.isEmpty());

        System.out.println("-------------------");
        System.out.println("Contains test: " + list.contains("test"));
        System.out.println("Contains a: " + list.contains("a"));


        System.out.println("-------------------------");
        System.out.println(list);
        System.out.println("list length: " + list.size());
        Object[] toArray = list.toArray();
        System.out.println("to array length: " + toArray.length);
        System.out.println("to array: " + Arrays.toString(toArray));

        System.out.println("------------------------");
        System.out.println("sublist" + list.sublist(3,5));



        System.out.println("-----------------");
        list.clear();
        System.out.println("clear list: " + list);

        ArrayList<String> list2 = new ArrayList<>();
    }
}
