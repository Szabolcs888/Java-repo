package Exercises;

            /* 62. Feladat (Tamás megoldása)
            Készítsetek egy getValidAgeFromConsole() metódust, amelyet
            a main metódusban meg tudunk hívni és visszaad egy helyes age-et
            integer-t amit a felhasználó a console-be írt. Akkor helyes egy
            age ha 0 és 140 között van (0 lehet, 140 nem). A metódus
            visszatérési értékét mentsük le egy age nevű változóba, majd
            írassuk ki a képernyőre annak tartalmát. */

import java.util.Scanner;

public class F62_Met_EletkorFilter2_DuplaReturn {
    public static void main(String[] args) {
        System.out.println(getValidAgeFromConsole());
        System.out.println(getValidAgeFromConsole());
        System.out.println(getValidAgeFromConsole2());
    }

    public static int getValidAgeFromConsole() {
        // beolvasás
        Scanner scanner = new Scanner(System.in);
        int ageFromUser = scanner.nextInt();
        //döntés

        if (ageFromUser >= 0 && ageFromUser < 140) {
            return ageFromUser;
        } else {
            return -1;
        }
    }

    public static String getValidAgeFromConsole2() {
        // beolvasás
        Scanner scanner = new Scanner(System.in);
        int ageFromUser = scanner.nextInt();
        //döntés

        if (ageFromUser >= 0 && ageFromUser < 140) {
            return ageFromUser + "";
        } else {
            return "hiba";
        }
    }
}
