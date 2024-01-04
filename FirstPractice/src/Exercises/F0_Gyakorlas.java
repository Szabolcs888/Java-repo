package Exercises;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.SimpleDoc;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

// Gyakorló fájl, bármikor törölhető a tartalma

public class F0_Gyakorlas {
    public static void main(String[] args) {

        List<String> szetvalasztandoElemekListaja = Arrays.asList("a, b, c, d", "g, j, k");
        List<String> lines2 = new ArrayList<>();
        for (String line : szetvalasztandoElemekListaja) {
            for (String item : line.split(", ")) {
                System.out.println(item);
                lines2.add(item);
            }
        }

        System.out.println(szetvalasztandoElemekListaja.size());
        System.out.println(lines2.size());

        String text = ("m, n, o, p");
        List<String> lines3 = new ArrayList<>();
        for (int i = 0; i < text.length()/2-1; i++) {
            lines3.add(text.split(", ")[i]);
        }
        System.out.println();
        System.out.println(lines3.size());
        System.out.println(lines3);
    }
}

