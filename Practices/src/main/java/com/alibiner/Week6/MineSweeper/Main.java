package com.alibiner.Week6.MineSweeper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MineSweeper mineSweeper = new MineSweeper();
        String[] array = mineSweeper.calculateMineLocation();
        System.out.println(Arrays.toString(array));

        mineSweeper.fillMineSweeper();
        char[][] invisibleSweeper = mineSweeper.getInvisibleSweeper();
        mineSweeper.showMineSweeper(invisibleSweeper);
        System.out.println("---------------");
        String[][] visibleSweeper = mineSweeper.getVisibleSweeper();
        mineSweeper.showMineSweeper(visibleSweeper);

        mineSweeper.run();

    }
}
