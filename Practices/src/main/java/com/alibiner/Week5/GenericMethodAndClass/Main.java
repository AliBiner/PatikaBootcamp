package com.alibiner.Week5.GenericMethodAndClass;

public class Main {
    public static void main(String[] args) {
        Nullable<Integer> integerNullable = new Nullable<>(2020);
        System.out.println(integerNullable.isNull());

    }

    public static <T> void print(T[][] array){
        for (T[] row : array) {
            for (T column : row)
                System.out.print(column + " ");

            System.out.println();
        }
    }
}
