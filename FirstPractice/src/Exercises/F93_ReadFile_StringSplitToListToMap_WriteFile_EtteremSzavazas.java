package Exercises;

            /* 93. Feladat (saját megoldás)
            Módosítsátok az 58-as feladat megoldását úgy, hogy az éttermek egy
            restaurants.txt-ből jöjjenek az előre definiált arraylist helyett,
            valamint a megoldás is egy restaurantsVoteCount.txt-be kerüljön. */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/*
        main();
            readFromFile();
            splitvoteList();
            votesListToMapMethod();
            voteModifies();
            whoIsWinner();
            printResult();
            writeToFile();
*/

public class F93_ReadFile_StringSplitToListToMap_WriteFile_EtteremSzavazas {

    public static void main(String[] args) {
        String voteListAsString = readFromFile("src/resources/restaurants.txt");
        List<String> voteList = splitvoteList(voteListAsString);
        Map<String, Integer> votelistInMap = votesListToMapMethod(voteList);
        voteModifies(votelistInMap);
        String winner = whoIsWinner(votelistInMap);
        int sum = printResult(votelistInMap, winner);
        writeToFile(votelistInMap, winner, sum, "src/resources/restaurantsVoteCount.txt");
    }

    private static String readFromFile(String path) {
        String readFromFile = "";
        try {
            File fileDirs = new File(path);
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDirs), "ISO-8859-1"));
            String str;
            while ((str = in.readLine()) != null) {
                readFromFile += str + ", ";
            }
        } catch (Exception e) {
        }
        return readFromFile;
    }

    private static List<String> splitvoteList(String voteListAsString) {
        voteListAsString = voteListAsString.replace("\"", "").trim();
        List<String> voteList = new ArrayList<String>(Arrays.asList(voteListAsString.split(",")));
        return voteList;
    }

    private static Map<String, Integer> votesListToMapMethod(List<String> voteList) {
        Map<String, Integer> votelistInMap = new HashMap<>();
        for (String restaurant : voteList) {
            restaurant = restaurant.trim();
            if (votelistInMap.containsKey(restaurant)) {
                int originValue = votelistInMap.get(restaurant);
                votelistInMap.put(restaurant, originValue + 1);
            } else {
                votelistInMap.put(restaurant, 1);
            }
        }
        return votelistInMap;
    }

    private static void voteModifies(Map<String, Integer> votelistInMap) {
        votelistInMap.remove("Essencia");
        votelistInMap.put("Stand", votelistInMap.get("Stand") + 11);
    }

    private static String whoIsWinner(Map<String, Integer> votelistInMap) {
        int biggerNum = votelistInMap.get("Salt");
        String winner = "Salt";
        for (Integer number : votelistInMap.values()) {
            if (biggerNum < number) {
                biggerNum = number;
            }
        }
        for (Map.Entry mapElement : votelistInMap.entrySet()) {
            if (mapElement.getValue().equals(biggerNum)) {
                winner = mapElement.getKey() + "";
            }
        }
        return winner;
    }

    private static int printResult(Map<String, Integer> votelistInMap, String winner) {
        int sum = 0;
        for (Integer number : votelistInMap.values()) {
            sum = sum + number;
        }
        System.out.println(votelistInMap + System.lineSeparator());
        System.out.println(votelistInMap.size() + " étteremre lehetett szavazni.");
        System.out.println("Összesen " + sum + " szavazat érkezett." + System.lineSeparator());
        System.out.println("A szavazatok eloszlása:");

        for (Map.Entry mapElement : votelistInMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " szavazat");
        }
        System.out.println(System.lineSeparator() + "A szavazást a(z) " + winner + " nyerte.");
        return sum;
    }

    private static void writeToFile(Map<String, Integer> votelistInMap, String winner, int sum, String path) {
        String votesWritesToFile = "";
        for (Map.Entry mapElement : votelistInMap.entrySet()) {
            votesWritesToFile = votesWritesToFile + mapElement.getKey() + " - " + mapElement.getValue() + " szavazat" + System.lineSeparator();
        }
        try {
            String content = votelistInMap.size() + " étteremre lehetett szavazni." + System.lineSeparator() +
                    "Összesen " + sum + " szavazat érkezett." + System.lineSeparator() + System.lineSeparator() +
                    "A szavazatok eloszlása:" + System.lineSeparator() + votesWritesToFile + System.lineSeparator() +
                    "A szavazást a(z) " + winner + " nyerte.";

            Files.write(Paths.get(path), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

