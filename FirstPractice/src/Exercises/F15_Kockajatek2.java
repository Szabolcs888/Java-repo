package Exercises;

import java.util.Random;
import java.util.Scanner;

        /* 15. Feladat (Órai) (Tamás megoldása)
        Írjunk programot, amely egy dobókocka szerencsejáték program.
        A játékot 2 játékos játsza, neveiket kérje be a program.
        A játékosok felváltva dobnak. A játék 3+1 fordulóból áll.
        A 4. Forduló dupla pontért meg. Az a játékos nyer, aki a
        legtöbb pontot összegyűjti. (Amennyit dob a játékos az egyes
        fordulókban, annyival több van neki) */

public class F15_Kockajatek2 {
    public static void main(String[] args) {
        int i = 0, player1Sum = 0, player2Sum = 0;
        String player1Name = "", player2Name = "";
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Kérem az első játékos nevét:");
        player1Name = sc.nextLine();

        System.out.println("Kérem a második játékos nevét:");
        player2Name = sc.nextLine();

        while (i < 8) {
            int n = r.nextInt(1, 7);
            if (i % 2 == 0) {
                System.out.println();
                System.out.println(player1Name + " dob:");
                System.out.println(player1Name + " " + n + "-t dobott");

                // a 33-36. sor ugyanazt csinálja mint a 42-46. sor
                if (i == 6) {
                    player1Sum = player1Sum + n;
                }
                player1Sum = player1Sum + n;
                System.out.println(player1Name + " eredménye az " + (i / 2 + 1) + " körben:" + player1Sum);
            } else {
                System.out.println();
                System.out.println(player2Name + " dob:");
                System.out.println(player2Name + " " + n + "-t dobott");
                if (i == 7) {
                    player2Sum = player2Sum + 2 * n;
                } else {
                    player2Sum = player2Sum + n;
                }
                System.out.println(player2Name + " eredménye az " + (i / 2 + 1) + " körben:" + player2Sum);
            }
            i++;
        }
        if (player1Sum > player2Sum) {
            System.out.println(player1Name + " nyert");
        } else if (player1Sum < player2Sum) {
            System.out.println(player2Name + " nyert");
        } else {
            System.out.println("Döntetlen.");
        }
    }
}
