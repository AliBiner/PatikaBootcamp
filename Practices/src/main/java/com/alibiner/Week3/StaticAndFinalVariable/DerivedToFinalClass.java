package com.alibiner.StaticAndFinalVariable;

// Compile Error: Cannot inherit from final Test
public class DerivedToFinalClass //extends FinalClass
{
    void printMessage() {
        System.out.println("Hello World Overridden");
    }
}
