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
/*
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

 */
/*
        String text = ("m, n, o, p");
        List<String> lines3 = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            String a = text.charAt(i) +"";
            int c = 0;
           // if (!a.equals(","))

            if (a.equals(","))
              //  for (int j = 0; j < 2; j++) {
                    lines3.add(text.split(", ")[i]);

            //    }
            c+= c;
        }
        System.out.println();
        System.out.println(lines3.size());
        System.out.println(lines3);

 */
        double dbl = 2.2;
        modositasDouble(dbl);
        System.out.println(dbl);

        int num = 5;
        modositasSzam(num);
        System.out.println(num);

        ////////////////////////////////////////////////

        String word = "autó";
        modositasString(word);
        System.out.println(word);


        System.out.println();
        ////////////////////////////////////////////////

        int[] secondArray = {34, 2, 222, 101, 1223};
        modositasArray(secondArray);

        for (Integer item : secondArray)
            System.out.println(item);


        System.out.println();
        /////////////////////////////////////////////////

        List<String> namesList = new ArrayList<>();
        namesList.add("Hajó");
        namesList.add("Repülő");
        namesList.add("Busz");
        modositasList(namesList);
        System.out.println(namesList);


        System.out.println();
        /////////////////////////////////////////////////
        Set<String> randomNames = new HashSet<>();
        randomNames.add("asszony");     // új elem hozzáadása
        randomNames.add("nő");
        randomNames.add("lány");
        modositasSet(randomNames);
        System.out.println(randomNames);

        System.out.println();
        //////////////////////////////////////////////////

        Map<String, Integer> adultsAges = new HashMap<>();
        adultsAges.put("Géza", 22);
        adultsAges.put("Anikó", 36);
        adultsAges.put("Péter", 25);

        modositasMap(adultsAges);
        System.out.println(adultsAges);


        System.out.println();
        /////////////////////////////////////////////////
        boolean yesOrNo = true;
        modositasBoolean(yesOrNo);
        System.out.println(yesOrNo);
    }

    private static void modositasDouble(double dbl) {
        dbl = 3.0;
    }

    private static void modositasSzam(int num) {
        num = 8;
    }

    private static void modositasString(String word) {
        word = "kutya";
    }

    private static void modositasArray(int[] secondArra) {
        secondArra[0] = 1;
    }

    private static void modositasList(List<String> list) {
        list.remove(1);
    }

    private static void modositasSet(Set<String> randomNames) {
        randomNames.remove("asszony");
    }

    private static void modositasMap(Map<String, Integer> adultsAges) {
        adultsAges.remove("Géza");
    }

    private static void modositasBoolean(boolean yesOrNo) {
        yesOrNo = false;
    }
}

