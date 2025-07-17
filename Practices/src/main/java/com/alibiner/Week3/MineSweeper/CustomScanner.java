package com.alibiner.Week3.MineSweeper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomScanner {
    Scanner scanner = new Scanner(System.in);

    // This method asks user to enter an integer value using a String label
    public int getPositiveIntWithRangeFromConsole(String text,int minRange, int maxRange) {
        try {
            System.out.println(text);
            int input = scanner.nextInt(); // read integer from user
            if (input<minRange || input>maxRange){
                System.out.println("Hatalı Giriş! Lütfen " + minRange + "(dahil) - " + maxRange + "(dahil) arasında bir değer giriniz.");
                input = getPositiveIntWithRangeFromConsole(text,minRange,maxRange); // recursive call
            }
            return input;
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getPositiveIntWithRangeFromConsole(text,minRange,maxRange); // recursive call
        }
        catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getPositiveIntWithRangeFromConsole(text,minRange,maxRange); // recursive call
        }
    }

    // This method asks user to enter an integer value using a String label
    public int getPositiveIntWithRangeFromConsole(String text,int minRange) {
        try {
            System.out.println(text);
            int input = scanner.nextInt(); // read integer from user
            if (input<minRange){
                System.out.println("Hatalı Giriş! Lütfen " + minRange + "'den büyük bir değer giriniz.");
                input = getPositiveIntWithRangeFromConsole(text,minRange); // recursive call
            }
            return input;
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getPositiveIntWithRangeFromConsole(text,minRange); // recursive call
        }
        catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getPositiveIntWithRangeFromConsole(text,minRange); // recursive call
        }
    }


}
