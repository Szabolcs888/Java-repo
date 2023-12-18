package Exercises;

import java.util.Scanner;

        /* 63. Feladat (Órai)
        A háromszög eldöntős programunk dolgozzuk át, hogy külön metódus
        legyen az oldal beolvasás ( getTriangleDataFromConsole() ), külön
        metódus a háromszög szerkeszthetősége
        ( isTriangeValid(aoldal,boldal,coldal) )és külön az eredmény String
        kiíratása ( showResultToTheUser(result) ). */

public class F63_Met_HaromszogOldalSzamitas {
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
