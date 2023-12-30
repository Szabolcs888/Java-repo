package Exercises;

            /* 79. Feladat (Órai) (saját megoldás)
            Tételezzük fel, hogy valamit választania kell a felhasználónak a,b,c lehetőség
            közül. Készítsünk olyan metódust, amely ezt a konzolról beolvasott értéket feldolgozza
            és csak az első karaktert adja vissza, mint felhasználói választás. Elkerülve, hogy a
            felhasználó pontot, zárójelet, szóközt vagy bármi mást ír véletlenül az opciója után. */

import java.util.Scanner;

/*
        main();
            readFromUser();
            checkAndTransform();
            print();
*/

public class F79_String__Substring_SzoEleje {
    public static void main(String[] args) {

        String userString = readFromUser();
        String finalUserString = checkAndTransform(userString);
        print(finalUserString);
    }

    public static String readFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérlek válassz egyet az A, B, C opciók közül:");
        return scan.nextLine().toUpperCase();
    }

    private static String checkAndTransform(String userString) {
        if (userString.length() != 1)
            userString = userString.substring(0, 1);
        return userString;
    }

    private static void print(String finalUserString) {
        if (!finalUserString.startsWith("A") && !finalUserString.startsWith("B") && !finalUserString.startsWith("C")) {
            System.out.println("Nem az A, B, C lehetőségek közül választottál. A választásod: " + finalUserString);
        } else {
            System.out.println("A három opció közül a választásod: " + finalUserString);
        }
    }
}

