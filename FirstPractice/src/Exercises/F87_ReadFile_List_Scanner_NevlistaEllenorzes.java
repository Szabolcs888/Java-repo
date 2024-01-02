package Exercises;

            /* 87. Feladat (Órai) (saját megoldás)
            Adott egy neveket tartalmazó fájl. Készítsünk egy programot, ami beolvassa annak
            tartalmát és megvizsgálja, hogy a console-ról beolvasott név benne van-e.

            Túlbonyolítottam, mert nem kellett volna a Stringeket végignézni, elegendő lett
            volna a (namesList.contains(nameToFind)) feltétellel eldönteni, hogy szerepel-e
            az adott név a listában, vagy sem. */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        main();
            namesReadFromFile();
            readFromUser();
            analysingNames();
            print();
*/

public class F87_ReadFile_List_Scanner_NevlistaEllenorzes {
    public static void main(String[] args) {
        List<String> namesList = namesReadFromFile();
        String userFavName = readFromUser("Kérek egy lánynevet:");
        boolean yON = analysingNames(namesList, userFavName);
        print(yON, userFavName);

    }

    private static List<String> namesReadFromFile() {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get("src/resources/lanynevlista.txt"));
        } catch (IOException e) {
            System.out.println("Nem létezik a fájl!");
        }
        return lines;
    }

    public static String readFromUser(String question) {
        Scanner scan = new Scanner(System.in);
        System.out.println(question);
        return scan.nextLine();
    }

    private static boolean analysingNames(List<String> namesList, String userFavName) {
        boolean yON = false;
        for (String name : namesList) {
            if (name.contains(userFavName) && name.length() == userFavName.length()) {
                yON = true;
            }
        }
        return yON;
    }

    private static void print(boolean yON, String userFavName) {
        if (yON)
            System.out.println("A(z) " + userFavName + " szerepel a listán.");
         else
            System.out.println("A(z) " + userFavName + " nem szerepel a listán.");
    }
}