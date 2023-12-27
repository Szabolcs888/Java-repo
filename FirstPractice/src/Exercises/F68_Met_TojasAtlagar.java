package Exercises;

            /* 68. Feladat (saját megoldás)
            A 36. feladat metódusítása */

import java.util.Scanner;

/*
        main();
            getNumbersOfEggs();
            prizeSum();
            eggAveragePrice();
            averagePrint();
 */

public class F68_Met_TojasAtlagar {
    public static void main(String[] args) {
        int eggCount = getNumbersOfEggs();
        float[] prizeS = prizeSum(eggCount);
        float average = eggAveragePrice(prizeS, eggCount);
        averagePrint(average);
    }

    private static int getNumbersOfEggs() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("How many eggs you want to sum?");
        return scan.nextInt();
    }

    private static float[] prizeSum(int count) {
        float[] eggPrices = new float[count];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < eggPrices.length; i++) {
            System.out.println();
            System.out.println("Please give me " + (i + 1) + " eggprices:");
            eggPrices[i] = scan.nextFloat();
        }
        return eggPrices;
    }

    private static float eggAveragePrice(float[] prizes, int count) {
        float eggPricesSum = 0;
        float eggPrize = 0;
        for (int i = 0; i < prizes.length; i++) {
            eggPrize = prizes[i];
            eggPricesSum = eggPricesSum + eggPrize;
        }
        return eggPricesSum / count;
    }

    private static void averagePrint(float average) {
        System.out.println();
        System.out.println("Eggprices Avg: " + average);
    }
}