package Temps.ReadFrom_WriteTo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) throws IOException {

        // olvasás txt-ből és listába importálás (soronként kerül új elem a listába)
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/resources/firstWriting.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
            System.out.println(lines.size());
        } catch (IOException e) {
            System.out.println("Nem létezik a fájl!");
        }

        System.out.println();

        // olvasás csv fájlból és listába importálás
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/resources/trainings.csv"));
            System.out.println(lines);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
            // A beolvasásnál ha bármilyen hibával szembesülünk, például nem létezik a fájl, vagy valaki más
            // használja, akkor egy IOException-t kapunk. Ez egy olyan hiba amit le kell kezelnünk, viszont mivel
            // ez általában elég komoly hibát szokott jelenteni, így a programot külső beavatkozás nélkül nem
            // nagyon lehet segíteni, így tovább forgatjuk egy RuntimeException-be, amit majd a felhasználó lát.
        }


        System.out.println();

        // beolvasás másik módszerrel és Stringbe írás
        String writingFileItemToString = "";
        try {
            Scanner scan = new Scanner(new File("src/resources/Minden pakli.txt"));
            while (scan.hasNext()) {
                System.out.println(" " + scan.nextLine());  // kiíratás soronként
                // System.out.print(" " + scan.nextLine()); // kiíratás egy sorban
                writingFileItemToString += (" " + scan.nextLine()); // Stringbe írás
            }
        } catch (Exception e) {
        }
        System.out.println(writingFileItemToString);
    }
}

