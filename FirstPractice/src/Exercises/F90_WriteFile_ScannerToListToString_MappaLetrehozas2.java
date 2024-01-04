package Exercises;

            /* 90. Feladat (Zsolt megoldása)
            Készítsétek el a classic bevásárlólista alkalmazást egyszerűsített változatát, amely
            beolvas a konzolról tételeket és darabszámokat (pl.: “tej 3db”). Ezen tételeket mentsük
            el egy String elemű listában. Készítsünk egy metódust, amely a paraméterül kapott
            String-et kiírja egy shoppinglist.txt-be. (Tehát a listát át kell alakítani, összefűzni
            egy hosszú Stringgé egy elválasztó karakter, pl vessző használatával)

            Kiegészítve: mappa létrehozásával
            - előre megadott elérési úttal
            - usertől bekért névvel, elérési úttal
            - metódus parametérként megadott adatokkal. */

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F90_WriteFile_ScannerToListToString_MappaLetrehozas2 {
    public static void main(String[] args) {
        List<String> shoppingList = getShoppingListFromUser();
        String content = transformListToString(shoppingList);
        writeToFile(content);

        //writeToFileWithCustomPath(content);
        //writeToFileWithCustomParams(content,"savedFiles/shoppingLists","shoppingList-2023.12.16.txt");
        //writeToFile(transformListToString(getShoppingListFromUser()));
    }

    public static List<String> getShoppingListFromUser() {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();

        while (shoppingList.size() != 3) {
            System.out.println("Give me an item: ");
            String item = scanner.nextLine();
            shoppingList.add(item);
        }
        System.out.println("Data to write to file: " + shoppingList);
        return shoppingList;
    }

    public static String transformListToString(List<String> list) {
        String content = "";
        for (String item : list) {
            content += item + ", ";
        }
        return content;
    }

    public static void writeToFile(String content) {
        try {
            new File("savedFiles").mkdirs();  //mappa létrehozása, amennyiben még nem létezik
            Files.write(Paths.get("savedFiles/shoppinglist.txt"), content.getBytes(StandardCharsets.UTF_8));  //felülírja a fájl tartalmát ha van már benne valami
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToFileWithCustomPath(String content) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Add a path (director) to save the file");  // savedFiles
            String path = scanner.nextLine();
            System.out.println("Add the name of the file");
            String name = scanner.nextLine();                             //shoppinglist.txt

            new File(path).mkdirs();  //mappa létrehozása, amennyiben még nem létezik
            Files.write(Paths.get(path + "/" + name), content.getBytes(StandardCharsets.UTF_8));  // "savedFiled/shoppinglist.txt"
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToFileWithCustomParams(String content, String path, String filename) {
        try {
            new File(path).mkdirs();  //mappa létrehozása, amennyiben még nem létezik
            Files.write(Paths.get(path + "/" + filename), content.getBytes(StandardCharsets.UTF_8));  // "savedFiled/shoppinglist.txt"
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}