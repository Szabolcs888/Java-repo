package Exercises;

            /* 68. Feladat (Zsolt megoldása)
            A 36. feladat metódusítása */

import java.util.Scanner;

public class F68_Met_TojasAtlagar2 {
    // Exercise36c újraírása metódusok használatával
    public static void main(String[] args) {
        int eggCount = getNumberOfEggs();
        int[] eggArray = getFilledEggsArrayWithPrices(eggCount);
        int eggSum = getCalculatedSum(eggArray);
        printCalculatedAvg(eggSum, eggCount);
    }

    public static int getNumberOfEggs(){
        System.out.println("How many eggs you want to sum?");
        Scanner sc = new Scanner(System.in);
        //deklarációk egy adott paraméterrel
        int numOfEggs = sc.nextInt();
        return numOfEggs;
    }

    public static int[] getFilledEggsArrayWithPrices(int eggCount){
        //int eggCount = eggCount;
        int[] eggPrices = new int[eggCount];
        Scanner sc = new Scanner(System.in);
        //ciklus ami beolvassa az értékeket
        for (int i = 0; i < eggPrices.length; i++) {
            System.out.println("What is the price?");
            eggPrices[i] = sc.nextInt();
        }
        return eggPrices;
    }

    public static int getCalculatedSum(int[] arrayWithEggs){
        // int[] arrayWithEggs = eggArray;
        int eggPricesSum = 0;
        //ciklus ami összegez
        for (int i = 0; i < arrayWithEggs.length; i++) {
            eggPricesSum = eggPricesSum + arrayWithEggs[i];
        }
        return eggPricesSum;
    }

    public static void printCalculatedAvg(int sum, int eggCount){
        double eggSum = sum;  //átalakítjuk az int értéket double-é, hogy a törtértéket is lássuk
        System.out.println("Avg:" + (eggSum / eggCount));
    }
}