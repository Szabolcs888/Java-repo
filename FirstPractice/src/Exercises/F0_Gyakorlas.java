package Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

// Gyakorló fájl, bármikor törölhető a tartalma

public class F0_Gyakorlas {
    public static void main(String[] args) {
        rng();
    }

    private static void rng() {
        Random random = new Random();
        int num1 = 0;
        int num2 =0;
        int num3 = 0;

        for (int i = 0; i < 10; i++) {
            num1 = random.nextInt(12) + 1;
            num2 = random.nextInt(12) + 1;
            num3 = random.nextInt(12) + 1;
            System.out.println(num1 + ", " + num2 + ", " + num3);
            writeToFile(num1,num2,num3);
        }
    }

private static void writeToFile(int num1, int num2, int num3) {
    String content;
    try {
            content = (num1 + ", " + num2 + ", " + num3 +System.lineSeparator());
            Files.write(Paths.get("src/resources/rng.txt"), content.getBytes("UTF-8"), StandardOpenOption.APPEND);
    } catch (IOException e) {
        System.out.println("valami nem jó");
        try {
            content = (num1 + ", " + num2 + ", " + num3 + ", "+System.lineSeparator());
            Files.write(Paths.get("src/resources/rng.txt"), content.getBytes("UTF-8"));

        } catch (IOException j) {
            System.out.println("valami nem jó");
        }
    }

}
}



