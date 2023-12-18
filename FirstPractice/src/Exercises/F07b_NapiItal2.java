package Exercises;

    /* 7.b Feladat (Órai)
    Írjunk programot, amely beolvassa hogy hányadik nap van a héten (1-7-ig),
    majd egy változóban tárolja azt.
    A hét napjai közül kitüntetett nap a csütörtök, péntek, szombat.
    Ha a változó értéke ezen napok valamelyikre,
    akkor írja ki a program hogy “Italos nap van, ide a citromos sört de gyorsan”.
    Egyébként írja ki, hogy “Ez nem a Te napod, majd talán holnap”
    Program argumentumként olvassa be a sorszámot */

public class F07b_NapiItal2 {
    public static void main(String[] args) {

        System.out.println("Please give me a number between 1-7 to represent the day of the week as a program argument.");

        int userDay = Integer.parseInt(args[0]);

        if (userDay == 4 || userDay == 5 || userDay == 6) {
            System.out.println("Italos nap van, ide a citromos sört de gyorsan!");
        } else {
            System.out.println("Ez nem a Te napod, majd talán holnap.");
        }
    }
}
