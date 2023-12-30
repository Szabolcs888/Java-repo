package Exercises;

            /* 78.a Feladat (saját megoldás)
            Írjatok egy metódust, ami a paraméterként kapott szövegről, illetve a másik
            paraméterként kapott kifejezésről eldönti, hogy azzal a kifejezéssel kezdődik-e
            az adott szöveg vagy sem. Amennyiben igen, térjen vissza true-val, egyébként
            false-al.

            Hogy ki tudjuk próbálni a metódust, konzolról olvassunk be két értéket a
            main metódusban és hívjuk meg a készített metódust velük. */

import java.util.Scanner;

/*
        main();
            readFromUser();
            readFromUserSearchingText();
            searchingDecide();
            print();
*/

public class F78a_String_Contains_KeresesSzovegElejeben_FromUser {
    public static void main(String[] args) {
        String userString = readFromUser();
        String searchingString = readFromUserSearchingTextStart();
        boolean yON = searchingDecide(userString, searchingString);
        print(yON, searchingString);
    }

    public static String readFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérlek, írj be egy szöveget:");
        return scan.nextLine();
    }

    private static String readFromUserSearchingTextStart() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Írd be a szöveg elejével összehasonlítandó szövegrészt:");
        return scan.nextLine();
    }

    private static boolean searchingDecide(String userString, String searchingString) {
        return userString.startsWith(searchingString);
    }

    private static void print(boolean yON, String searchingString) {
        if (yON)
            System.out.println("A beírt szöveg eleje megegyezik a(z) \"" + searchingString + "\" keresőszóval.");
        else
            System.out.println(("A beírt szöveg eleje nem egyezik meg a(z) \"" + searchingString + "\" keresőszóval."));
    }
}