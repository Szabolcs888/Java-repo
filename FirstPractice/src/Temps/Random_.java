package Temps;

import java.util.Random;

public class Random_ {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int randomNumber2 = random.nextInt(90) + 1;

        // int randomNumber = random.nextInt(100);   // a felső határérték sosem lesz kisorsolva
        // int randomNumber2 = random.nextInt(90) + 1; // így nem 0-89-ig, hanem 1-90-ig sorsol

        int maxNumber = 2;
        int randomNumber3 = random.nextInt(maxNumber) +1; // változóban is megadhatjuk a határértéket (és a +1 itt azt jelenti, hogy az eredmény 1 és 2 lesz.

        System.out.println(randomNumber);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);

        System.out.println();

        System.out.println(random.nextFloat(10)); // nem egész szám generálása
        System.out.println(random.nextDouble(10));
        System.out.println(random.nextInt(3, 34)); // határértékek megadása (ez esetben 3-tól 33-ig lesz sorsolva)
        System.out.println(random.nextBoolean());        // true/false generálása


    }
}
