package Exercises;

import java.util.Scanner;

            /* 35.b Feladat (Órai) (Zsolt megoldása)
            Írjunk programot, amely előre meghatározott tojásárak
            között, kiszámolja mennyi a tojás átlagos ára. Az árak
            a felhasználótól a console-ról kerülnek beolvasásra (5db). */

public class F36_Array_TojasAtlagar2b {
    public static void main(String[] args) {
        //deklarációk
        int[] eggPrices = new int[5];
        double eggPricesSum = 0;
        Scanner sc = new Scanner(System.in);

        //ciklus ami beolvassa az értékeket
        for (int i = 0; i < eggPrices.length; i++) {
            System.out.println("What is the price?");
            eggPrices[i] = sc.nextInt();
        }

        //ciklus ami összegez
        for (int i = 0; i < eggPrices.length; i++) {
            eggPricesSum = eggPricesSum + eggPrices[i];
        }

        System.out.println("Avg:" + (eggPricesSum / eggPrices.length));
    }
}