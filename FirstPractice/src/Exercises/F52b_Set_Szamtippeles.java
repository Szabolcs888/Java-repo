package Exercises;

            /* 52.b Feladat (saját megoldás)
            Írjatok egy tippelő játék programot. Töltsünk fel egy
            Set-et 3 darab random számmal. A számok 0 és 10 között
            lehetnek (0-val, de 10-el nem). A felhasználótól kérjünk
            be számokat hasonlóan 0 és 10 között és vizsgáljuk meg
            benne van-e a Set-ben. Amennyiben igen, vegyük ki belőle.
            Ha kiürült a Set, mert kivettünk belőle minden elemet,
            akkor vége a játéknak. Számoljuk, hogy hányszor kellett
            tippelnie a felhasználónak, majd írjuk ki: “Gratulálunk,
            X kör kellett a sikerhez”. Ha eltalált egy számot a
            felhasználó a játék során, akkor írja ki a program, hogy
            “Talált, még X szám, amit meg kell keresned”.  */

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class F52b_Set_Szamtippeles {
    public static void main(String[] args) {

        Set<Integer> randomNums = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(10);
            if (!randomNums.contains(randomNumber)) {
                randomNums.add(randomNumber);
            } else
                i--;
        }

        System.out.println("A játékban 0 és 9 közötti számokra kell tippelned mindaddig, amíg ki nem találod a gép által kisorsolt három számot!");
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        while (!randomNums.isEmpty()) {
            System.out.println();
            System.out.println("A tipped:");
            int userData = scan.nextInt();
            if (randomNums.contains(userData)) {
                randomNums.remove(userData);
                if (randomNums.size() > 0)
                    System.out.println("Talált! Már csak " + randomNums.size() + " számot kell eltalánod!");
                else {
                    System.out.println();
                    System.out.println("Gratulálok, " + counter + " kör kellett a győzelemhez!");
                }
            }
            counter++;
        }
    }
}
