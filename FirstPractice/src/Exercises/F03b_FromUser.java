package Exercises;

import java.util.Scanner;

        /* 3.b Feladat
        Készítsetek programot, ami a megadott két számot, “a”-t és “b” letárolja,
        majd megmondja mennyi lesz “a” és “b” szorzata, miután megszoroztuk az “a”-t 3-al.
        A felhasználótól kérjük be a számokat */

public class F03b_FromUser {
    public static void main(String[] args) {

        System.out.println("Give me your first number and press ENTER:");
        Scanner scan = new Scanner(System.in);
        String aData = scan.next();

        System.out.println("Give me your second number and press ENTER:");
        scan = new Scanner(System.in);
        String bData = scan.next();

        int a = Integer.parseInt(aData);
        int b = Integer.parseInt(bData);

        System.out.println("Result: " + (a * 3) * b);
    }
}
