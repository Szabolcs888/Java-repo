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

public class F16_KoPapirOllo2 {
    public static void main(String[] args) {
        System.out.println("Program started and wait for input ROCK/SCISSORS/PAPER: ");
        Scanner scan = new Scanner(System.in);
        String userData = scan.next();
        userData = userData.toUpperCase();  //változó tartalmának felülírása annak nagybetűs változatával
        System.out.println("stored data after standardization: " + userData);

        if (userData.equals("ROCK") || userData.equals("SCISSORS") || userData.equals("PAPER")) {
            System.out.println("Great, good luck.");
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

            //megvizsgáljuk a userData változót, hogyan viszonyul a computerChoose változóhoz annak eldöntésére, hogy ki nyert
            if (userData.equals("ROCK") && computerChoose.equals("SCISSORS")) {
                System.out.println("Player win!");
            } else if (userData.equals("PAPER") && computerChoose.equals("ROCK")) {
                System.out.println("Player win!");
            } else if (userData.equals("SCISSORS") && computerChoose.equals("PAPER")) {
                System.out.println("Player win!");
            } else if (userData.equals(computerChoose)) {
                System.out.println("Draw!");
            } else {
                System.out.println("Computer win");
            }
        } else {
            System.out.println("It's not a valid option. Please restart the program and choose from ROCK/SCISSORS/PAPER.");
        }
    }
}

