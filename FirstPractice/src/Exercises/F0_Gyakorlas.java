package Exercises;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.SimpleDoc;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

// Gyakorló fájl, bármikor törölhető a tartalma

public class F0_Gyakorlas {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("src/resources/Minden pakli.txt"));
        while (sc.hasNext()) {
            System.out.println(" " + sc.nextLine());
            // System.out.print(" " + sc.nextLine());
        }
    }
}

