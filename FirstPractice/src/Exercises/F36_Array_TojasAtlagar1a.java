package Exercises;

            /* 35.a Feladat (Órai) (saját megoldás)
            Írjunk programot, amely előre meghatározott tojásárak
            között, kiszámolja mennyi a tojás átlagos ára. Az árak
            egy eggPrices array-ben kerülnek előzetesen megadásr a*/

public class F36_Array_TojasAtlagar1a {
    public static void main(String[] args) {

        float[] eggPrices = {5, -3, 0, 21, 55, 18, 32, 255, 42};

        System.out.print("Eggprices: ");
        float eggPricesSum = 0;
        for (int i = 0; i < eggPrices.length; i++) {
            System.out.print(eggPrices[i] + (", "));
            eggPricesSum = eggPricesSum + eggPrices[i];
        }
        System.out.println();
        System.out.println("Eggprices Avg: " + eggPricesSum / eggPrices.length);
    }
}