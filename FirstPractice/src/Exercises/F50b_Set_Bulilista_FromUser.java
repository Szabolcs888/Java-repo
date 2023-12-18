package Exercises;

            /* 50.b Feladat (saját megoldás)
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

public class F50b_Set_Bulilista_FromUser {
    public static void main(String[] args) {

        Set<String> partyList = new HashSet<>();

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int adjustCount = 0;
        System.out.println();
        System.out.println("Mennyi résztvevős legyen a buli?");
        adjustCount = scan.nextInt();

        String newAdjust = "";
        for (int i = 1; i <= adjustCount; i++) {
            System.out.println();
            System.out.println("A " + i + ". vendég:");
            newAdjust = scan2.nextLine();
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
