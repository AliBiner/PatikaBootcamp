package com.alibiner.Week3.MatrisTranspoze;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask the user to enter a row count of matrix
        System.out.print("Dizinin satır sayısını giriniz: ");
        int row = scanner.nextInt();

        // ask the user to enter a column count of matrix
        System.out.print("Dizinin sütun sayısını giriniz: ");
        int column = scanner.nextInt();

        // Instance an 2D array (matrix) by take input from user
        int[][] array = new int[row][column];

        // ask the user to fill value of 2D array(matrix)
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print( i + 1 + ". satır " + (j + 1) + ". sütun değerini giriniz. ");
                array[i][j] = scanner.nextInt();
            }
        }

        //Find the transpose of the 2D array (matrix)
        int [][] transpoze = new int[column][row];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                transpoze[i][j] = array[j][i];
            }
        }

        //Matrix output
        System.out.println("Matris: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose output
        System.out.println("Transpoze: ");
        for (int i = 0; i < transpoze.length; i++) {
            for (int j = 0; j < transpoze[i].length; j++) {
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
