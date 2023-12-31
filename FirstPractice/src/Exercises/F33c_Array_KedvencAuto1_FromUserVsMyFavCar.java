package Exercises;

            /* 33.c Feladat (Órai) (saját megoldás)
            Készítsetek egy programot, amelyben egy tömbnek már a
            létrehozásakor definiáljuk az értékeket. A String típusú
            array neve legyen carsArray és állítsunk be neki legalább
            7db autómárkát. Hozzunk létre egy myFavoriteCar nevű String
            változót és állítsuk be az egyik, tömbhöz is hozzáadott
            autómárkát, mint kezdőérték. Egy ciklussal menjünk végig az
            elemeken, azaz járjuk be a tömböt. Ha az adott indexű tömb
            elem megegyezik a myFavoriteCar változó értékével akkor írjuk
            ki annak értékét a konzolra és fűzzük hozzá, hogy “ a kedvenc
            autómárkám.”

            A feladat annyiban módosul, hogy a usertől kérjünk be
            utómárkákat, amit tömbbe mentünk. S ha valamelyik egyezik a
            kedvenc márkánkkal, akkor kiíratjuk. Ez 3 körig tart. "X"-el
            bármikor ki lehet lépni.

            Én annyival egészítettem még ki, hogy azt is kiíratjuk, ha
            nincs egyezés. Ezt csak listára való konvertálással sikerült
            megoldani */

import java.util.Scanner;

public class F33c_Array_KedvencAuto1_FromUserVsMyFavCar {
    public static void main(String[] args) {

        String[] userCarsArray = new String[3];

        String myFavoriteCar = "opel";
        Scanner scanString = new Scanner(System.in);

        System.out.println("Kérlek, tippeld meg a kedvenc autómárkám! Három lehetőséged van:");
        System.out.println();

        for (int i = 0; i < userCarsArray.length; i++) {
            System.out.println(i + 1 + ". tipp:");
            userCarsArray[i] = scanString.nextLine().toLowerCase();
            if (userCarsArray[i].equals("x")) {
                i = userCarsArray.length;
            }
        }

        int yOn = 0;
        for (int i = 0; i < userCarsArray.length && !userCarsArray[i].equals("x"); i++) {
            if (userCarsArray[i].equals(myFavoriteCar)) {
                System.out.println();
                System.out.println("Eltaláltad, az Opel a kedvenc autóm.");
                yOn += +1;
                break;
            }
        }
        if (yOn == 0) {
            System.out.println();
            System.out.println("Nem találtad el, legközelebb több szerencséd lesz.");
        }


    }
}









