package Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class F92 {
    public static void main(String[] args) {
        convertTextToArrayList();
        Map<String, Integer> booksMap = new ConcurrentHashMap<>();

        for (String book : convertTextToArrayList()) {
            if (booksMap.containsKey(book)) {
                int originValue = booksMap.get(book);
                booksMap.put(book, originValue + 1);
            } else {
                booksMap.put(book, 1);
            }
        }
        System.out.println("---------A feladat---------");
        // a/b)
        int sum = 0;
        for (Map.Entry mapElement : booksMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " darab");
            sum += Integer.parseInt(mapElement.getValue() + "");
        }
        System.out.println("Total count of books: " + sum);
        System.out.println("---------B feladat---------");
        // b)
        System.out.println("Total count of books: " + convertTextToArrayList().size());
        System.out.println("Count of books with different titles: " + booksMap.size());
        System.out.println("---------C és D feladat---------");
        // c)

        for (Map.Entry mapElement : booksMap.entrySet()) {
            if ((mapElement.getValue() + "").equals("1")) {
                booksMap.remove(mapElement.getKey());
            }
            if ((mapElement.getValue() + "").equals("4")) {
                booksMap.put(mapElement.getKey() + "", 3);
            }
        }
        System.out.println(booksMap);
    }

    public static List<String> convertTextToArrayList() {
        List<String> lines = new ArrayList<>();
        List<String> lines2 = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get("src/resources/books.txt"));
            for (String line : lines) {
                for (String line2 : line.split(", ")) {
                    System.out.println(line2);
                    lines2.add(line2);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines2;
    }
}