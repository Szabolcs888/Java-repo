package Exercises;

            /* 35.b Feladat (Órai) (saját megoldás)
            Írjunk programot, amely előre meghatározott tojásárak
            között, kiszámolja mennyi a tojás átlagos ára. Az árak
            a felhasználótól a console-ról kerülnek beolvasásra (5db). */

import java.util.Scanner;

public class F36_Array_TojasAtlagar1b {
    public static void main(String[] args) {

        float[] eggPrices = new float[5];

        System.out.println();
        System.out.println("What is the eggprice?");

        Scanner scan = new Scanner(System.in);
        System.out.println("Eggprices: ");

        float eggPricesSum =0;
        for (int i = 0; i < eggPrices.length; i++) {
            eggPrices[i] = scan.nextFloat();
            eggPricesSum = eggPricesSum + eggPrices[i];
        }
        System.out.println();
        System.out.println("Eggprices Avg: " + eggPricesSum / eggPrices.length);
    }
}