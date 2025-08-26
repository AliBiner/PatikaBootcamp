package com.alibiner.Week9.Threads;

public class SheepManager {
    private int count = 0;
    private int secondCount = 0;
    public void increment(){
        System.out.println("second count = " + (++secondCount));
        synchronized (this){
            System.out.println("first count= " + (++count));
        }
    }

}
