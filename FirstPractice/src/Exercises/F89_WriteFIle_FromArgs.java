package Exercises;

            /* 89. Feladat (Órai) (saját megoldás)
            Írjunk egy alkalmazást, amely biztonsági mentést készít a használt Program
            arguments-ekről. Ehhez készítsünk egy metódust, amely elvégzi a fájlba írást
            nekünk. A fájl neve legyen used_arguments.txt. */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class F89_WriteFIle_FromArgs {
    public static void main(String[] args) {
        String argsSum = convArgsToStringMet(args);
        writeToFile(argsSum);
        System.out.println(argsSum);
    }

    private static String convArgsToStringMet(String[] args) {
        String argSum = "";
        for (String item : args)
            argSum += item + System.lineSeparator();
        //  argSum += item + " ";
        return argSum;
    }

    private static void writeToFile(String argsSum) {
        try {
            Files.write(Paths.get("src/resources/used_arguments.txt"), argsSum.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
