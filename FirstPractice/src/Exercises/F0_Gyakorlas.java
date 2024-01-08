package Exercises;

import JavaCore.gyakorlas_Circle.Circle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

// Gyakorló fájl, bármikor törölhető a tartalma

public class F0_Gyakorlas {
     static List<String> namesList = new ArrayList<>();


    public static void main(String[] args) {
      //  List<String> namesList = new ArrayList<>();

        int num = 5;
        modositasSzam(num);
        System.out.println(num);

        String word = "    autó    ";
        // System.out.println(word);
        modositasString(word);
        // word =word.trim();
        // System.out.println(word.replace("a", "k"));
        System.out.println("mod. után: ");
        System.out.println(word);

        namesList.add("Hajó");
        namesList.add("Repülő");
        namesList.add("Busz");
        modositasList();
      //  System.out.println(namesList);

        Circle abc =new Circle(1);
      //  abc.getRad();
    }

    private static void modositasSzam(int num) {
        num = 8;
    }

    private static void modositasString(String word) {
       // word = "kutya";
        word = word.trim();
        word=word.replace("u", "w");
        System.out.println(word);
    }

    private static void modositasList() {
        namesList.remove(1);

    }

}



