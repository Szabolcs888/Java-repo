package Exercises;

import java.util.Random;
import java.util.Scanner;

        /* 5. Feladat (Órai)
        Írjunk programot, ami bekér 6 nevet a felhasználótól,
        majd visszaadja véletlenszerűen az egyikőjük nevét,
        mint a tombola nyertesét.*/

public class F05_Tombola {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name1 = scan.next();
        scan = new Scanner(System.in);
        String name2 = scan.next();
        scan = new Scanner(System.in);
        String name3 = scan.next();
        scan = new Scanner(System.in);
        String name4 = scan.next();
        scan = new Scanner(System.in);
        String name5 = scan.next();
        scan = new Scanner(System.in);
        String name6 = scan.next();

        Random random = new Random();
        int randomNumber = random.nextInt(6); // 0,1,2,3,4,5

        if (randomNumber == 0) {
            System.out.println("Winner is: " + name1);
        } else if (randomNumber == 1) {
            System.out.println("Winner is: " + name2);
        } else if (randomNumber == 2) {
            System.out.println("Winner is: " + name3);
        } else if (randomNumber == 3) {
            System.out.println("Winner is: " + name4);
        } else if (randomNumber == 4) {
            System.out.println("Winner is: " + name5);
        } else if (randomNumber == 5) {
            System.out.println("Winner is: " + name6);
        }
    }
}