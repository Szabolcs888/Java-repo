package Temps.ReadFrom_WriteTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriting {
    public static void main(String[] args) {

        // írás txt-be a Files.write() metódussal
        try {
            String content = "Hello. This is great. I could create a file from java.";
            Files.write(Paths.get("src/resources/firstWriting.txt"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
