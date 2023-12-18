package Exercises;

            /* 35.c Feladat (Órai) (saját megoldás)
            Írjunk programot, amely előre meghatározott tojásárak
            között, kiszámolja mennyi a tojás átlagos ára. Kérdezzük
            meg a felhasználótól hány árat szeretne rögzíteni, majd
            pontosan annyi értéket kérjünk is el tőle és tároljuk le
            őket az eggPrices arraybe */

import java.util.Scanner;

public class F68_TojasAtlagar1c {
    public static void main(String[] args) {

        int mainEggsCounter = getNumberOfEggs();
        int[] MainEggsPrices = getFilledEggsArrayWithPrices(mainEggsCounter);
        // getCalculatedSum();
        //PrintCalculatedAvg();

    }

    public static int getNumberOfEggs() {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("How many eggs you want to sum?");
        int eggsCounter = scan.nextInt();
        return eggsCounter;
    }

    public static int[] getFilledEggsArrayWithPrices(int mainEggsCounter) {
        int[] eggPrices = new int[mainEggsCounter];

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Please give me " + mainEggsCounter + " eggprices:");

        for (int i = 0; i < eggPrices.length; i++) {
            eggPrices[i] = scan.nextInt();

        }return eggPrices;

    }


    //  public static void

    //  public static void

        /*

 int eggPricesSum = 0;
        for (int i = 0; i < eggPrices.length; i++) {
            eggPrices[i] = scan.nextInt();
            eggPricesSum = eggPricesSum + eggPrices[i];
        }


        }
        System.out.println();
        System.out.println("Eggprices Avg: " + eggPricesSum / eggPrices.length);

         */

}