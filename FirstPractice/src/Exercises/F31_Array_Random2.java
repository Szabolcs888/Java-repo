package Exercises;

import java.util.Random;

        /* 31. Feladat (Órai) (Zsolt megoldása)
        Készítsünk egy tömböt, amiben 1-90-ig random számokat
        tárolunk, szám szerint 5-öt (lehetnek egyezőek). Majd
        írassuk is ki őket egysorban. */

public class F31_Array_Random2 {
    public static void main(String[] args) {

        // megoldás for-val

        Random random = new Random();
        int[] randomArrayNumber = new int[5];

        /* V1
        int randomNumber1 = random.nextInt(90) + 1;
        int randomNumber2 = random.nextInt(1, 90);
        int randomNumber3 = random.nextInt(90) + 1;
        int randomNumber4 = random.nextInt(90) + 1;
        int randomNumber5 = random.nextInt(90) + 1;

        randomArrayNumber[0] = randomNumber1;
        randomArrayNumber[1] = randomNumber2;
        randomArrayNumber[2] = randomNumber3;
        randomArrayNumber[3] = randomNumber4;
        randomArrayNumber[4] = randomNumber5;

        System.out.print(randomArrayNumber[0] + " ");
        System.out.print(randomArrayNumber[1] + " ");
        System.out.print(randomArrayNumber[2] + " ");
        System.out.print(randomArrayNumber[3] + " ");
        System.out.print(randomArrayNumber[4] + " ");
        */
        //V2
        int count = 0;
        while (count <= randomArrayNumber.length) {
            randomArrayNumber[count] = random.nextInt(1, 90);
            count++;
        }

        for (int i = 0; i < randomArrayNumber.length; i++) {
            System.out.println(randomArrayNumber[i]);
        }
    }
}