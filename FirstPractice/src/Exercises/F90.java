package Exercises;
/*
 Készítsétek el a classic bevásárlólista alkalmazást egyszerűsített
 változatát, amely beolvas a konzolról tételek és darabszámokat (pl.: “tej 3db”).
  Ezen tételeket mentsük el egy String elemű listában. Készítsünk egy metódust,
  amely a paraméterül kapott String-et kiírja egy shoppinglist.txt-be.
  (Tehát a listát át kell alakítani, összefűzni egy hosszú Stringgé egy elválasztó karakter,
  pl vessző használatával)
 */

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F90 {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Kérlek, sorold fel a bevásárlólistát!");

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println(i + 1 + ". tétel:");
            shoppingList.add(scan.nextLine());
        }

        String content = "";
        for (String item : shoppingList)
            content += item +", ";
            writeToFIle(content);
       //    System.out.println(item);
    }

    public static void writeToFIle(String content) {
        try {
           //  new File("src/Exercises/resources").mkdirs(); // mappa létrehozása
            Files.write(Paths.get("src/resources/bevasarlolista.txt"), content.getBytes("UTF-8"));   //, StandardOpenOption.APPEND);
            //Files.write(Paths.get("used_arguments.txt"), content.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}

