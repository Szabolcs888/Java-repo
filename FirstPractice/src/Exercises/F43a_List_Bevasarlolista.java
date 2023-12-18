package Exercises;

            /* 43.a Feladat (saját megoldás)
            Írjatok egy bevásárló lista programot. Amely nem csinál mást,
            mint a felhasználótól beolvasott elemeket elmenti egy List-be
            és a végén ki is írja a felhasználó számára az elmentett elemeket.
            Fix 7 elemű legyen a lista, pontosan 7 elemet lehessen hozzáadni */

import java.util.*;

public class F43a_List_Bevasarlolista {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> shoppingList = new ArrayList<>();
        String element = "";

        System.out.println();
        System.out.println("Kérlek, add meg a bevásárlólista tételeit!");
        for (int i = 1; i <= 7; i++) {
            System.out.println();
            System.out.println(i + ". tétel:");
            element = scan.next();
            shoppingList.add(element);
        }
        System.out.println();
        System.out.println("A bevásárlólista:");

        for (String item : shoppingList)
            System.out.println(item);
    }
}
