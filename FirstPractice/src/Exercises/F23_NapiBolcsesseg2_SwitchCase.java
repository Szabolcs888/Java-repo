package Exercises;

import java.util.Random;

        /* 23. Feladat (Zsolt megoldása)
        Készítsétek el a szerencsesüti program switch case
        szerinti megvalósítását. Cseréljétek le az if/else
        if/else blokkokat switch case-ekkel. */

public class F23_NapiBolcsesseg2_SwitchCase {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(4);  // 0,1,2,3
        String msg1 = "Ha nincs ló jó a szamár is.";
        String msg2 = "Addig jár a korsó a kútra amíg el nem törik.";
        String msg3 = "Aki korán kel aranyat lel.";
        String msg4 = "Nem látja a fától az erdőt.";

        switch (randomNumber) {
            case 0:
                System.out.println(msg1);
                break;
            case 1:
                System.out.println(msg2);
                break;
            case 2:
                System.out.println(msg3);
                break;
            case 3:
                System.out.println(msg4);
                break;
        }
    }
}


