package Temps.ReadFrom_WriteTo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("src/resources/Minden pakli.txt"));
        while (sc.hasNext()) {
            System.out.println(" " + sc.nextLine());
        //  System.out.print(" " + sc.nextLine());
        }

        System.out.println();

        // ez egy try-catch listában txt-t keresős módszer (az eredeti a FileReadingNotExising fájlban található)
        List<String> namesList = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/resources/myfile.txt"));
            for (String line : lines) {
            }
            namesList = lines;
        } catch (IOException e) {
            System.out.println("NEM LÉTEZIK");
        }
        System.out.println(namesList);
    }
}
