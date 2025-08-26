package com.alibiner.Week3.StaticAndFinalVariable;

public final class Main {













//    public static void main(String[] args) {
//
//        // Static Değişken
//        System.out.println( StaticVariable.a); // output: 10
//        StaticVariable.increaseA();
//        System.out.println(StaticVariable.a); // output: 20
//
//        // Final Değişken - Reference tip olduğu için new anahtar kelimesi ile yeni bir nesne yaratmak gerekir.
//        FinalVariable finalVariable = new FinalVariable();
//        System.out.println(finalVariable.PI);
//        // finalVariable.PI = 3.14; // derleme hatası verir.
//
//        // Static Final Değişken - Referans tip olmadığı için new ile yeni nesne oluşturmadan sınıfın ismi ile kullanılır.
//        System.out.println(FinalVariable.FINAL_PI);
//        // FinalVariable.FINAL_PI = 3.14; // derleme hatası verir.
//
//        // Static değişken paylaşımı
//        ShareStaticVariable staticVariable = new ShareStaticVariable();
//        staticVariable.printCount();
//        ShareStaticVariable staticVariable1 = new ShareStaticVariable();
//        staticVariable1.printCount();
//
//        // Static metod
//        StaticMethod.printA();
//
//        // Static block
//        System.out.println(StaticBlock.a);
//        System.out.println(StaticBlock.a);
//
//        // Derived Final Method
//        Derived d = new Derived();
//        d.printMessage();
//
//        //Derived Final Class
//        DerivedToFinalClass derivedToFinalClass = new DerivedToFinalClass();
//        derivedToFinalClass.printMessage();
//
//        // Static Inner Class
//        StaticInnerClass.Inner inner = new StaticInnerClass.Inner();
//        inner.printMessage();
//
//        StaticInnerClass outer = new StaticInnerClass();
//        outer.printMessage();
//
//
//        // Ön Arttırma ve Azalatma Operatörü:
//        int x=10;
//        int y=++x;
//        System.out.println("x : 10 iken y=++x işleminden sonra y :" + y + " x: " + x );
//
//        // Sonrası Artış ve Azaltma Operatörü:
//        int i=5;
//        int j=i++;
//        System.out.println("i : 5 iken j=i++ dan sonra j :" +j +" i: " + i );
//
//        // Mantıksal Değil Operatörü:
//        boolean kosul=true;
//        System.out.println("Değil (!): "+!kosul);
//    }
}
