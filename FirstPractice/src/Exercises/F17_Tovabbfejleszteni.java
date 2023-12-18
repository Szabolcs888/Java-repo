package Exercises;

import java.util.Random;
import java.util.Scanner;

        /* 17.a Feladat (Órai) (részben Zsolt fejlesztése, de én sok mindent máshogy csináltam.
        A számlálót már én tettem bele)
        Ezen megoldás és a 17_Tovabbfejelsztenni2 alapján továbbfejleszteni, hogy szép legyen a kód
        és végeredményként elérni azt, amit a 17d tud! (A "Scanner scan = new Scanner(System.in)" -t  elég egyszer meghívni)


        Fejlesszétek tovább a kő-papír-olló játékot. A játék ne érjen
        véget egy kör után, hanem addig folytatódjon, amíg a felhasználó
        a három megengedett eszköz helyett az X karaktert adja meg.
        A játék számolja a pontokat, minden győztes kör 3 pontot ér,
        a döntetlen pedig 1 pont mindkét félnek. Az “x” karakter leütése
        után írja ki, hogy vége a játéknak, valamint hogy kinek hány pontja lett. */

public class F17_Tovabbfejleszteni {
    public static void main(String[] args) {
        int playerCounter = 0;
        int computerCounter = 0;
        int round = 0;
        while (true) {
            System.out.println("Program started and wait for ROCK/SCISSORS/PAPER: ");

            round++;
            Scanner scan = new Scanner(System.in);
            String userData = scan.next();

            if (userData.equals("x")) {
                System.out.println("Game over");
                break;
            } else {
                System.out.println("Stored data: " + userData);

                Random random = new Random();
                int randomNumber = random.nextInt(3) + 1;

                String computerChoose = "";

                if (userData.equals("ROCK") || userData.equals("SCISSORS") || userData.equals("PAPER")) {
                    System.out.println("Great, good luck.");
                } else {
                    System.out.println("It's not valid...");
                }

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
                    playerCounter = playerCounter + 3;
                } else if (userData.equals("PAPER") && computerChoose.equals("ROCK")) {
                    System.out.println("Player win!");
                    playerCounter = playerCounter + 3;
                } else if (userData.equals("SCISSORS") && computerChoose.equals("PAPER")) {
                    System.out.println("Player win!");
                    playerCounter = playerCounter + 3;
                } else if (userData.equals(computerChoose)) {
                    System.out.println("Draw!");
                    playerCounter++;
                    computerCounter++;
                } else {
                    System.out.println("Computer win!");
                    computerCounter = computerCounter + 3;
                }

                System.out.println("A játék állása a "+ round+ ". fordulóban");
                System.out.println("Játékos: " + playerCounter + " pont" + " Gép: " + computerCounter + " pont");
            }
        }
    }
}


