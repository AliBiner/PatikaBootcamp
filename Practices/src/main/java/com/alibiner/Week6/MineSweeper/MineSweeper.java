package com.alibiner.Week6.MineSweeper;

import java.util.Arrays;
import java.util.Random;

public class MineSweeper {
    private int sweeperRowCount;
    private int sweeperColumnCount;
    private int mineCount;
    private char[][] invisibleSweeper;
    private CustomScanner scanner;
    private String[] mineLocation;
    private String[][] visibleSweeper;
    private int unopenedCount;
    private boolean isWin=false;

    public MineSweeper() {
        this.scanner = new CustomScanner();
        setSweeperRowCount();
        setSweeperColumnCount();
        setEmptySweeper();
        setMineCount();
        calculateMineLocation();
        setVisibleSweeper();
        setUnopenedCount();
    }

    public String[] calculateMineLocation() {
        this.mineLocation = new String[mineCount];
        Random random = new Random();
        for (int i = 0; i < mineLocation.length; i++) {
            mineLocation[i] = String.valueOf(random.nextInt(sweeperRowCount)).concat(String.valueOf(random.nextInt(sweeperColumnCount)));
            int whileIndex = 0;
            while (whileIndex < mineLocation.length) {
                if (i == whileIndex) whileIndex++;
                else if (mineLocation[i].equals(mineLocation[whileIndex])) {
                    mineLocation[i] = String.valueOf(random.nextInt(sweeperRowCount)).concat(String.valueOf(random.nextInt(sweeperColumnCount)));
                    whileIndex = 0;
                } else {
                    whileIndex++;
                }
            }
            if (mineLocation[i].length() < 2) {
                mineLocation[i] = "0" + mineLocation[i];
            }
        }
        Arrays.sort(mineLocation);
        return mineLocation;
    }

    private void setSweeperRowCount() {
        this.sweeperRowCount = scanner.getPositiveIntWithRangeFromConsole("Satır sayısı giriniz : ", 2);
    }

    private void setSweeperColumnCount() {
        this.sweeperColumnCount = scanner.getPositiveIntWithRangeFromConsole("Sütun Sayısı giriniz : ", 2);
    }

    private void setMineCount() {
        this.mineCount = (sweeperColumnCount * sweeperRowCount) / 4;
    }

    public void setEmptySweeper() {
        this.invisibleSweeper = new char[sweeperRowCount][sweeperColumnCount];
    }

    private void setVisibleSweeper() {
        this.visibleSweeper = new String[sweeperRowCount][sweeperColumnCount];
        for (int i = 0; i < visibleSweeper.length; i++) {
            for (int j = 0; j < visibleSweeper[i].length; j++) {
                visibleSweeper[i][j] = "-";
            }
        }
    }

    private void setUnopenedCount() {
        this.unopenedCount = (sweeperRowCount*sweeperColumnCount) - mineCount;
    }

    public char[][] getInvisibleSweeper() {
        return invisibleSweeper;
    }

    public String[][] getVisibleSweeper() {
        return visibleSweeper;
    }

    public void fillMineSweeper() {
        if (mineLocation == null)
            System.out.println("Mayın konumları bulunamadı. Lütfen mayın konumlarını hesaplayın.");
        else {
            for (int i = 0; i < invisibleSweeper.length; i++) {
                String convertedXAxis = String.valueOf(i);
                for (int j = 0; j < invisibleSweeper[i].length ; j++) {
                    String convertedYAxis = String.valueOf(j);
                    String xYAxis = convertedXAxis + convertedYAxis;
                    for (String value : mineLocation){
                        if (xYAxis.equals(value)){
                            invisibleSweeper[i][j] = '*';
                            break;
                        }
                        else
                            invisibleSweeper[i][j] = '-';
                    }
                }
            }
        }
    }

    public void showMineSweeper(char[][] mineSweeper) {
        for (int i = 0; i < mineSweeper.length; i++) {
            for (int j = 0; j < mineSweeper[i].length; j++) {
                System.out.print(mineSweeper[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void showMineSweeper(String[][] mineSweeper) {
        for (int i = 0; i < mineSweeper.length; i++) {
            for (int j = 0; j < mineSweeper[i].length; j++) {
                System.out.print(mineSweeper[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isMineHere(String location) {
        for (String value : mineLocation) {
            if (location.equals(value)){
                isWin = false;
                return true;
            }
        }
        return false;
    }

    public int areThereMinesAround(int x, int y) { //1,2
        int mineCountAround = 0;
        for (int j = x - 1; j <= x + 1; j++) {
            for (int k = y - 1; k <= y + 1; k++) {
                String convertedXYtoString = String.valueOf(j).concat(String.valueOf(k));
                for (String value : mineLocation){
                    if (value.equals(convertedXYtoString))
                        mineCountAround++;
                }
            }
        }
        return mineCountAround;
    }

    public void run(){
        String xyLocation;
        int xAxis;
        int yAxis;
        do {
             xAxis = scanner.getPositiveIntWithRangeFromConsole("Açmak istediğiniz satır numarasını giriniz : ",0,
                    sweeperRowCount) -1;
             yAxis = scanner.getPositiveIntWithRangeFromConsole("Açmak istediğiniz sütun numarasını giriniz : ",0,
                    sweeperColumnCount) -1;
            String convertedXAxis = String.valueOf(xAxis);
            String convertedYAxis = String.valueOf(yAxis);
            xyLocation = convertedXAxis + convertedYAxis;
            if (!isOpened(xAxis,yAxis)){
                openIndex(xAxis,yAxis);
                unopenedCount--;
                showMineSweeper(visibleSweeper);
            }
            else {
                System.out.println("Bu konum açılmıştır. Başka bir konum giriniz.");
            }
        }while (!isMineHere(xyLocation) && !isWin());
        if (isWin())
            System.out.println("Kazandınız!");
        else
            System.out.println("Kaybettiniz!");

    };

    public boolean isWin(){
        if (unopenedCount<=0) {
            isWin = true;
            return true;
        }
        else
            return false;
    }

    public void openIndex(int x, int y){
        if (!isOpened(x,y)){
            int mineCountAround = areThereMinesAround(x,y);
            visibleSweeper[x][y] = String.valueOf(mineCountAround);
        }
        else
            System.out.println("Bu konum açılmıştır. Başka bir konum giriniz.");
    }

    public boolean isOpened(int x, int y){
        return visibleSweeper[x][y].equals("-") ? false : true;
    }
}
