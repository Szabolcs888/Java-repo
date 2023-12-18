package Exercises;

import java.util.Scanner;

        /* 21. Feladat
        Fejlesszétek tovább a Háromszög alkalmazást (8as), hogy
        mindaddig ismételje a bekérést a felhasználótól, amíg nem
        ad neki helyes háromszög oldal adatokat. */

public class F21_HaromszogOldalSzamitas_While {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        while (!(a + b > c && a + c > b && c + b > a)) { // ez ugyanez: (false == (a + b > c && a + c > b && c + b > a))
            System.out.println("Give the triangle slide a: ");
            String userDataA = scan.next();

            System.out.println("Give the triangle slide b: ");
            String userDataB = scan.next();

            System.out.println("Give the triangle slide c: ");
            String userDataC = scan.next();

            a = Integer.parseInt(userDataA);
            b = Integer.parseInt(userDataB);
            c = Integer.parseInt(userDataC);

            if (a + b > c && a + c > b && c + b > a) {
                System.out.println();
                System.out.println("You are a lucky person.");
            } else {
                System.out.println();
                System.out.println("Please, try again.");
            }
        }
    }
}
