package Temps.ReadFrom_WriteTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndSearchFromFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a name to search.");
        String nameToFind = scanner.nextLine();

        List<String> namesList = new ArrayList<>();
        try {
            namesList = Files.readAllLines(Path.of("src/resources/myfile.txt"));
        } catch (IOException e) {
            System.out.println("I can't find the file that you request.");
        }
        System.out.println("File data: " + namesList);

        if(namesList.contains(nameToFind))
            System.out.println("Hurray I found the name in the list");
        else
            System.out.println("The name was not in the list");
    }
}