package Exercises;

            /* 50.b Feladat (Zsolt megoldása)
            Írjatok vendéglista programot, amit a felhasználó
            tud feltölteni. Házibulit szervezünk és a felhasználó
            a program indításakor dönti el, hogy hány
            vendéget szeretne meghívni. Tároljuk a
            vendégeket Set-ben, hogy ne kelljen arra figyelni,
            hogy valaki benne van-e a listában már vagy sem.
            Viszont oldjuk meg, hogy addig kérje inputként a
            program a vendégeket, amíg fel nem töltjük a megadott
            létszámot. */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class F50b_Set_Bulilista_FromUser2 {
    public static void main(String[] args) {
        Set<String> guests = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("How many people do you want to invite? ");
        int partySize = sc.nextInt();

        while (guests.size() != partySize) {
            System.out.println("Who to invite:");
            guests.add(sc2.nextLine());
        }

        System.out.println("Invited guests: " + guests);
    }
}
