package Exercises;

            /* 43.b Feladat (saját megoldás)
            Írjatok egy bevásárló lista programot. Amely nem csinál mást,
            mint a felhasználótól beolvasott elemeket elmenti egy List-be
            és a végén ki is írja a felhasználó számára az elmentett elemeket.
            Ne legyen limitálva, hogy mennyi elemet adhat a felhasználó. Ha a
            felhasználó az “x” karaktert ír lista elemként, akkor szakítsa meg
            a beolvasást és folytatódjon a program futása.  */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F43b_List_Bevasarlolista_xExit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> shoppingList = new ArrayList<>();
        String element = "";

        System.out.println();
        System.out.println("Kérlek, add meg a bevásárlólista tételeit! Az 'X' megnyomására összegez a program.");

        int i = 1;
        do {
            System.out.println();
            System.out.println(i + ". tétel:");
            element = scan.next();
            i++;
            if (!(element.equals("x")) && (!element.equals("X")))
                shoppingList.add(element);
        } while ((!element.equals("x")) && (!element.equals("X")));


        System.out.println();
        System.out.println("A bevásárlólista:");

        for (String item : shoppingList)
            System.out.println(item);
    }
}
