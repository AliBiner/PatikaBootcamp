package com.alibiner.Week9.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        SheepManager sheepManager = new SheepManager();

        try {
            for (int i = 0; i < 25; i++) {
                service.submit(()->{
                    sheepManager.increment();
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            service.shutdown();
        }

        int a = 21;
        Integer b = 21;

        Integer number2 = null;
    }
}
