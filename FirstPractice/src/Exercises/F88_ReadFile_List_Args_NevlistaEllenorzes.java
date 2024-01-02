package Exercises;

            /* 88. Feladat (saját megoldás)
            Készítsetek programot, amely beolvas egy híres sportolókat tartalmazó fájlt, majd
            megvizsgálja, hogy a parancssori argumentumként megadott sportolót tartalmazza-e.
            Ha igen, írja ki hogy “It’s in the file”, egyébként pedig írja ki, hogy “No luck”
            a konzolra. */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/*
        main();
            namesReadFromFile();
            searchingDecide();
            print();
*/

public class F88_ReadFile_List_Args_NevlistaEllenorzes {
    public static void main(String[] args) {

        List<String> namesList = namesReadFromFile();

        boolean yON;
        try {
            yON = searchingDecide(namesList, args[0]);
            print(yON, args[0]);
        } catch (Exception e){
            System.out.println("Nincs argumentumból bejövő adat!");
        }
    }

    private static List<String> namesReadFromFile() {
            List<String> lines = new ArrayList<>();
            try {
                lines = Files.readAllLines(Paths.get("src/resources/hiresmagyarfutballistak.txt"));
            } catch (IOException e) {
                System.out.println ("Nem létezik a fájl!");
            }
        System.out.println(lines);
            return lines;
        }

    private static boolean searchingDecide(List<String> namesList, String arg) {
       return namesList.contains(arg);
    }

    private static void print(boolean yON, String arg) {
        if (yON)
            System.out.println(arg + " szerepel a listán.");
        else
            System.out.println(arg + " nem szerepel a listán.");
    }
}
