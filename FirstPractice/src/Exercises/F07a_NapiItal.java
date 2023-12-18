package Exercises;

import java.util.Scanner;

        /* 7.a Feladat (Órai)
        Írjunk programot, amely beolvassa hogy hányadik nap van a héten (1-7-ig),
        majd egy változóban tárolja azt.
        A hét napjai közül kitüntetett nap a csütörtök, péntek, szombat.
        Ha a változó értéke ezen napok valamelyikre,
        akkor írja ki a program, hogy “Italos nap van, ide a citromos sört de gyorsan!”.
        Egyébként írja ki, hogy “Ez nem a Te napod, majd talán holnap.”
	    A sorszám beolvasás történjen console-ról */

public class F07a_NapiItal {
    public static void main(String[] args) {

        System.out.println("Please give me a number between 1-7 to represent the day of the week and press ENTER:");

        Scanner scan = new Scanner(System.in);
        String userData = scan.next();
        int userDay = Integer.parseInt(userData);

        if (userDay == 4 || userDay == 5 || userDay == 6) {
            System.out.println("Italos nap van, ide a citromos sört, de gyorsan!");
        } else {
            System.out.println("Ez nem a Te napod, majd talán holnap.");
        }
    }
}