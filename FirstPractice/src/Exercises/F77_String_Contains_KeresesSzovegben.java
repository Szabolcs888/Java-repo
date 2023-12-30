package Exercises;

            /* 77. Feladat (Órai) (saját megoldás)
            Készítsünk egy metódust, amely a konzolról beolvas egy szöveget,
            majd a szintén beolvasott keresendő szövegről eldönti, hogy
            szerepel-e a szövegben. Amennyiben igen, térjen vissza true-val,
            egyébként false-al. */

import java.util.Scanner;

/*
        main();
            readFromUser();
            readFromUserSearchingText();
            searchingDecide();
            print();
*/

public class F77_String_Contains_KeresesSzovegben {
    public static void main(String[] args) {
        String userString = readFromUser();
        String searchingString = readFromUserSearchingText();
        boolean yON = searchingDecide(userString, searchingString);
        print(yON, searchingString);
    }

    public static String readFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérlek, írj be egy szöveget:");
        return scan.nextLine();
    }

    private static String readFromUserSearchingText() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Írd be a keresendő szövegrészt:");
        return scan.nextLine();
    }

    private static boolean searchingDecide(String userString, String searchingString) {
        return userString.contains(searchingString);
    }

    private static void print(boolean yON, String searchingString) {
        if (yON)
            System.out.println("A beírt szöveg tartalmazza a(z) " + searchingString + " kifejezést.");
        else
            System.out.println(("A beírt szöveg nem tartalmazza a(z) \"" + searchingString + "\" kifejezést."));
    }
}
