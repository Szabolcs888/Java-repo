package Exercises;

            /* 56.b Feladat (saját megoldás)
            Készítsetek egy számla végösszeg kalkulátor programot, amelybe
            be lehet rögzíteni az adott hónap különböző számláinak az
            összegét. A program pedig összeadja őket és kiírja, mennyit
            kell a családi kasszából fizetni összesen. Magát, hogy milyen
            számla az amit be kell fizetni, az is kerüljön beolvasásra az
            összegekkel együtt (de külön beolvasással - 3 darab -). Az
            elemek kerüljenek Mapben mentésre, majd összeadásra és
            kiíratásra. Amennyiben a felhasználó 0 ft-os számlát ír, úgy
            azt törölje ki a Map-ből a program (azaz, fel se vegye).

            Lentebb az a változat, amikor egy meglévő számlanevet írunk be
            és 0 összeg megadásával törlésre kerül a tétel. */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F56b_Map_Szamlalista_0asSzamlaDelete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> invoiceList = new HashMap<>();

        for (int i = 1; i < 4; i++) {
            System.out.println();
            System.out.println("Kérlek, add meg a(z) " + i + ". számla nevét:");
            String element = scan.nextLine();
            System.out.println("Összegét:");
            int amount = Integer.parseInt(scan.nextLine());
            if (amount == 0) {
                invoiceList.remove(element);
                System.out.println("A(z) " + element + " nem lett felvéve a listára.");
                i--;
            } else {
                invoiceList.put(element, amount);
            }
        }
        System.out.println();
        System.out.println("A számlák:");
        for (Map.Entry mapElement : invoiceList.entrySet()) {
            System.out.println(mapElement.getKey() + ": " + mapElement.getValue() + "ft");
        }
        int sum = 0;
        for (Integer f : invoiceList.values()) {
            sum = sum + f;
        }
        System.out.println();
        System.out.println("A számlák végösszege: " + sum + "ft");
    }
}

/* Amennyiben 0-ás értékkel törölni szeretnénk egy meglévő számlát, így néz ki a kód
String elements = "";
        int amount = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println("Kérlek, add meg a " + (i + 1) + ". számla nevét:");
            elements = scan.next();
            System.out.println("Összegét:");
            amount = scan.nextInt();
            invoiceList.put(elements, amount);
            if (amount == 0){
                invoiceList.remove(elements);
                System.out.println("A "+ elements +" számla törölve lett a listából.");
                i--;
            }
        }
 */