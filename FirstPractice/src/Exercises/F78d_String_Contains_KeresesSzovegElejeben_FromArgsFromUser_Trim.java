package Exercises;

            /* 78.d Feladat (saját megoldás)
            Írjatok egy metódust, ami a paraméterként kapott szövegről, illetve a másik
            paraméterként kapott kifejezésről eldönti, hogy azzal a kifejezéssel kezdődik-e
            az adott szöveg vagy sem. Amennyiben igen, térjen vissza true-val, egyébként
            false-al.

            Amennyiben van a program indításakor parancssori argumentum beállítva, akkor
            használja azokat. Ha viszont nincs, akkor olvassa be az adatokat a konzolról
            és egy metódus távolítsa el a felesleges szóközöket a String-ek elejéről és
            végéről. */

import java.util.Scanner;

/*
        main();
            argsOrScan();
                if
                   withoutSpaceMet();
                else
                   readFromUser();
                   withoutSpaceMet();
                searchingDecide();
                print();
*/

public class F78d_String_Contains_KeresesSzovegElejeben_FromArgsFromUser_Trim {
    public static void main(String[] args) {
        argsOrScan(args);
    }

    private static void argsOrScan(String[] args) {
        String text = "";
        String searchingString = "";
        String withoutSpaceText = "";
        String withoutSearchingString = "";
        if (args.length !=0) {
            text = args[0];
            searchingString = args[1];
            withoutSpaceText = withoutSpaceMet(text);
            withoutSearchingString = withoutSpaceMet(searchingString);
        } else {
            text = readFromUser();
            searchingString =readFromUserSearchingTextStart();
            withoutSpaceText = withoutSpaceMet(text);
            withoutSearchingString = withoutSpaceMet(searchingString);
        }
        boolean yON = searchingDecide(withoutSpaceText, withoutSearchingString);
        print(yON, withoutSearchingString);
    }

    public static String readFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mivel nincs parancssori argumentum, ezért kérlek, írj be egy szöveget:");
        return scan.nextLine();
    }

    private static String readFromUserSearchingTextStart() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Írd be a szöveg elejével összehasonlítandó szövegrészt:");
        return scan.nextLine();
    }

    private static String withoutSpaceMet(String trimText) {
        return trimText.trim();
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