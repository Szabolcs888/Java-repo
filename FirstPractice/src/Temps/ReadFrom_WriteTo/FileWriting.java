package Temps.ReadFrom_WriteTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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
    }
}
