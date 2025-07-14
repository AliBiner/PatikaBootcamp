package com.alibiner.StaticAndFinalVariable;

public class StaticInnerClass {
    static class Inner{
        void printMessage(){
            System.out.println("Static Inner Class");
        }
    }

    void printMessage(){
        System.out.println("Outer Class");
    }
}
