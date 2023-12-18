package Exercises;

import java.util.Random;

        /* 14. Feladat) (saját megoldás)
        Készítsetek programot, amely más lottóknak megfelelő
        potenciális nyerőszámokat is kiírja a képernyőre.
        Az ötöslottónak, a hatoslottónak és a skandináv lottónak. */

public class F14_Lotto2 {
    public static void main(String[] args) {

        //--------------Ötös lottó--------------

        Random random = new Random();

        int otos1 = random.nextInt(90) + 1;

        int otos2 = random.nextInt(90) + 1;
        while (otos2 == otos1) {
            otos2 = random.nextInt(90) + 1;
        }

        int otos3 = random.nextInt(90) + 1;
        while (otos3 == otos1 || otos3 == otos2) {
            otos3 = random.nextInt(90) + 1;
        }

        int otos4 = random.nextInt(90) + 1;
        while (otos4 == otos1 || otos4 == otos2 || otos4 == otos3) {
            otos4 = random.nextInt(90) + 1;
        }

        int otos5 = random.nextInt(90) + 1;
        while (otos5 == otos1 || otos5 == otos2 || otos5 == otos3 || otos5 == otos4) {
            otos5 = random.nextInt(90) + 1;
        }

        System.out.println();
        System.out.println("Az ötöslottó nyerőszámai: " + otos1 + ", " + otos2 + ", " + otos3 + ", " + otos4 + ", " + otos5);
        System.out.println();

        //--------------Hatos lottó--------------
        // ez a legkevésbé jó, mert a legerőforrásigényesebb, hiszen hiába csak egy while van, egy egyezés esetén is újrasorsolja az összes számot

        int number1 = random.nextInt(45) + 1;
        int number2 = random.nextInt(45) + 1;
        int number3 = random.nextInt(45) + 1;
        int number4 = random.nextInt(45) + 1;
        int number5 = random.nextInt(45) + 1;
        int number6 = random.nextInt(45) + 1;

        while (number2 == number1 ||
                number3 == number1 || number3 == number2 ||
                number4 == number1 || number4 == number2 || number4 == number3 ||
                number5 == number1 || number5 == number2 || number5 == number3 || number5 == number4 ||
                number6 == number1 || number6 == number2 || number6 == number3 || number6 == number4 || number6 == number5) {

            number1 = random.nextInt(45) + 1;
            number2 = random.nextInt(45) + 1;
            number3 = random.nextInt(45) + 1;
            number4 = random.nextInt(45) + 1;
            number5 = random.nextInt(45) + 1;
            number6 = random.nextInt(45) + 1;
        }

        System.out.println("A hatoslottó nyerőszámai: " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5 + ", " + number6);
        System.out.println();

        //--------------Skandináv lottó--------------
        // ez megegyezik az elsővel, csak átláthatóbb

        int ska1 = random.nextInt(35) + 1;
        int ska2 = random.nextInt(35) + 1;
        int ska3 = random.nextInt(35) + 1;
        int ska4 = random.nextInt(35) + 1;
        int ska5 = random.nextInt(35) + 1;
        int ska6 = random.nextInt(35) + 1;
        int ska7 = random.nextInt(35) + 1;

        while (ska2 == ska1) {
            ska2 = random.nextInt(35) + 1;
        }
        while (ska3 == ska1 || ska3 == ska2) {
            ska3 = random.nextInt(35) + 1;
        }
        while (ska4 == ska1 || ska4 == ska2 || ska4 == ska3) {
            ska4 = random.nextInt(35) + 1;
        }
        while (ska5 == ska1 || ska5 == ska2 || ska5 == ska3 || ska5 == ska4) {
            ska5 = random.nextInt(35) + 1;
        }
        while (ska6 == ska1 || ska6 == ska2 || ska6 == ska3 || ska6 == ska4 || ska6 == ska5) {
            ska6 = random.nextInt(35) + 1;
        }
        while (ska7 == ska1 || ska7 == ska2 || ska7 == ska3 || ska7 == ska4 || ska7 == ska5 || ska7 == ska6) {
            ska7 = random.nextInt(35) + 1;
        }

        System.out.println("A Skandináv lottó nyerőszámai: " + ska1 + ", " + ska2 + ", " + ska3 + ", " + ska4 + ", " + ska5 + ", " + ska6 + ", " + ska7);
        System.out.println();
    }
}
