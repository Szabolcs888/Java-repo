package Exercises;

import java.util.Scanner;

         /* 20.a Feladat (saját megoldás)
         Készítsetek egy életkor ellenőrző programot, amely
         bekéri a felhasználótól a használni kívánt életkort,
         majd ellenőrzi, hogy negatív számot (vagy 0-t) adott-e
         meg. Ismételjük mindaddig a bekérés utasítását, amíg
         helyes életkort nem adott meg a felhasználó.
         Használjunk while ciklust az implementációhoz. */

public class F20a_Eletkor_While {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Kérlek add meg az életkorod:");
        Scanner scanInt = new Scanner(System.in);
        int userAge = 0;

        while (userAge <= 0) {
            userAge = scanInt.nextInt();
            if (userAge <= 0) {
                System.out.println();
                System.out.println("Kérlek, valós számot adj meg:");
            }
        }
    }
}
