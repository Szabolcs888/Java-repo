package Exercises;

import java.util.Random;
import java.util.Scanner;

        /* 15. Feladat (Órai)(Tamás 2. megoldása)
        Írjunk programot, amely egy dobókocka szerencsejáték program.
        A játékot 2 játékos játsza, neveiket kérje be a program.
        A játékosok felváltva dobnak. A játék 3+1 fordulóból áll.
        A 4. Forduló dupla pontért meg. Az a játékos nyer, aki a
        legtöbb pontot összegyűjti. (Amennyit dob a játékos az egyes
        fordulókban, annyival több van neki) */

public class F15_Kockajatek3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első játékos nevét:");
        String player1Name = scanner.nextLine();

        System.out.println("Kérem a második játékos nevét:");
        String player2Name = scanner.nextLine();

        int player1Sum = 0, player2Sum = 0;
        Random randomGenerator = new Random();

        int round = 0;
        while (round <= 3) {
            int player1ActualNumber = randomGenerator.nextInt(1, 7);
            System.out.println(player1Name + " dob:");
            System.out.println(player1Name + " " + player1ActualNumber + "-t dobott");

            int player2ActualNumber = randomGenerator.nextInt(1, 7);
            System.out.println(player2Name + " dob:");
            System.out.println(player2Name + " " + player2ActualNumber + "-t dobott");


            if (round == 3) {
                player1Sum = player1Sum + player1ActualNumber * 2;
                player2Sum = player2Sum + player2ActualNumber * 2;
            } else {
                player1Sum = player1Sum + player1ActualNumber;
                player2Sum = player2Sum + player2ActualNumber;
            }
            round++;
            System.out.println(player1Name + " eredménye az " + (round) + " körben:" + player1Sum);
            System.out.println(player2Name + " eredménye az " + (round) + " körben:" + player2Sum);
        }

        if (player1Sum > player2Sum) {
            System.out.println(player1Name + " nyert.");
        } else if (player2Sum > player1Sum) {
            System.out.println(player2Name + " nyert.");
        } else {
            System.out.println("Döntetlen.");
        }
    }
}
