package Exercises;

import java.util.Random;
import java.util.Scanner;

        /* 23. Feladat (Zsolt megoldása)
        Készítsétek el a szerencsesüti program switch case
        szerinti megvalósítását. Cseréljétek le az if/else
        if/else blokkokat switch case-ekkel.

        És ki van egészítve egy while ciklussal, ami rákérdez,
        hogy szeretne-e a felhasználó újabb bölcsességet, melynek
        feltételét boolen típusú változóval adjuk meg. */

public class F23_NapiBolcsesseg3_Flag_Boolean {
    public static void main(String[] args) {

        boolean decision = true;
        while (decision) {
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

            System.out.println("Do you want a new wish? Press Y/N.");
            Scanner scan = new Scanner(System.in);   //utastás, hogy a felhasználó tudjon a console-al interakciót végezni
            String userAnswer = scan.next().toUpperCase();

            if (userAnswer.equals("N")) {
                decision = false;
            }

            if (!(userAnswer.equals("Y") || userAnswer.equals("N"))) {
                System.out.println("Unexpected answer. New wish will be generated.");
                decision = true;
            }

            // ugyanaz:
            /*
            if (userAnswer.equals("Y") || userAnswer.equals("N")) {
                decision = false;
            } else {
                System.out.println("Unexpected answer. New wish will be generated.");
                decision = true;
            }
            */

            // ugyanaz:
            /*
            switch (userAnswer){
                case "Y":
                    decision = true;
                    break;
                case "N":
                    decision = false;
                    break;
                default:
                    System.out.println("Unexpected answer. New wish will be generated.");
                    decision = true;
                    break;
            }
            */
        }
    }
}


