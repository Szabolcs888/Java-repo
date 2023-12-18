package Exercises;

import java.util.Random;
import java.util.Scanner;

        /* 15. Feladat (Órai) (saját megoldás)
        Írjunk programot, amely egy dobókocka szerencsejáték program.
        A játékot 2 játékos játsza, neveiket kérje be a program.
        A játékosok felváltva dobnak. A játék 3+1 fordulóból áll.
        A 4. Forduló dupla pontért meg. Az a játékos nyer, aki a
        legtöbb pontot összegyűjti. (Amennyit dob a játékos az egyes
        fordulókban, annyival több van neki) */

public class F15_Kockajatek1 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Ez egy dobókocka játék, amit két játékos játszik. A játékosok felváltva dobnak. A játék négy körig tart és a 4-ik kör dupla pontot ér.");
        System.out.println();

        Scanner scanString = new Scanner(System.in);

        System.out.println("Kérem az első játékos nevét:");
        String userName1 = scanString.next();

        System.out.println("Kérem a második játékos nevét:");
        String userName2 = scanString.next();

        System.out.println();

        Random random = new Random();

        int user1Sum = 0;
        int user2Sum = 0;

        int c = 1;
        while (c <= 4) {
            if (c <= 3) {
                int rNumberUser1 = random.nextInt(1, 7);
                System.out.println(userName1 + " " + c + ". dobása: " + rNumberUser1);
                user1Sum = user1Sum + rNumberUser1;
            } else {
                int rNumberUser1 = random.nextInt(1, 7);
                System.out.println(userName1 + " " + c + ". dobása: " + rNumberUser1);
                user1Sum = user1Sum + rNumberUser1 * 2;
            }

            if (c <= 3) {
                int rNumberUser2 = random.nextInt(1, 7);
                System.out.println(userName2 + " " + c + ". dobása: " + rNumberUser2);
                user2Sum = user2Sum + rNumberUser2;
            } else {
                int rNumberUser2 = random.nextInt(1, 7);
                System.out.println(userName2 + " " + c + ". dobása: " + rNumberUser2);
                user2Sum = user2Sum + rNumberUser2 * 2;
            }
            c++;
            System.out.println();
        }

        System.out.println(userName1 + " összesen " + user1Sum + "-t dobott.");
        System.out.println(userName2 + " összesen " + user2Sum + "-t dobott.");

        System.out.println();

        if (user1Sum > user2Sum){
            System.out.println("A játékot "+userName1+" nyerte.");
        } else if (user1Sum < user2Sum){
            System.out.println("A játékot "+userName2+" nyerte.");
        } else {
            System.out.println("A játék döntetlennel végződött.");
        }
    }
}
