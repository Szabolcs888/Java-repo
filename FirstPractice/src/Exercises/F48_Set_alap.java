package Exercises;

            /* 48. Feladat(Órai) (saját megoldás)
            Készítsünk egy halmazt a kedvenc gyümölcsökkel.
            Adjunk hozzá legalább 7 gyümölcsöt és foreach
            ciklus segítségével írassuk ki az elemeit a
            képernyőre egymás alá.  */

import java.util.HashSet;
import java.util.Set;

public class F48_Set_alap {
    public static void main(String[] args) {
        Set<String> favoriteFruits = new HashSet<>();

        favoriteFruits.add("alma");
        favoriteFruits.add("körte");
        favoriteFruits.add("szőlő");
        favoriteFruits.add("cseresznye");
        favoriteFruits.add("szeder");
        favoriteFruits.add("banán");
        favoriteFruits.add("narancs");

        System.out.println(favoriteFruits);
        for (String item : favoriteFruits)
            System.out.println(item);
    }
}
