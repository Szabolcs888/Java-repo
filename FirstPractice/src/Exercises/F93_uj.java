package Exercises;

            /* 93. Feladat (saját megoldás)
            Módosítsátok az 58-as feladat megoldását úgy, hogy az éttermek egy
            restaurants.txt-ből jöjjenek az előre definiált arraylist helyett,
            valamint a megoldás is egy restaurantsVoteCount.txt-be kerüljön. */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class F93_uj {

    public static void main(String[] args) {
        List<String> voteListAsString = readFromFile("src/resources/restaurants.txt");
        List<String> voteList = splitvoteList(voteListAsString);
       // Map<String, Integer> votelistInMap = voteListInMap(voteList);

        //  String splitVoteListinString(voteListinString);
        System.out.println(voteListAsString);
        System.out.println(voteList);
        System.out.println(voteList.size());

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

    private static List<String> splitvoteList(List<String> voteListAsString) {
        String splitString = voteListAsString.get(0);
        splitString = splitString.replace("\"", "");
        List<String> voteList = new ArrayList<String>(Arrays.asList(splitString.split(",")));
        return voteList;
    }

    private static Map<String, Integer> voteListInMap(List<String> voteList) {
   }

}
