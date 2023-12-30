package Exercises;

            /* 79. Feladat (Órai) (Zsolt megoldása)
            Tételezzük fel, hogy valamit választania kell a felhasználónak a,b,c lehetőség
            közül. Készítsünk olyan metódust, amely ezt a konzolról beolvasott értéket feldolgozza
            és csak az első karaktert adja vissza, mint felhasználói választás. Elkerülve, hogy a
            felhasználó pontot, zárójelet, szóközt vagy bármi mást ír véletlenül az opciója után. */

import java.util.Scanner;

public class F79_String_Charat_SzoEleje2 {
    public static void main(String[] args) {
        String answer = getInputFromUserWithCustomText("Give me your choice a/b/c: ");

        System.out.println("Normalized answer-" + getFirstCharacterOfStringAsString(answer)+"-");
    }

    public static String getInputFromUserWithCustomText(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextLine();
    }

    public static char getFirstCharacterOfString(String text) {
        return text.charAt(0);
    }

    public static String getFirstCharacterOfStringAsString(String text) {
        return text.substring(0,1);
    }
}

