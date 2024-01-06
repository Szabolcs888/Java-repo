package Temps.ReadFrom_WriteTo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {
/*
        // írás fájlba a Files.write() metódussal felülírással
        try {
            String content = "Hello. This is great. I could create a file from java.";
            Files.write(Paths.get("src/resources/firstWriting.txt"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
 */

        // írás fájlba hozzáfűzéssel
        try {
            String content = " New data.";
            Files.write(Paths.get("src/resources/firstWriting.txt"), content.getBytes("UTF-8"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // írás fájlba létrehozással, majd ha már létezik, hozzáfűzéssel
        String content;
        try {
            content = ("Szervusz"+System.lineSeparator());
            Files.write(Paths.get("src/resources/rng.txt"), content.getBytes("UTF-8"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("valami nem jó");
            try {
                content = ("Szervusz"+System.lineSeparator());
                Files.write(Paths.get("src/resources/rng.txt"), content.getBytes("UTF-8"));

            } catch (IOException j) {
                System.out.println("valami nem jó");
            }
        }



    // mappa létrehozása
        new File("src/resources/ujMappa").mkdirs();
    }

    // mappa és fájl létrehozása paraméterként érkező tartalommal, elérési úttal és névvel
    public static void writeToFileWithCustomParams(String content, String path, String filename) {
        try {
            new File(path).mkdirs();  //mappa létrehozása, amennyiben még nem létezik
            Files.write(Paths.get(path + "/" + filename), content.getBytes(StandardCharsets.UTF_8));  // "savedFiled/shoppinglist.txt"
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // mappa és fájl létrehozása paraméterrel (tartalommal) és usertől bekért elérési úttal és névvel
    public static void writeToFileWithCustomPath(String content) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Add a path (director) to save the file");  // savedFiles
            String path = scanner.nextLine();
            System.out.println("Add the name of the file");
            String name = scanner.nextLine();                             //shoppinglist.txt

            new File(path).mkdirs();  //mappa létrehozása, amennyiben még nem létezik
            Files.write(Paths.get(path + "/" + name), content.getBytes(StandardCharsets.UTF_8));  // "savedFiled/shoppinglist.txt"
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
