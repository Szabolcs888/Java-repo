package Exercises;

import java.util.Scanner;

        /* Készítsünk egy programot, ami beolvas egy számot a felhasználótól
        és megmondja, hogy 2-vel, 3-al vagy 4-el elosztva van-e maradék.
        Ha nem osztható egyikkel sem, akkor írja ki azt eredményként.*/

public class F00b_Maradekszamitas {
    public static void main(String[] args) {

        System.out.println("Number:");

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        if (number % 2 == 0) {
            System.out.println(number + " is divisible by 2");
        } else if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3");
        } else if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5");
        } else {
            System.out.println("Not divisible by 2 or 3 or 5");
        }
    }
}
