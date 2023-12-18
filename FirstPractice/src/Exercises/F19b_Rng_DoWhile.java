package Exercises;
/* 19.b Feladat (Órai)
Egy 21 fős csoportban ki kell választanunk két tanulót, aki
felelni fog. Random generátorok segítségével válasszuk ki
a két tanuló sorszámát a naplóban. (1-től indul a sorszámuk)
Használjunk do while ciklust az implementációhoz */

import java.util.Random;

public class F19b_Rng_DoWhile {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(1, 22);
        int randomNumber2 = random.nextInt(1, 22);

        do {
            randomNumber2 = random.nextInt(1, 22);
        } while (randomNumber == randomNumber2);

        System.out.println();
        System.out.println("A " + randomNumber + ". és a " + randomNumber2 + ". tanuló fog felelni.");

        // egyszerűsítés, hiszen a randomNumber2 mindenképp fog egyszer új értéket kapni
        /*

        Random random = new Random();
        int randomNumber = random.nextInt(1, 22);
        int randomNumber2;

        do {
            randomNumber2 = random.nextInt(1, 22);
        } while (randomNumber == randomNumber2);

        System.out.println();
        System.out.println("A " + randomNumber + ". és a " + randomNumber2 + ". tanuló fog felelni.");

        */
    }
}

