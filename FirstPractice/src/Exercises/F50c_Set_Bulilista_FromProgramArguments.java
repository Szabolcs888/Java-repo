package Exercises;

            /* 50.c Feladat (saját megoldás)
            Írjatok vendéglista programot, amit Program
            Arguments-ből olvasunk be. Házibulit szervezünk
            és tudjuk, hogy 11-en férnek el a lakásban. Tároljuk
            a vendégeket Set-ben, hogy ne kelljen arra figyelni,
            hogy valaki benne van-e a listában már vagy sem.
            Viszont oldjuk meg, hogy addig kérje inputként a
            program a vendégeket, amíg fel nem töltjük a 11 helyet. */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class F50c_Set_Bulilista_FromProgramArguments {
    public static void main(String[] args) {

        Set<String> partyList = new HashSet<>();

        String newAdjust = "";
        for (int i = 0; i <= 10; i++) {
            newAdjust = (args[i]);
            if (!partyList.contains(newAdjust)) {
                partyList.add(newAdjust);
            } else {
                System.out.println(newAdjust + " már szerepel a listán, kérlek adj meg másik nevet!");
                i--;
            }
        }
        System.out.println();
        System.out.println("A buli 11 résztvevője: ");
        for (String item : partyList)
            System.out.println(item);
    }
}
