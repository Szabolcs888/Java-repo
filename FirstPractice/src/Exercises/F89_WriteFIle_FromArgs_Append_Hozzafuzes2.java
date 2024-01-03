package Exercises;

            /* 89. Feladat (Órai) (Zsolt megoldása)
            Írjunk egy alkalmazást, amely biztonsági mentést készít a használt Program
            arguments-ekről. Ehhez készítsünk egy metódust, amely elvégzi a fájlba írást
            nekünk. A fájl neve legyen used_arguments.txt.

            Ebben a példában több lehetséges megoldás van felsorolva */

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class F89_WriteFIle_FromArgs_Append_Hozzafuzes2 {
    public static void main(String[] args) {
        String res = convertProgramArgumentsToString(args);
        System.out.println(res);
        writeToFile(res, false);
        convertProgramArgumentsToString2(args);
    }

    public static void writeToFile(String content, boolean fileAppend) {
        try {
            if (fileAppend)
                Files.write(Paths.get("used_arguments.txt"), content.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND); //StandardOpenOption.APPEND fájl tartalmához való hozzáfűzése az új contentnek
            else
                Files.write(Paths.get("used_arguments.txt"), content.getBytes(StandardCharsets.UTF_8));  //felülírja a fájl tartalmát ha van már benne valami
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String convertProgramArgumentsToString(String[] arguments) {
        String result = "Arguments are the following: " + System.lineSeparator();
        for (int cycleVar = 0; cycleVar < arguments.length; cycleVar++) {
            result += arguments[cycleVar] + System.lineSeparator();
            //writeToFile(arguments[cycleVar] + System.lineSeparator(),true);
        }
        return result;
    }

    public static void convertProgramArgumentsToString2(String[] arguments) {
        String result = "Arguments are the following: " + System.lineSeparator();
        for (int cycleVar = 0; cycleVar < arguments.length; cycleVar++) {
            result += arguments[cycleVar] + System.lineSeparator();
        }
        writeToFile(result, true);
    }

    public static void writeList() throws IOException {
        List<String> names = Arrays.asList("Viktor", "József", "Benedek");
        String res = "";
        for (String name : names) {
            res += name;
        }
        Files.write(Paths.get("used_arguments.txt"), res.getBytes(StandardCharsets.UTF_8));  //felülírja a fájl tartalmát ha van már benne valami
    }
}
