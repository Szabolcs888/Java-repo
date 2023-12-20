package Exercises;

/*
107)	Készítsetek egy OrderStatus nevű enumot, mely ACCEPTED, PAYED, TRANSIT, DELIVERED
 értékeket tartalmaz. A program indítása után kiírja, hogy “Your order is currently … “
  A … helyén pedig legyen a fenti enumok értéke, például “Your order is currently ACCEPTED
   and waiting for the payment.” Az pedig, hogy a fenti értékek közül melyiket írja ki a program
    véletlenszerűen dőljön el. Egy random generált 1-4 közötti szám döntse el a státuszt.
     Pl.: 1 esetén ACCEPTED
 */

import java.util.Random;
import java.util.Scanner;

public class F107 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1;
        int actualScore = randomNumber;

        if (actualScore == 1) {
            System.out.println("Your status: " + Examstatus.ACCEPTED);
        } else if (actualScore == 2) {
            System.out.println("Your status: " + Examstatus.PAYED);
        }else if (actualScore == 3) {
            System.out.println("Your status: " + Examstatus.TRANSIT);
        }else if (actualScore == 4) {
            System.out.println("Your status: " + Examstatus.DELIVERED);
        }
    }
    enum  Examstatus {
        ACCEPTED, PAYED, TRANSIT, DELIVERED
    }
}

/*
        System.out.println("Give me the actual score:");
        Scanner scan = new Scanner(System.in);
        int actualScore = scan.nextInt();
        System.out.println("The minimum score for passed exam is: " +args[0]);

        int minScore = Integer.parseInt(args[0]);
        if (actualScore >= minScore) {
            System.out.println("Your status: "+ Examstatus.PASSED);
        } else {
            System.out.println("Your status: "+ Examstatus.FAILED);;

        }
    }
    enum  Examstatus {
        PASSED, FAILED
    }
}
 */