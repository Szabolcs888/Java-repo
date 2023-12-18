package Exercises;

            /* 56.a Feladat (saját megoldás)
            Készítsetek egy számla végösszeg kalkulátor programot, amelybe
            be lehet rögzíteni az adott hónap különböző számláinak az
            összegét. A program pedig összeadja őket és kiírja, mennyit
            kell a családi kasszából fizetni összesen. Magát, hogy milyen
            számla az amit be kell fizetni, az is kerüljön beolvasásra az
            összegekkel együtt (de külön beolvasással - 3 darab -). Az
            elemek kerüljenek Mapben mentésre, majd összeadásra és kiíratásra. */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F56a_Map_Szamlalista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> invoiceList = new HashMap<>();

        for (int i = 1; i < 4; i++) {
            System.out.println();
            System.out.println("Kérlek, add meg a(z) " + i + ". számla nevét:");
            String element = scan.nextLine();
            System.out.println("Összegét:");
            int amount = Integer.parseInt(scan.nextLine());
            invoiceList.put(element, amount);
        }
        System.out.println();
        System.out.println("A számlák:");
        for (Map.Entry mapElement : invoiceList.entrySet()) {
            System.out.println(mapElement.getKey() + ": " + mapElement.getValue() + "ft");
        }
        int sum = 0;
        for (Map.Entry mapElement : invoiceList.entrySet()) {
            sum = sum + Integer.parseInt(mapElement.getValue() + "");
        }
        System.out.println();
        System.out.println("A számlák végösszege: " + sum + "ft");
    }
}
