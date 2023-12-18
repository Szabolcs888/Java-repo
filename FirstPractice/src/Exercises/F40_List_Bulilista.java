package Exercises;

            /* 40.Feladat (saját megoldás)
            Írjatok vendéglista programot, amit a felhasználó
            tud feltölteni. Házibulit szervezünk és tudjuk, hogy
            11-en férnek el a lakásban. Azonban fontos, hogy egy
            vendéget csak egyszer adhasson hozzá a felhasználó. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F40_List_Bulilista {
    public static void main(String[] args) {

        List<String> partyList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Kérlek, sorold fel a buli 11 résztvevőjét!");

        for (int i = 1; partyList.size() < 11; i++) {
            System.out.println();
            System.out.println(i + ". vendég:");
            String adult = scan.next();
            if (partyList.contains(adult)) {
                System.out.println(adult + " már szerepel a listán");
                i--;
            } else {
                partyList.add(adult);
            }
        }

        System.out.println();
        System.out.println("A bulira meghívott emberek:");
        for (String item : partyList)
            System.out.println(item);
    }
}
