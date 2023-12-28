package Exercises;

            /* 73. Feladat (Zsolt megoldása)
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

public class F73_String_ScannerStringSplitToMap2 {
    public static void main(String[] args) {
        System.out.println("Add items and values in the item-value format and press ENTER)" +
                " If you type X then execution ends");

        Map<String, Integer> shoppingList = new HashMap();
        shoppingList = getShoppingListAsMap();
        System.out.println(shoppingList);
        System.out.println("Number of different items: " + shoppingList.size());

        int total = 0;
        for (Map.Entry mapElement : shoppingList.entrySet()) {
            // total += Integer.parseInt(mapElement.getValue()+""); //ez is helyes statement
            total += (int) mapElement.getValue();
        }
        System.out.println("Total number of items: " + total);
    }

    public static Map<String, Integer> getShoppingListAsMap() {
        Map<String, Integer> shoppingList = new HashMap();
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("your item: ");
            userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("X")) {
                String[] userInputAsArray = userInput.split("-");
                String item = userInputAsArray[0];       //userInput - előtti része
                String value = userInputAsArray[1];     //userInput - utáni része Stringként
                int valueInt = Integer.parseInt(value); //userInput - utáni része int-ként
                shoppingList.put(item, valueInt);
                // ua mint a felette lévő 4 sor
                // shoppingList.put(userInputAsArray[0],Integer.parseInt(userInputAsArray[1]));
            }
        } while (!userInput.equalsIgnoreCase("X"));
        return shoppingList;
    }
}