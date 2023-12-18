package Exercises;

            /* 43.c Feladat (saját megoldás)
            Írjatok egy bevásárló lista programot. Amely nem csinál mást,
            mint a felhasználótól beolvasott elemeket elmenti egy List-be
            és a végén ki is írja a felhasználó számára az elmentett elemeket.
            Ne legyen limitálva, hogy mennyi elemet adhat a felhasználó.
            Oldjuk meg, hogy csak akkor adja hozzá a listához a felhasználó
            által beírt elemet, ha még nincs benne. Ha már benne van, akkor
            írjuk ki, hogy “Ez az elem már hozzáadásra került!”. Ha a
            felhasználó az “x” karaktert ír lista elemként, akkor szakítsa meg
            a beolvasást és folytatódjon a program futása.  */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F43c_List_Bevasarlolista_xExit_nincsFeluliras {
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
            if (shoppingList.contains(element)) {
                System.out.println("Ez az elem már hozzáadásra került!");
                i--;
            } else if (!(element.equals("x")) && (!element.equals("X"))) {
                shoppingList.add(element);
            }
        } while ((!element.equals("x")) && (!element.equals("X")));

        System.out.println();
        System.out.println("A bevásárlólista:");

        for (String item : shoppingList)
            System.out.println(item);
    }
}
