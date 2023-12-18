package Exercises;

            /* 43.d Feladat (saját megoldás)
            Írjatok egy bevásárló lista programot. Amely nem csinál mást,
            mint a felhasználótól beolvasott elemeket elmenti egy List-be
            és a végén ki is írja a felhasználó számára az elmentett elemeket.
            Ne legyen limitálva, hogy mennyi elemet adhat a felhasználó.
            Oldjuk meg, hogy csak akkor adja hozzá a listához a felhasználó
            által beírt elemet, ha még nincs benne. Ha már benne van, akkor
            írjuk ki, hogy “Ez az elem már hozzáadásra került!”. Ha a
            felhasználó az “x” karaktert ír lista elemként, akkor szakítsa meg
            a beolvasást és kérdezze meg, hogy "szeretne-e elemet törölni?" és
            igen válasz esetén hajtsa végre a törlést és ismételje meg a kérdést.

            Kiegészítettem azzal, hogy ha nem létező elemet ír be a user, akkor
            szóváteszi a program. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F43d_List_Bevasarlolista_xExit_nincsFeluliras_elemTorleseOpcio {
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
        } while ((!element.equals("x")) && (!element.equals("X"))); // (!(element.toLowerCase().equals("x"))) : ezzel az utasítással kiváltható a két feltétel (és csak az x lenyomására fog vonatkozni, a tételekre nem.

        boolean deleteYOrN = true;
        do {
            System.out.println();
            System.out.println("Szeretnél törölni a listáról? (I/N)");
            element = scan.next();
            if ((element.equals("i")) || (element.equals("I"))) {
                System.out.println();
                System.out.println("Melyik tételt töröljem?");
                element = scan.next();
                if (!shoppingList.contains(element)) {
                    System.out.println();
                    System.out.println("Nincs ilyen tétel a listában.");
                } else {
                    System.out.println();
                    shoppingList.remove(element);
                    System.out.println("A(z) " + element + " törlésre került.");
                }
                System.out.println("A bevásárlólista jelenleg: " + shoppingList);
            } else if ((element.equals("n")) || (element.equals("N"))) {
                deleteYOrN = false;
            }
        }
        while (deleteYOrN == true);

        System.out.println();
        System.out.println("A bevásárlólista:");

        for (String item : shoppingList)
            System.out.println(item);
    }
}
