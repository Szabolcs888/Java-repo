package Temps.ReadFrom_WriteTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WritingToFile {
    public static void main(String[] args) {
        try {
            String content = "Hello." + System.lineSeparator() + "This is great. " + System.lineSeparator() + "I could create a file from java."+ System.lineSeparator() + "És még valami.";
            Files.write(Paths.get("/progmatic/repository_projects/Java-repo/First practice/src/Temps/ReadFrom_WriteTo/firstWriting.txt"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
