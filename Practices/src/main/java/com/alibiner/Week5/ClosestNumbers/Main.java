package com.alibiner.Week5.ClosestNumbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Initial Arraylist
        ArrayList<Integer> array = getIntegers();

        //Output initial arraylist
        System.out.println("Arraylist: " + array);
        System.out.println("---------------");


        //Calculate distance of 2 numbers from each other
        int firstClosestNumber = 0;
        int secondClosestNumber = 0;
        int distanceFromEachOther = Integer.MAX_VALUE;
        for (Integer outerIndex : array){
            for (Integer innerIndex : array){
                int tmpDistance = Math.abs(innerIndex - outerIndex);
                if (tmpDistance<distanceFromEachOther && tmpDistance!=0){
                    distanceFromEachOther = tmpDistance;
                    firstClosestNumber = outerIndex;
                    secondClosestNumber = innerIndex;
                }
            }
        }
        System.out.println(Math.min(firstClosestNumber,secondClosestNumber) + " ile " + Math.max(firstClosestNumber,secondClosestNumber) + " arasındaki mesafe: " + distanceFromEachOther);
    }

    private static ArrayList<Integer> getIntegers() {
        ArrayList<Integer> array = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int tmp = random.nextInt(101);
            array.add(tmp);
            for (int j = 0; j < array.size(); j++){
                if (i!=j){
                    if (array.get(i).equals(array.get(j))){
                        array.remove(i);
                        tmp = random.nextInt(101);
                        array.add(tmp);
                    }
                }
            }
        }
        return array;
    }
}
