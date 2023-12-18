package Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class F91 {
    public static void main(String[] args) {
        List<String> foodlist = readFromFile("src/resources/actual-food.csv");
        analyseFoodList(foodlist);
    }

    public static List<String> readFromFile(String filename) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(filename));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("NEM LÉTEZIK");
        }
        return lines;
    }

    public static void analyseFoodList(List<String> list) {
        list.remove(0);
        for (String food : list) {
            String[] foodArray = food.split(", ");
            String actualFood = foodArray[0];
            int actualAmount = Integer.parseInt(foodArray[1]);
            int requireAmount = Integer.parseInt(foodArray[2]);
            System.out.println("Food: " + food);
            if (actualAmount <= requireAmount / 2)
                System.out.println(actualFood + " is less than needed. You should buy" + (requireAmount - actualAmount) + " to reach the required amount.");
        }
    }
}
