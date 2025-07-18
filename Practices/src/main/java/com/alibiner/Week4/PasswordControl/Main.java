package com.alibiner.Week4.PasswordControl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Şifre giriniz: ");
        String password = scanner.nextLine();

        char firstLetter = password.charAt(0);
        char lastLetter = password.charAt(password.length()-1);

        if (password.length()<8)
            System.out.println("Geçersiz Şifre");
        else if (password.contains(" ")) 
            System.out.println("Geçersiz Şifre");
        else if (!Character.isUpperCase(firstLetter)) 
            System.out.println("Geçersiz Şifre");
        else if (!Character.valueOf('?').equals(lastLetter))
            System.out.println("Geçersiz Şifre");
        else
            System.out.println("Geçerli Şifre");
    }


}
