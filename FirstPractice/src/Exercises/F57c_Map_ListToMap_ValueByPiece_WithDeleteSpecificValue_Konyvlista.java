package Exercises;

            /* 57.c Feladat (Órai) (saját megoldás)
            Írjunk könyv nyilvántartás programot. A feladat, hogy meg kell
            számolni pontosan hány különböző könyv van (cím szerint) és hogy
            hány példány van belőle a könyvesboltban. Szerencsére a kutató
            és adminisztrációs munka nagyját megcsinálták a diákmunkások,
            így egy ömlesztett lista a könyvekről már rendelkezésünkre áll:
            "Son", "Harry Potter VI.", "Down and Out in Paris and London",
            "All about Sam", "1984", "Keep the Aspidistra Flying",
            "The Fellowship of the Ring", "Keep the Aspidistra Flying",
            "A Summer to Die", "Harry Potter V", "The Return of the King",
            "Harry Potter VI.", "The Return of the King",
            "Down and Out in Paris and London", "Harry Potter V",
            "A Summer to Die", "Harry Potter I.", "Harry Potter III.",
            "All about Sam", "Animal Farm", "Gathering Blue",
            "Homage to Catalonia", "Son", "The Two Towers",
            "Harry Potter III.", "Messenger", "The Return of the King",
            "Homage to Catalonia", "Harry Potter III.", "Harry Potter I.",
            "The Two Towers", "Gathering Blue", "Messenger",
            "The Fellowship of the Ring", "1984", "Harry Potter VI.",
            "Keep the Aspidistra Flying", "Gathering Blue",
            "Harry Potter V", "Harry Potter II.", "Homage to Catalonia",
            "Harry Potter V", "Animal Farm", "All about Sam", "Son"

            Array.asList(“Son”,... -ként nyugodtan állítsuk be a
            programunknak a List kezdeti értékét és a feladat végeredményét
            mentsük egy Map-be. Írjuk ki a map tartalmát a képernyőre úgy,
            hogy az alábbi példának megfeleljen: “The Fellowship of the Ring
            - 4 darab”. Tételezzük fel, hogy azokat a könyveket amikből egy
            darab van, azokat kivesszük ideiglenesen a nyilvántartásból,
            mert a cégvezető értékesnek találja és meg szeretné tartani őket.
            Keressük meg ezeket a könyveket és töröljük a nyilvántartásból. */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class F57c_Map_ListToMap_ValueByPiece_WithDeleteSpecificValue_Konyvlista {
    public static void main(String[] args) {
        List<String> bookList = Arrays.asList("Son", "Harry Potter VI.", "Down and Out in Paris and London", "All about Sam", "1984", "Keep the Aspidistra Flying", "The Fellowship of the Ring", "Keep the Aspidistra Flying", "A Summer to Die", "Harry Potter V", "The Return of the King", "Harry Potter VI.", "The Return of the King", "Down and Out in Paris and London", "Harry Potter V", "A Summer to Die", "Harry Potter I.", "Harry Potter III.", "All about Sam", "Animal Farm", "Gathering Blue", "Homage to Catalonia", "Son", "The Two Towers", "Harry Potter III.", "Messenger", "The Return of the King", "Homage to Catalonia", "Harry Potter III.", "Harry Potter I.", "The Two Towers", "Gathering Blue", "Messenger", "The Fellowship of the Ring", "1984", "Harry Potter VI.", "Keep the Aspidistra Flying", "Gathering Blue", "Harry Potter V", "Harry Potter II.", "Homage to Catalonia", "Harry Potter V", "Animal Farm", "All about Sam", "Son");
        Map<String, Integer> booklistInMap = new HashMap<>();

        // A lista mappába helyezése. A címek lesznek a key értékek és az előfordulásuk száma a value értékek.
        for (int i = 0; i < bookList.size(); i++) {
            if (!booklistInMap.containsKey(bookList.get(i))) {
                booklistInMap.put(bookList.get(i), 1);
            } else {
                int piece = booklistInMap.get(bookList.get(i));
                booklistInMap.put(bookList.get(i), piece + 1);
            }
        }

        // A mappából eltávolításra kerülnek azok a könyvek, amelyekből csak 1 db van.
        for (int i = 0; i < booklistInMap.size(); i++) {
            booklistInMap.values().remove(1);
        }

        // A mappa integer értékeinek összeadása.
        int sum = 0;
        for (Integer number : booklistInMap.values()) {
            sum = sum + number;
        }
        System.out.println("Összesen " + sum + " könyv van.");
        System.out.println("Összesen " + booklistInMap.size() + " különböző könyv van.");
        System.out.println();
        for (Map.Entry mapElement : booklistInMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + "db");
        }
    }
}
