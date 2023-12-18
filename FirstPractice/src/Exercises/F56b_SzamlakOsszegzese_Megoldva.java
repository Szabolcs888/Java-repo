package Exercises;

            /* 56.a-b Feladat (saját megoldás)
            Készítsetek egy számla végösszeg kalkulátor programot, amelybe
            be lehet rögzíteni az adott hónap különböző számláinak az összegét.
            A program pedig összeadja őket és kiírja mennyit kell a családi
            kasszából fizetni összesen. Magát, hogy milyen számla az amit be kell
            fizetni, az is kerüljön beolvasásra az összegekkel együtt (de külön
            beolvasással - 3 darab -).

            a)	Az elemek kerüljenek Mapben mentésre, majd összeadásra és kiíratása.
            b)	Amennyiben a felhasználó 0 ft-os számlát ír, úgy azt törölje ki a
            Map-ből a program */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F56b_SzamlakOsszegzese_Megoldva {
    public static void main(String[] args) {
        Map<String, Integer> invoiceList = new HashMap<>();
        Scanner scan = new Scanner(System.in);

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

        System.out.println();
        System.out.println("A számlák:");

        for (Map.Entry mapElement : invoiceList.entrySet()) {
            System.out.println(mapElement.getKey() + ": " + mapElement.getValue() + " Ft");
        }
        // a végösszeg mehetett volna az első for ciklusba is, de inkább külön tettem egy for-each ciklusba, hogy ezt is gyakoroljam
        // más megoldást nem találtam a MAP values összeadására
        System.out.println();
        System.out.println("Összesen:");
        int totAmount = 0;
        for (Integer f : invoiceList.values()) {
            totAmount = totAmount + f;
        }
        System.out.println(totAmount +" Ft");
    }
}
