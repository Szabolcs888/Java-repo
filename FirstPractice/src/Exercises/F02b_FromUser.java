package Exercises;

import java.util.Scanner;

        /* 2.b Feladat (Órai)
        Készítsünk programot, ami a megadott két számot, “a”-t és “b” letárolja,
        majd megmondja mennyi lesz a maradék, ha “a”-t elosztjuk “b”-vel.
        Felhasználótól kérjük be a számokat */

public class F02b_FromUser {
    public static void main(String[] args) {

        System.out.println("Give me the number a: ");

        Scanner scan = new Scanner(System.in);
        String userDataA = scan.next();

        System.out.println("Give me the number b: ");

        Scanner scan2 = new Scanner(System.in);
        String userDataB = scan2.next();

        int a = Integer.parseInt(userDataA); // az a változó értékének az usertől bekért első értéket adjuk meg (az utasítás egyben azt is magában foglalja, hogy a Stringként érkező argument számadattá változzon)
        int b = Integer.parseInt(userDataB); // a b változó értékének az usertől bekért második értéket adjuk meg

        System.out.println(a % b);
    }
}
