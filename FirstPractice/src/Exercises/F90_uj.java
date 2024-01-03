package Exercises;

            /* 90. Feladat (saját megoldás)
            Készítsétek el a classic bevásárlólista alkalmazást egyszerűsített változatát, amely
            beolvas a konzolról tételeket és darabszámokat (pl.: “tej 3db”). Ezen tételeket mentsük
            el egy String elemű listában. Készítsünk egy metódust, amely a paraméterül kapott
            String-et kiírja egy shoppinglist.txt-be. (Tehát a listát át kell alakítani, összefűzni
            egy hosszú Stringgé egy elválasztó karakter, pl vessző használatával) */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        main();
            readFromUser();
            convertListtoString();
            writeToFile();
*/

public class F90_uj {
    public static void main(String[] args) {
        List<String> shoppingList = readFromUser("Kérlek, add meg a bevásárlólista tételeit!");
        String shoppingListInString = convertListtoString(shoppingList);
        writeToFile(shoppingListInString);
    }

    public static List<String> readFromUser(String question) {
        List<String> shoppingList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println(question);
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n" + i + ". tétel:");
            shoppingList.add(scan.nextLine());
        }
        return shoppingList;
    }

    private static String convertListtoString(List<String> shoppingList) {
        String ListSum = "A bevásárlólista tételei: \n";
        for (String item : shoppingList)
            ListSum += item + "\n";
        return ListSum;
    }

    private static void writeToFile(String argsSum) {
        try {
            Files.write(Paths.get("src/resources/shoppinglist.txt"), argsSum.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}