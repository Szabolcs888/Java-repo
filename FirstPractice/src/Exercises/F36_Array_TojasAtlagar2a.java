package Exercises;

            /* 35.a Feladat (Órai) (Zsolt megoldása)
            Írjunk programot, amely előre meghatározott tojásárak
            között, kiszámolja mennyi a tojás átlagos ára. Az árak
            egy eggPrices array-ben kerülnek előzetesen megadásra */

public class F36_Array_TojasAtlagar2a {
    public static void main(String[] args) {
        //deklarációk
        int[] eggPrices = {5, -3, 0, 21, 55, 18, 32, 255, 42};

        double eggPricesSum = 0;

        //ciklus ami bejárja a tömböt
        for (int i = 0; i < eggPrices.length; i++) {
            // eggPricesSum += eggPrices[i];
            eggPricesSum = eggPricesSum + eggPrices[i];
        }

        System.out.println("Avg:" + (eggPricesSum / eggPrices.length));
    }
}
