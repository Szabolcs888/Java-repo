package Exercises;

            /* 78.d Feladat (Zsolt megoldása)
            Írjatok egy metódust, ami a paraméterként kapott szövegről, illetve a másik
            paraméterként kapott kifejezésről eldönti, hogy azzal a kifejezéssel kezdődik-e
            az adott szöveg vagy sem. Amennyiben igen, térjen vissza true-val, egyébként
            false-al.

            Amennyiben van a program indításakor parancssori argumentum beállítva, akkor
            használja azokat. Ha viszont nincs, akkor olvassa be az adatokat a konzolról
            és egy metódus távolítsa el a felesleges szóközöket a String-ek elejéről és
            végéről. */

import java.util.Scanner;

public class F78d_String_Contains_KeresesSzovegElejeben_FromArgsFromUser_Trim2 {
    public static void main(String[] args) {
    String string;
    String text;

        if (args.length != 0) {   // ua.: mint az if(args.lenth > 0)
        text = args[0];       // parancssori arg b) megoldás
        string = args[1];     // parancssori arg b) megoldás
    } else {
           /* text = getInputFromUserWithCustomText("Give me the base text: ");
            string = getInputFromUserWithCustomText("Give me what to want to find:");*/
        text = getInputFromUser();
        string = getInputFromUser();
    }

        System.out.println("Result: " + isStringStartsWithText(text, string));
}

    public static String getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a text:");
        return scanner.nextLine();
    }

    public static boolean isStringStartsWithText(String text, String search) {
        search = search.trim();
        text = text.trim();
        boolean result;
        result = text.startsWith(search);
        return result;
    }

    public static boolean isStringStartsWithTextv2(String text, String search) {
        return text.trim().toLowerCase().startsWith(search.trim().toLowerCase()); //ua mint a isStringStartsWithText csak kisbetűssé alakít
    }

    public static String getInputFromUserWithCustomText(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextLine();
    }
}