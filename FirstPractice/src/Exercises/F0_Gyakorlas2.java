package Exercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class F0_Gyakorlas2 {
    static public void main(String args[]) {
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
    }
}


