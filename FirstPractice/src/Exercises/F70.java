package Exercises;

import java.util.ArrayList;
import java.util.List;

public class F70 {


    public static void main(String[] args) {

        List<String> MainFruitList = getFruitList();
        List<String> transformNamesList = getFruitListBigS(MainFruitList);
        System.out.println(transformNamesList);
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
    private static List<String> getFruitListBigS(List<String> FruitList) {
        List<String> upperNamesList = new ArrayList<>();
        for (String name: FruitList) {
            upperNamesList.add(name.toUpperCase());
        }
        return upperNamesList;
    }
}