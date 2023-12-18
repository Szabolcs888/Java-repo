package Exercises;

            /* 37.Feladat (Órai) (Tamás megoldása)
            Készítsünk egy listát kedvenc gyümölcsökkel. Adjunk hozzá
            a listához legalább 7 gyümölcsöt és foreach ciklus segítségével
            írassuk ki az elemeit a képernyőre egymás alá. */

import java.util.ArrayList;
import java.util.List;

public class F69_List_alap2_FeltoltesKiolvasas {
    public static void main(String[] args) {

        List<String> MainFavFruits = getFruitList();

        //System.out.println(MainFavFruits);
        printFruitListWithFor(MainFavFruits);
        printFruitListWithForeach(MainFavFruits);
    }

    public static List<String> getFruitList() {
        List<String> favFruits = new ArrayList<>();
        favFruits.add("Apple");
        favFruits.add("Banana");
        favFruits.add("Melon");
        favFruits.add("Mano");
        favFruits.add("Orange");
        return favFruits;
    }

    public static void printFruitListWithFor(List<String> LocalFruitList) {
        for (int i = 0; i < LocalFruitList.size(); i++) {
            System.out.println(LocalFruitList.get(i));
        }
    }

    public static void printFruitListWithForeach(List<String> LocalFruitList2) {
        for (String fruit : LocalFruitList2) {
            System.out.println(fruit);
        }
    }
}


