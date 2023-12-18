package Exercises;

            /* 50.a Feladat (Zsolt megoldása)
            Írjatok vendéglista programot, amit a felhasználó
            tud feltölteni. Házibulit szervezünk és tudjuk,
            hogy 11-en férnek el a lakásban. Tároljuk a
            vendégeket Set-ben, hogy ne kelljen arra figyelni,
            hogy valaki benne van-e a listában már vagy sem.
            Viszont oldjuk meg, hogy addig kérje inputként a
            program a vendégeket, amíg fel nem töltjük a 11 helyet. */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class F50a_Set_Bulilista_FromUser2 {
    public static void main(String[] args) {
        Set<String> guests = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int partySize = 11;

        while (guests.size() != partySize) {
            System.out.println("Who to invite:");
            guests.add(sc.nextLine());
        }

        System.out.println("Invited guests: " + guests);
    }
}
