package Exercises;

import java.util.Scanner;

        /* 8. Feladat
        Készítsetek programot, amely a felhasználótól vár 3 számot,
        amely számokról el tudja dönteni, hogy lehet-e egy háromszög 3 oldala,
        vagyis szerkeszthető-e a háromszög.
        Ha lehet, akkor írja ki: “You are a lucky person.” (Pl.: 2,3,4-re)
        Egyébként, írja ki: “Please, try again.” (Pl.: 1,8,1-re) */

public class F08_HaromszogOldalSzamitas {
    public static void main(String[] args) {

        System.out.println();

        System.out.println("Give the triangle slide a: ");
        Scanner scan = new Scanner(System.in);
        String userDataA = scan.next();

        System.out.println("Give the triangle slide b: ");
        Scanner scan2 = new Scanner(System.in);
        String userDataB = scan2.next();

        System.out.println("Give the triangle slide c: ");
        Scanner scan3 = new Scanner(System.in);
        String userDataC = scan3.next();

        int a = Integer.parseInt(userDataA);
        int b = Integer.parseInt(userDataB);
        int c = Integer.parseInt(userDataC);

        if (a + b > c && a + c > b && c + b > a) {
            System.out.println("You are a lucky person.");
        } else {
            System.out.println("Please, try again.");
        }
    }
}
