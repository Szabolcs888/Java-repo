package Exercises;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;

public class F0_Gyakorlas2 {
    static public void main(String args[]) throws Exception {
        //King", "Harry Potter VI.", "The Return of the King", "Down and Out in Paris and London", "Harry Potter V", "A Summer to Die", "Harry Potter I.", "Harry Potter III.", "All about Sam", "Animal Farm", "Gathering Blue", "Homage to Catalonia", "Son", "The Two Towers", "Harry Potter III.", "Messenger", "The Return of the King", "Homage to Catalonia", "Harry Potter III.", "Harry Potter I.", "The Two T

        List<String> bookList = Arrays.asList("a", "a", "b", "a", "a", "c", "d", "e", "b", "d", "d");
        Map<String, Integer> booklistInMap = new HashMap<>();

        System.out.println(bookList);


        for (int i = 0; i < bookList.size(); i++) {


            if (!booklistInMap.containsKey(bookList.get(i))) {
                booklistInMap.put(bookList.get(i), 1);
            } else {
                int a = booklistInMap.get(bookList.get(i));
                booklistInMap.put(bookList.get(i), a + 1);
            }

        }

        System.out.println(booklistInMap);

        for (Map.Entry mapElement : booklistInMap.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());

        }
        for (int i = 0; i < booklistInMap.size(); i++) {
            booklistInMap.values().remove(1);
        }

        if (booklistInMap.values().equals(4)) {

        }
        System.out.println("----");
        for (Map.Entry mapElement : booklistInMap.entrySet()) {
            if (mapElement.getValue().equals(4)) {
                booklistInMap.put(mapElement.getKey() + "", 3);
            }
        }
        System.out.println("------");

        //  booklistInMap.put(key, map.get(key) + 1);

        //    booklistInMap.containsValue(4)
        System.out.println(booklistInMap.values());

    }
}



