package com.alibiner.Week5.FindFrequencyWord;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Character,Integer> frequency = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String selectedSentence = scanner.nextLine();
        selectedSentence = selectedSentence.toLowerCase();

        for (int i = 0; i < selectedSentence.length(); i++) {
            Character letter = selectedSentence.charAt(i);
            if (!letter.equals(' ')){
                if (frequency.containsKey(letter)){
                    frequency.compute(letter,(key,val)-> ++val);
                }
                else {
                    frequency.put(letter,1);
                }
            }
        }

        for (Character letter : frequency.keySet()){
            System.out.println(letter + " = " + frequency.get(letter));
        }
    }
}
