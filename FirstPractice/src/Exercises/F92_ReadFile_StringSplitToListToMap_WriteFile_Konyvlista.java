package Exercises;

            /* 92. Feladat (saját megoldás)
            Módosítsátok az 57-es feladat megoldását úgy, hogy a könyvek egy books.txt-ből jöjjenek az
            előre definiált arraylist helyett, valamint a megoldás is egy booksCount.txt-be kerüljön. */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/*
        main();
            readFromFile();
            splitBooksString(booksString);
            booklistInMapMet(bookList);
            deleteOnceBooks();
            changeFourToThree();
            print();
            writeToFile();
*/

public class F92_ReadFile_StringSplitToListToMap_WriteFile_Konyvlista {
    public static void main(String[] args) {
        List<String> booksString = readFromFile("src/resources/booksList.txt");
        List<String> bookList = splitBooksString(booksString);
        Map<String, Integer> booklistInMap = booklistInMapMet(bookList);
        deleteOnceBooks(booklistInMap);
        changeFourToThree(booklistInMap);
        int sum = print(booklistInMap);
        writeToFile(booklistInMap, sum);
    }

    private static List<String> readFromFile(String path) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.out.println("Nem létezik a fájl!");
        }
        return lines;
    }

    private static List<String> splitBooksString(List<String> booksString) {
        String splitString = booksString.get(0);
        splitString = splitString.replace("\"", "");
        List<String> bookList = new ArrayList<String>(Arrays.asList(splitString.split(",")));
        return bookList;
    }

    private static Map<String, Integer> booklistInMapMet(List<String> bookList) {
        Map<String, Integer> booklistInMap = new HashMap<>();
        for (String book : bookList) {
            book = book.trim();
            if (booklistInMap.containsKey(book)) {
                int originValue = booklistInMap.get(book);
                booklistInMap.put(book, originValue + 1);
            } else {
                booklistInMap.put(book, 1);
            }
        }
        return booklistInMap;
    }

    private static void deleteOnceBooks(Map<String, Integer> booklistInMap) {
        for (int i = 0; i < booklistInMap.size(); i++) {
            booklistInMap.values().remove(1);
        }
    }

    private static void changeFourToThree(Map<String, Integer> booklistInMap) {
        for (Map.Entry mapElement : booklistInMap.entrySet()) {
            if (mapElement.getValue().equals(4)) {
                booklistInMap.put(mapElement.getKey() + "", 3);
            }
        }
    }

    private static int print(Map<String, Integer> booklistInMap) {
        int sum = 0;
        for (Integer number : booklistInMap.values()) {
            sum = sum + number;
        }
        System.out.println("Összesen " + sum + " könyv van.");
        System.out.println("Összesen " + booklistInMap.size() + " különböző könyv van.");
        System.out.println();
        for (Map.Entry mapElement : booklistInMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + "db");
        }
        return sum;
    }

    private static void writeToFile(Map<String, Integer> booklistInMap, int sum) {
        String content = "Összesen " + sum + " könyv van.\n" +
                "Összesen " + booklistInMap.size() + " különböző könyv van.\n\n";
        for (Map.Entry mapElement : booklistInMap.entrySet()) {
            content += mapElement.getKey() + " - " + mapElement.getValue() + "db \n";
        }
        try {
            Files.write(Paths.get("src/resources/booksCount.txt"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
