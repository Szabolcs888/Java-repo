package Exercises;

            /* 73. Feladat (saját megoldás)
            Készítsetek egy alkalmazást, amely egy bevásárló lista. Az elemeket be tudja
            olvasni az alábbi formában: tétel-db vagyis, kenyér-2 vagy sör-6. A beolvasás
            addig tartson, amíg a felhasználó nem nyom "X"-et. Az így beolvasott elemeket
            feldarabolja a - jel mentén és elmenti egy shoppingList nevű Map-be. Az első
            fele, a kötőjel előtti rész legyen a kulcs, a második rész pedig a darabszám.
            System.out.println()-el írjátok ki a képernyőre a map tartalmát. Összegezzük
            összesen hány darab terméket kell vásárolnunk. Illetve hány különböző terméket. */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
        main();
            getListFromUser();
            pieceCount();
            printListData();
*/

public class F73_String_ScannerStringSplitToMap {
    public static void main(String[] args) {
        Map<String, Integer> shoppingList = getListFromUser();
        int piece = pieceCount(shoppingList);
        printListData(shoppingList, piece);
    }

    private static Map<String, Integer> getListFromUser() {
        Map<String, Integer> splitList = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String item;
        boolean yOn = true;
        System.out.println("Kérlek, add meg a bevásárlólista tételeit:");
        do {
            item = (scan.nextLine());
            if (item.toLowerCase().equals("x")) {
                yOn = false;
            } else
                splitList.put(item.split("-")[0], Integer.parseInt(item.split("-")[1]));
        } while (yOn);
        // } while(!item.equalsIgnoreCase("x")); // ugyanaz az eredmény és a booleanra sincs szükség
        return splitList;
    }

    private static int pieceCount(Map<String, Integer> shoppingList) {
        int piece = 0;
        for (Map.Entry mapElement : shoppingList.entrySet()) {
            piece += (int) mapElement.getValue();
        }
        return piece;
    }
    private static void printListData(Map<String, Integer> shoppingList, int piece) {
        System.out.println(shoppingList);
        System.out.println("Összesen " + shoppingList.size() + " féle termék van a bevásárlólistán.");
        System.out.println("Összesen " + piece + " db termék van a bevásárlólistán.");
    }
}
