package com.alibiner.Week3.SalaryCalculator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Employe employe = new Employe("Ali","Biner",2000,45, LocalDate.of(1985,1,1));


        System.out.println(employe.toString());

        System.out.println(employe.getFullName());

        Employe employe1 = new Employe("Okan","Erturan",100,2000,45,LocalDate.of(1985,1,1));

    }
}
