package Exercises;

            /* 41.Feladat (Órai) (saját megoldás)
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

public class F41_List_TetelekOsszeadasa {
    public static void main(String[] args) {

        List<Integer> invoiceList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Mennyi tételt szeretnél összeadni?");
        int counter = scan.nextInt();
        int element = 0;
        int sum = 0;

        System.out.println();
        System.out.println("Kérlek, add meg a tételeket!");
        for (int i = 1; i <= counter; i++) {
            System.out.println();
            System.out.println(i + ". tétel:");
            element = scan.nextInt();
            invoiceList.add(element);
            sum = sum + element;
        }
        System.out.println();
        System.out.println("A tételek:");
        for (Integer item : invoiceList)
            System.out.println(item + " Ft");

        System.out.println();
        System.out.println("Összesen:");
        System.out.println(sum + " Ft");
    }
}

