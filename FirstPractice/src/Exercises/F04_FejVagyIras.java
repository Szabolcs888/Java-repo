package Exercises;

import java.util.Random;
import java.util.Scanner;

        /* 4. Feladat (Órai)
         Írjunk Fej vagy írás programot, amely kérdezze meg, hogy mire tippelünk,
         mit választunk. Ezután sorsolja ki, hogy az érme melyik oldala kerül felülre.
         Attól függően, hogy eltaláltuk, vagy hibáztunk, írja ki az eredményt. */

public class F04_FejVagyIras {
    public static void main(String[] args) {

        System.out.println();

        System.out.println("Program started and wait for input. Please give 0 in case of heads or give 1 in case of tails: ");
        Scanner scan = new Scanner(System.in);
        String userData = scan.next();
        int userChoose = Integer.parseInt(userData);

        if (userChoose == 0 || userChoose == 1) {
            Random random = new Random();
            int computerCoin = random.nextInt(2);

            if (computerCoin == userChoose) {
                System.out.println("Congrats, you nailed it!");
            } else {
                System.out.println("No luck, try again!");
            }
        }else {
            System.out.println("Invalid input. Please rerun the application.");
        }
    }
}