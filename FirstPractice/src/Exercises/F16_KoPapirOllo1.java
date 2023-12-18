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

public class F16_KoPapirOllo1 {
    public static void main(String[] args) {
        System.out.println("Program started and wait for ROCK/SCISSORS/PAPER: ");
        Scanner scan = new Scanner(System.in);
        String userData = scan.next();

        System.out.println("Stored data: " + userData);

        userData = userData.toUpperCase();

        if (userData.equals("ROCK") || userData.equals("SCISSORS") || userData.equals("PAPER")) {
            System.out.println("Great, good luck.");
        } else {
            System.out.println("It's not valid...");
        }

        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
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
        System.out.println("Computer Choose: " + computerChoose);

        if (userData.equals("ROCK") && computerChoose.equals("SCISSORS")) {
            System.out.println("Player win!");
        } else if (userData.equals("PAPER") && computerChoose.equals("ROCK")) {
            System.out.println("Player win!");
        } else if (userData.equals("SCISSORS") && computerChoose.equals("PAPER")) {
            System.out.println("Player win!");
        } else if (userData.equals(computerChoose)) {
            System.out.println("Draw!");
        } else {
            System.out.println("Computer win!");
        }
    }
}
