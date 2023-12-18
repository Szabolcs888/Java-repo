package Exercises;

import java.util.Random;

        /* 6/2 Feladat, másik megoldás
        Készítsetek szerencsesüti programot,
        amely minden futtatása során kiír egy kis bölcs üzenetet.
        A program véletlenszerűen írjon ki üzeneteket, amit előre felvettünk benne.
        Mindig csak egyet. */

public class F06_NapiBolcsesseg2 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(4);  // 0,1,2,3
        String msg1 = "Ha nincs ló jó a szamár is.";
        String msg2 = "Addig jár a korsó a kútra amíg el nem törik.";
        String msg3 = "Aki korán kel aranyat lel.";
        String msg4 = "Nem látja a fától az erdőt.";

        if (randomNumber == 0) {
            System.out.println(msg1);
        } else if (randomNumber == 1) {
            System.out.println(msg2);
        } else if (randomNumber == 2) {
            System.out.println(msg3);
        } else if (randomNumber == 3) {
            System.out.println(msg4);
        }
    }
}

