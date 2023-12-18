package Exercises;

            /* 37.Feladat (Órai) (Tamás megoldása)
            Készítsünk egy listát kedvenc gyümölcsökkel. Adjunk hozzá
            a listához legalább 7 gyümölcsöt és foreach ciklus segítségével
            írassuk ki az elemeit a képernyőre egymás alá. */

import java.util.ArrayList;
import java.util.List;

public class F37_List_alap2_FeltoltesKiolvasas {
    public static void main(String[] args) {
        List<String> favFruits = new ArrayList<>();
        favFruits.add("Apple");
        favFruits.add("Banana");
        favFruits.add("Melon");
        favFruits.add("Mano");
        favFruits.add("Orange");

        for (int i = 0; i < favFruits.size(); i++) {
            System.out.println(favFruits.get(i));
        }

        System.out.println("----------------");

        for (String fruit : favFruits) {
            System.out.println(fruit);
        }
    }
}