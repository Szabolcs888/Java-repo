package Exercises;

            /* 41.Feladat (Órai) (Tamás megoldása)
            Készítsünk egy számla végösszeg kalkulátor programot,
            amelybe be tudom rögzíteni az adott hónap különböző
            számláinak az összegét. A program pedig összeadja őket
            és kiírja, mennyit kell a családi kasszából fizetni
            összesen. Magát, hogy milyen számla az amit be kell
            fizetni, nem fontos tárolni most, elég ha az összegek
            mentésre, majd összeadásra kerülnek. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F41_List_TetelekOsszeadasa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> bills = new ArrayList<>();
        int sum = 0;

        System.out.println("Electricity:");
        bills.add(scanner.nextInt());

        System.out.println("Gas:");
        bills.add(scanner.nextInt());

        System.out.println("Water:");
        bills.add(scanner.nextInt());

        for (int bill : bills) {
            sum += bill; //sum = sum + bill;
        }
        System.out.println("You need to pay:" + sum);
    }
}

