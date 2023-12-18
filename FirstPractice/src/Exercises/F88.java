package Exercises;

/*
88)	Készítsetek programot, amely beolvas egy híres sportolókat tartalmazó fájl,
 majd megvizsgálja, hogy a parancssori argumentumként megadott sportolót tartalmazza-e.
  Ha igen, írja ki hogy “It’s in the file”, egyébként pedig írja ki, hogy “No luck” a konzolra.
 */

// az ékezetes kódolás!!!


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
public class F88 {
    public static void main(String[] args) {

        String namesList = "";
        try {
            namesList = Files.readAllLines(Path.of("/progmatic/repository_projects/Java-repo/First practice/src/Temps/ReadFrom_WriteTo/hiresSportolok.txt"), namesList.g("UTF-8"));
                                                                                                                                            //firstWriting.txt"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            System.out.println("I can't find the file that you request.");
        }
        System.out.println("File data: " + namesList);

        if(namesList.contains(args[0]))
            System.out.println("Hurray I found the name in the list");
        else
            System.out.println("The name was not in the list");
    }
}

 */


