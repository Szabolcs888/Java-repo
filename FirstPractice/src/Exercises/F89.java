package Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class F89 {
    public static void main(String[] args) {
        String res = convertArgumentsToString(args);
        System.out.println(res);
        writeToFIle(res);
    }

    public static void writeToFIle(String content) {
        try {
            Files.write(Paths.get("/progmatic/repository_projects/Java-repo/First practice/src/Exercises/used_Arguments.txt"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String convertArgumentsToString(String[] arguments) {
        String result = " " + System.lineSeparator();
        for (int cycleVar = 0; cycleVar < arguments.length; cycleVar++) {
            result += arguments[cycleVar]+ System.lineSeparator();
        }
        return result;
    }
}
