package Exercises;

            /* 57.d Feladat (Órai) (Zsolt megoldása)
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
            Keressük meg ezeket a könyveket és töröljük a nyilvántartásból.
            Tételezzük fel, hogy a cégvezető nem is annyira rossz arc és
            azokat a könyveket, amelyekből 4 darab van, 1-et elajándékoz
            rászorulóknak. Frissítsük ezen könyvek darabszámát 3-ra. */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class F57d_Map2_ListToMap_ConcurrentHashMap_ValueByPiece_WithDeleteSpecificValue_AndIncreaseSpecificValue {
    public static void main(String[] args) {
        List<String> booksList = Arrays.asList("Son", "Harry Potter VI.", "Down and Out in Paris and London", "All about Sam", "1984", "Keep the Aspidistra Flying", "The Fellowship of the Ring", "Keep the Aspidistra Flying", "A Summer to Die", "Harry Potter V", "The Return of the King", "Harry Potter VI.", "The Return of the King", "Down and Out in Paris and London", "Harry Potter V", "A Summer to Die", "Harry Potter I.", "Harry Potter III.", "All about Sam", "Animal Farm", "Gathering Blue", "Homage to Catalonia", "Son", "The Two Towers", "Harry Potter III.", "Messenger", "The Return of the King", "Homage to Catalonia", "Harry Potter III.", "Harry Potter I.", "The Two Towers", "Gathering Blue", "Messenger", "The Fellowship of the Ring", "1984", "Harry Potter VI.", "Keep the Aspidistra Flying", "Gathering Blue", "Harry Potter V", "Harry Potter II.", "Homage to Catalonia", "Harry Potter V", "Animal Farm", "All about Sam", "Son");
        Map<String, Integer> booksMap = new ConcurrentHashMap<>(); // A ConcurrentHashMap engedélyezi azt, hogy egyidejűleg olvassuk és módosítsuk is a tartalmát.

        // a solution
        System.out.println(booksList);
        for (String book : booksList) {
            if (booksMap.containsKey(book)) {
                int originValue = booksMap.get(book);
                booksMap.put(book, originValue + 1);
            } else {
                booksMap.put(book, 1);
            }
        }
        //System.out.println(booksMap);
        // a/b solution
        int sum = 0;
        for (Map.Entry mapElement : booksMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " darab");
            sum += Integer.parseInt(mapElement.getValue() + "");
        }
        System.out.println("Total count of books: " + booksList.size());
        System.out.println("Total count of books: " + sum);
        System.out.println("Count of books with different titles: " + booksMap.size());

        // c/d solution

        for (Map.Entry mapElement : booksMap.entrySet()) {
            // Option 1 if(Integer.parseInt(mapElement.getValue() + "") == 1){
            // Option 2
            // c solution
            if ((mapElement.getValue() + "").equals("1")) {
                booksMap.remove(mapElement.getKey());
            }
            // d solution
            if ((mapElement.getValue() + "").equals("4")) {
                booksMap.put(mapElement.getKey() + "", 3);
            }
        }

        // c/d solution option 2
        /*
        Iterator<Map.Entry<String, Integer>> iterator = booksMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry mapElement = iterator.next();
            if ((mapElement.getValue() + "").equals("1")) {
                booksMap.remove(mapElement.getKey());
            }
            // d solution
            if ((mapElement.getValue() + "").equals("4")) {
                booksMap.put(mapElement.getKey() + "", 3);
            }
        }
        */

        System.out.println(booksMap);
    }
}
