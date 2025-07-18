package com.alibiner.Week4.SalaryCalculator;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Employe employe1 = null;
        try {
            Employe employe = new Employe("Ali","Biner",2000,45, LocalDate.of(1985,1,1));


            System.out.println(employe.toString());

            System.out.println(employe.getFullName());

            employe1 = new Employe("Okan","Erturan",100,-200,45,LocalDate.of(1985,1,1));

            System.out.println(employe1.toString());

            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }catch (IllegalArgumentException e){
            System.out.println("Nesne oluşturulamadı. Hata Mesajı: " + e.getMessage());
        }

        System.out.println(employe1.toString());




    }
}
