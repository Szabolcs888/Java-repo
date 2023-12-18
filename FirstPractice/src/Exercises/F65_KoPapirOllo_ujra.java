package Exercises;

import java.util.Random;
import java.util.Scanner;

        /* 16. Feladat (Órai) (Zsolt megoldása)
        Írjunk kő-papír-olló játékot. A program minden indítás után
        válasszon egy random eszközt, majd vesse össze a felhasználó
        által megadott eszközzel. Miután kiértékelte, hogy ki nyert, írja ki,
        hogy mi volt nála, és hogy ki nyerte a játékot. Figyeljünk rá, hogy
        a játékos csak a kő, papír, olló eszközöket választhassa. Ellenkező
        esetben írjunk ki egy figyelmeztető üzenetet. */

public class F65_KoPapirOllo_ujra {
    public static void main(String[] args) {

        while (true) {
            String mainUserHand = getUserHand();
            String mainCompHand = getCompHand();
            printWhoWin(mainUserHand, mainCompHand);
        }
    }

    public static String getUserHand() {
        System.out.println();
        System.out.println("Good luck!");
        System.out.println("Program started and wait for input ROCK/SCISSORS/PAPER: ");
        Scanner scan = new Scanner(System.in);
        String userData = scan.next();
        userData = userData.toUpperCase();
        System.out.println();
        System.out.println("Your hand: " + userData);
        return userData;

    }

    public static String getCompHand() {
        Random random = new Random();
        int randomNumber = random.nextInt(1, 4);   //1,2,3

        String computerChoose = "";
        switch (randomNumber) {
            case 1:
                computerChoose = "ROCK";
                break;
            case 2:
                computerChoose = "SCISSORS";
                break;
            case 3:
                computerChoose = "PAPER";
                break;
        }
        System.out.println("Computer hand: " + computerChoose);
        return computerChoose;
    }

    public static void printWhoWin(String mainUserHand, String mainCompHand) {
        if (mainUserHand.equals("ROCK") || mainUserHand.equals("SCISSORS") || mainUserHand.equals("PAPER")) {
            if (mainUserHand.equals("ROCK") && mainCompHand.equals("SCISSORS")) {
                System.out.println();
                System.out.println("Player win!");
            } else if (mainUserHand.equals("PAPER") && mainCompHand.equals("ROCK")) {
                System.out.println("Great, good luck.");
                System.out.println("Player win!");
            } else if (mainUserHand.equals("SCISSORS") && mainCompHand.equals("PAPER")) {
                System.out.println("Great, good luck.");
                System.out.println("Player win!");
            } else if (mainUserHand.equals(mainCompHand)) {
                System.out.println("Great, good luck.");
                System.out.println("Draw!");
            } else {
                System.out.println("Computer win");
            }
        } else {
            System.out.println("It's not a valid option. Please restart the program and choose from ROCK/SCISSORS/PAPER.");
        }
    }
}


