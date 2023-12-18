package Exercises;

            /* 52.b Feladat (Zsolt megoldása)
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

public class F52b_Set_Szamtippeles2 {
    public static void main(String[] args) {
        // 1. Készítsünk egy 3 elemű halmazt amiben 3 véletlenszerűen generált szám van.
        // Vagyis ciklussal addig ISMÉTELJÜK a véletlen szám generálását, AMÍG a SET mérete 3 nem lesz
        Set<Integer> randomNumbers = new HashSet<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (randomNumbers.size() != 3) {
            int rndNumber = random.nextInt(0, 10);
            randomNumbers.add(rndNumber);
        }
        System.out.println("DEBUG: " + randomNumbers);
        // 2. A felhasználótól bekérünk egy számot és HA benne van a halmazban AKKOR eltávolítjuk
        // 3. A 2.-es pontot mindaddig ismételjük, AMÍG a halmaz NEM ÜRES lesz
        // 4. Iteráció számolására létrehozunk egy változót, amit egyesével növelünk amikor kell
        int round = 0;
        while (!randomNumbers.isEmpty()) {  // randomNumbers.size() != 0
            System.out.println("Add your guess: ");
            int guess = scanner.nextInt();
            if (randomNumbers.contains(guess)) {
                randomNumbers.remove(guess);
                if (randomNumbers.size() != 0)
                    System.out.println("Guess worked, you have left " + randomNumbers.size() + " numbers to guess.");
            }
            round++;
        }
        // 5. Kiírjuk a ciklus után “Gratulálunk..."
        System.out.println("Congrats, you needed " + round + " to complete the game.");

        // 6. A 2.-es pont HA feltételét bővítjük egy “Talált, még..." kiírással amikor eltávolítunk a SET-ből
    }
}
