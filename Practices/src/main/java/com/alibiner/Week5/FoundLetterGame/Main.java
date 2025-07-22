package com.alibiner.Week5.FoundLetterGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();

        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");

        System.out.println(letters);

        Scanner scanner = new Scanner(System.in);

        for (int letterIterator = 0; letterIterator < 4; letterIterator++){
            System.out.print("Bir harf giriniz: ");
            String selectedLetter = scanner.next();

            if (letters.contains(selectedLetter))
                letters.set(letterIterator,"found");
            else
                letters.add(selectedLetter);
        }

        System.out.println(letters);

    }
}
