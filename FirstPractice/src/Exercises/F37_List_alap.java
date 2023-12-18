package Exercises;

            /* 37.Feladat (Órai) (saját megoldás)
            Készítsünk egy listát kedvenc gyümölcsökkel. Adjunk hozzá
            a listához legalább 7 gyümölcsöt és foreach ciklus segítségével
            írassuk ki az elemeit a képernyőre egymás alá. */

import java.util.Arrays;
import java.util.List;

public class F37_List_alap {
    public static void main(String[] args) {

        List<String> fruitList = Arrays.asList("alma", "körte", "banán", "narancs", "szilva", "dinnye", "szeder");

        for (String item : fruitList)
            System.out.println(item);
    }
}
