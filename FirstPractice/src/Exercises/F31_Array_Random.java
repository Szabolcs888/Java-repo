package Exercises;

import java.util.Random;

        /* 31. Feladat (Órai) (saját megoldás)
        Készítsünk egy tömböt, amiben 1-90-ig random számokat
        tárolunk, szám szerint 5-öt (lehetnek egyezőek). Majd
        írassuk is ki őket egysorban. */

public class F31_Array_Random {
    public static void main(String[] args) {

        // megoldás for-val

        Random random = new Random();

        int[] randomArray = new int[5];
        for (int i = 0; i < randomArray.length; i++) {
            int randomNumber = random.nextInt(90) + 1;
            randomArray[i] = randomNumber;
        }

        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + " ");
        }

        System.out.println();


        // megoldás while-val

        int i = 0;
        while (i < randomArray.length) {
            int randomNumber = random.nextInt(90) + 1;
            randomArray[i] = randomNumber;
            i++;
        }

        i = 0;
        while (i < randomArray.length) {
            System.out.print(randomArray[i] + " ");
            i++;
        }
    }
}
