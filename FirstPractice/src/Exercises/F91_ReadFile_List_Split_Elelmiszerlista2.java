package Exercises;

            /* 91. Feladat (Zsolt megoldása)
            Készítsetek egy élelmiszerkészlet alkalmazást. Tegyük fel, hogy van egy fájl,
            ami tartalmazza, hogy éppen milyen típusú élelmiszerből mennyi van otthon, és
            hogy mennyi az ajánlott mennyiség. A fájl hasonlóan néz ki ehhez:
            (actual-food-set.csv).

            Name, Amount, Required Amount
            Coffee, 17, 25
            Milk, 0, 3
            Cola, 1, 2
            Orange, 4, 5
            Oat flakes, 2, 4

            A feladat, hogy készítsünk egy programot, ami értesít minket arról, hogyha
            valamelyik komponensből 50%, vagy annál kevesebb van, és szól, hogy vegyünk
            belőle annyit, amennyi hiányzik az ajánlott mennyiség eléréséhez. */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class F91_ReadFile_List_Split_Elelmiszerlista2 {
    public static void main(String[] args) {
        List<String> foodList = readFromFile("src/resources/actual-food-set.csv");
        analyseFoodList(foodList);
    }

    public static List<String> readFromFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(fileName));
            /*
            for (String line : lines) {
                System.out.println(line);
            }
            */
        } catch (IOException e) {
            System.out.println("NEM LÉTEZIK");
        }

        return lines;
    }

    public static void analyseFoodList(List<String> list) {
        list.remove(0);
        for (String food : list) {
            // Coffee, 17, 25
            System.out.println("Food: " + food);
            String[] foodArray = food.split(", ");
            String actualFood = foodArray[0];
            int actualAmount = Integer.parseInt(foodArray[1]);
            int requiredAmount = Integer.parseInt(foodArray[2]);
            if (actualAmount <= requiredAmount / 2) {
                System.out.println(actualFood + " is less than needed. You should buy " + (requiredAmount - actualAmount) + " to reach the required amount.");
            }
        }
    }
}