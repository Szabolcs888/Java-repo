package Exercises;

            /* 53. Feladat (Órai) (saját megoldás)
            Készítsünk egy Map-et kedvenc gyümölcsökkel. Adjunk hozzá a
            listához legalább 7 gyümölcsöt és egy értéket, hogy mennyire
            szeretjük. Ez az érték 1-3 között lehet, mely esetén a 3 amit
            jobban szeretünk. Foreach ciklus segítségével írassuk ki az
            elemeit a képernyőre egymás alá. */

import java.util.HashMap;
import java.util.Map;

public class F53_Map_alap {
    public static void main(String[] args) {

        Map<String, Integer> myFavoriteFruits = new HashMap<>();

        myFavoriteFruits.put("alma", 2);
        myFavoriteFruits.put("körte", 3);
        myFavoriteFruits.put("narancs", 3);
        myFavoriteFruits.put("banán", 3);
        myFavoriteFruits.put("cseresznye", 2);
        myFavoriteFruits.put("szeder", 3);
        myFavoriteFruits.put("ringlo", 2);

        for (Map.Entry mapElement : myFavoriteFruits.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }
    }
}
