package Exercises;

            /* 91. Feladat (saját megoldás)
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
            belőle annyit, amennyi hiányzik az ajánlott mennyiség eléréséhez.

            A fejléc ignorálást try-cath-vel oldottam meg, de meg lehetett volna oldani a
            lista 0-ik elemének törlésével is. Ill. jobb nem a splitnél beletenni a
            szóközt, hanem célszerűbb levágni trim-mel, mert így bármennyi szóköz lehet a
            a szó előtt és a végén is. */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class F91_ReadFile_List_Split_Elelmiszerlista {
    public static void main(String[] args) {
        List<String> foodsList = readFromFIle();
        analyseAndPrint(foodsList);
    }

    private static List<String> readFromFIle() {
        List<String> foodsList = new ArrayList<>();
        try {
            foodsList = Files.readAllLines(Paths.get("src/resources/actual-food-set.csv"));
            System.out.println("A meglévő élelmiszerek:");
            for (String line : foodsList) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Nem létezik a fájl!");
        }
        return foodsList;
    }

    private static void analyseAndPrint(List<String> foodsList) {
        System.out.println();
        // foodsList.remove(0);
        for (String item : foodsList) {
            String name = item.split(", ")[0];
            String amount = item.split(", ")[1];
            String requiredAmount = item.split(", ")[2];
            try {
                if (Integer.parseInt(amount) <= Integer.parseInt(requiredAmount) / 2)
                    System.out.println(name + " kevesebb van az elvártnál. " + (Integer.parseInt(requiredAmount) - Integer.parseInt(amount)) + " db-ot kell vásárolnod belőle.");
            } catch (NumberFormatException e) {
            }
        }
    }
}
