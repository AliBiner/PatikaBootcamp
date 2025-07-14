package com.alibiner.StaticAndFinalVariable;

public class ShareStaticVariable {
    static int a= 0;

    public ShareStaticVariable() {
        a ++;
    }

    public void printCount(){
        System.out.println(a);
    }
}
