package Exercises;

import java.util.Random;
import java.util.Scanner;

        /* 17.a Feladat (Órai) (Zsolt fejlesztése)
        Ezen megoldás és a 17_Tovabbfejelsztenni alapján továbbfejleszteni, hogy szép legyen a kód
        és végeredményként elérni azt, amit a 17d tud! Ezt a fájlt meghagyni, mint Zsolt munkája F17a néven!


        Fejlesszétek tovább a kő-papír-olló játékot. A játék ne érjen
        véget egy kör után, hanem addig folytatódjon, amíg a felhasználó
        a három megengedett eszköz helyett az X karaktert adja meg.
        A játék számolja a pontokat, minden győztes kör 3 pontot ér,
        a döntetlen pedig 1 pont mindkét félnek. Az “x” karakter leütése
        után írja ki, hogy vége a játéknak, valamint hogy kinek hány pontja lett. */

public class F17_Tovabbfejleszteni2 {
    public static void main(String[] args) {
        System.out.println("Program started and wait for input ROCK/SCISSORS/PAPER: ");
        Scanner scan = new Scanner(System.in);
        String userData = "";
        int playerScore = 0, computerScore = 0;
        while (!(userData.equals("X"))) {
            System.out.println("ROUND started.");
            userData = scan.next();
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
                    playerScore += 3;
                } else if (userData.equals("PAPER") && computerChoose.equals("ROCK")) {
                    System.out.println("Player win!");
                    playerScore += 3;
                } else if (userData.equals("SCISSORS") && computerChoose.equals("PAPER")) {
                    System.out.println("Player win!");
                    playerScore += 3;
                } else if (userData.equals(computerChoose)) {
                    System.out.println("Draw!");
                    playerScore += 1;
                    computerScore += 1;
                } else {
                    System.out.println("Computer win");
                    computerScore += 3;
                }
            } else {
                System.out.println("It's not a valid option. Please restart the program and choose from ROCK/SCISSORS/PAPER.");
            }
            System.out.println("Player score: " + playerScore);
            System.out.println("Computer score: " + computerScore);
        }
    }
}


