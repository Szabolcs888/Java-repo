package Exercises;

import java.util.Scanner;

            /* 35.c Feladat (Órai) (Zsolt megoldása)
            Írjunk programot, amely előre meghatározott tojásárak
            között, kiszámolja mennyi a tojás átlagos ára. Kérdezzük
            meg a felhasználótól hány árat szeretne rögzíteni, majd
            pontosan annyi értéket kérjünk is el tőle és tároljuk le
            őket az eggPrices arraybe */

public class F36_Array_TojasAtlagar2c {
    public static void main(String[] args) {

        //deklarációk
        Scanner sc = new Scanner(System.in);
        double eggPricesSum = 0;

        System.out.println("How many eggs you want to sum?");

        //deklarációk egy adott paraméterrel
        int numOfEggs = sc.nextInt();
        int[] eggPrices = new int[numOfEggs];

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
