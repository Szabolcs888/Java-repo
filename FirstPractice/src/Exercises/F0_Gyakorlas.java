package Exercises;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.SimpleDoc;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

// Gyakorló fájl, bármikor törölhető a tartalma

public class F0_Gyakorlas {
    public static void main(String[] args) {
        Map<String, Integer> adultsAges = new HashMap<>();
        adultsAges.put("Géza", 22);
        adultsAges.put("Anikó", 19);
        adultsAges.put("Erzsébet", 45);
        adultsAges.put("Mária", 30);
        System.out.println(adultsAges);

        int c = 1;
        adultsAges.put("Géza", c+1);

        System.out.println(adultsAges);
    }
}

