package Exercises;

            /* 50.a Feladat (saját megoldás)
            Írjatok vendéglista programot, amit a felhasználó
            tud feltölteni. Házibulit szervezünk és tudjuk,
            hogy 11-en férnek el a lakásban. Tároljuk a
            vendégeket Set-ben, hogy ne kelljen arra figyelni,
            hogy valaki benne van-e a listában már vagy sem.
            Viszont oldjuk meg, hogy addig kérje inputként a
            program a vendégeket, amíg fel nem töltjük a 11 helyet. */

import java.util.*;

public class F50a_Set_Bulilista_FromUser {
    public static void main(String[] args) {

        Set<String> partyList = new HashSet<>();

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Kérlek, sorold fel a buli 11 résztvevőjét!");

        String newAdjust = "";
        for (int i = 1; i <= 11; i++) {
            System.out.println();
            System.out.println("A " + i + ". vendég:");
            newAdjust = scan.nextLine();
            if (!partyList.contains(newAdjust)) {
                partyList.add(newAdjust);
            } else {
                System.out.println(newAdjust + " már szerepel a listán, kérlek adj meg másik nevet!");
                i--;
            }
        }
        System.out.println();
        System.out.println("A buli résztvevői: ");
        for (String item : partyList)
            System.out.println(item);
    }
}
