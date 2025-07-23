package com.alibiner.Week5.Wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        class A {}
//        class B extends A {}
//        class C extends B {}
//        class D extends C {}
        // extends okuma için kullanılır. ekleme yapılmaz çünkün child'ların hangisi ile işlem yapılacağı bilinmez.
        // bu yüzden runtime'da cast hatası veririr.
        // extends de belirtilen sınıf ve alt sınıfları üzerinden okuma yapılabilir.

        //Yazma örneği:
//        List<? extends B> upperBounded = new ArrayList<D>();
//        upperBounded.add(new A());
//        upperBounded.add(new B());
//        upperBounded.add(new C());
//        upperBounded.add(new D());
//
//        //Okuma Örneği : B'den extends edildiği için B,C,D üzerinden okuma işlemi yapılabilir. A parent olduğu için
//        // işlem yapılamaz.
//
//        for (B b : upperBounded){
//            System.out.println(b);
//        }

        //Super yazmak(eklemek) için kullanılır. okuma yapılmaz çünkü B ve parentleri üzerinden işlem yapılır.
        // parent'ların obje tipleri farklı olduğu için içindeki değeri okuyup yazamaz. Bu nedenle okuma yapılması
        // için super ile oluşturulan dizinin elemanlarını "Object" tipinde bir değişkene atamak gerekir. Çünkü
        // java'da her class object sınıfından üretilmektedir.

        //Kalıtım (Inheritance)'da bir parent'dan kalıtım alındığında bazı ana methodların override edilmesi gerekir.
        // Örneğin toString. bir class oluşturduğunuzda toString methodunu override etmezsek console'a yazdıramayız.

        //Örneğin A sınıfımız var. bu class'da toString methodunu override ettik ve içinde class'ın adını yazdırdık.
        // A.toString() yaptığımzıda console'a class adı olan A yazar.

        //B classını A clasından extends ettiğimizde A class'ının özellikleri alır ama halen override etmediğimiz
        // methodları B class'ı için kullanamayız. Bu nedenle B class'ında da toString'i override edelim ve yine
        // class adını yazdıralım.
        // B.toString() yaptığımızda console'a B yazar. çünkü A'dan kalıtım alsa da override ettiğimiz için A'nın
        // toString'ni bu senaryo için devre dışı bıraktık.

        // Super deyimi de belirtmiş olduğumuz sınıf ve üst sınıfları üzerinde bir kontrol sağlamaktadır.. Bu nedenle
        // hangi sınıfın toString'ni kullanacağını bilemez. Bu yüzden tüm class'ların babası olan Object class'ına
        // cast ederek. okuma işlemi yapabiliriz.

        List<? super B> lowerBounded = new ArrayList<B>();

        //lowerBounded.add(new A());
        lowerBounded.add(new B());
        lowerBounded.add(new C());
        lowerBounded.add(new D());
//
//        C c = lowerBounded.get(3);
//
//        for (D object : lowerBounded){
//            System.out.println(object.toString());
//        }
    }
}
