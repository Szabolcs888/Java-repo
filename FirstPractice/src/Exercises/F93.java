package Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class F93 {
    public static void main(String[] args) {
        List<String> voteList = convertTextToArrayList();
        Map<String, Integer> voteMap = new HashMap<>();

        for (String vote : voteList) {
            if (voteMap.containsKey(vote)) {
                int originValue = voteMap.get(vote);
                voteMap.put(vote, originValue + 1);
            } else {
                voteMap.put(vote, 1);
            }
        }
        System.out.println(voteMap);
        System.out.println("---------A feladat---------");
        int voteSum = 0;
        for (Map.Entry mapElement : voteMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " szavazat");
            voteSum += Integer.parseInt(mapElement.getValue() + "");
        }
        System.out.println("---------B feladat---------");
        System.out.println("Total restaurant: " + voteMap.size());
        System.out.println("Total vote count: " + voteSum);

        System.out.println("---------C feladat---------");

        voteMap.remove("Essencia");
        for (Map.Entry mapElement : voteMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " szavazat");
            voteSum += Integer.parseInt(mapElement.getValue() + "");
        }
        System.out.println("---------D feladat---------");

        int oldValue = voteMap.get("Stand");
        //System.out.println(oldValue);

        for (Map.Entry mapElement : voteMap.entrySet()) {
            if ((mapElement.getKey() + "").equals("Stand")) {
                int bossCheat = 11;
                voteMap.put("Stand",oldValue + bossCheat);
            }
        }
        for (Map.Entry mapElement : voteMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " szavazat");
            voteSum += Integer.parseInt(mapElement.getValue() + "");
        }
        System.out.println("---------E feladat---------");

        Map.Entry<String,Integer> maxVote = null;

        for (Map.Entry<String, Integer> vote: voteMap.entrySet()){
            if(maxVote == null || vote.getValue().compareTo(maxVote.getValue()) > 0 ){
                maxVote = vote;
            }
        }
        System.out.println("Highest vote: " + maxVote.getValue());
    }


    public static List<String> convertTextToArrayList() {
        List<String> lines = new ArrayList<>();
        List<String> lines2 = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get("src/resources/restaurants.txt"));
            for (String line : lines) {
                line = line.replace("\"","");
                for (String line2 : line.split(", ")) {
                    lines2.add(line2);
                }
            }
        } catch (IOException e) {

            System.out.println("Nem létezik a fájl!");
        }
        return lines2;
    }
}
