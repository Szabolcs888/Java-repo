package Exercises;

            /* 43.d Feladat (Zsolt megoldása)
            Írjatok egy bevásárló lista programot. Amely nem csinál mást,
            mint a felhasználótól beolvasott elemeket elmenti egy List-be
            és a végén ki is írja a felhasználó számára az elmentett elemeket.
            Ne legyen limitálva, hogy mennyi elemet adhat a felhasználó.
            Oldjuk meg, hogy csak akkor adja hozzá a listához a felhasználó
            által beírt elemet, ha még nincs benne. Ha már benne van, akkor
            írjuk ki, hogy “Ez az elem már hozzáadásra került!”. Ha a
            felhasználó az “x” karaktert ír lista elemként, akkor szakítsa meg
            a beolvasást és kérdezze meg, hogy "szeretne-e elemet törölni?" és
            igen válasz esetén hajtsa végre a törlést. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F43d_List_Bevasarlolista_xExit_nincsFeluliras_elemTorleseOpcio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();

        int sizeOfShoppingList = 7;
        String item = "";
        // while (!((item = scanner.next()).toLowerCase().equals("x")){  //ezen while esetén nem kell if feltétel a ciklusban
        while (!(item.toLowerCase().equals("x"))) {
            System.out.println("Add an item to the shopping list:");
            item = scanner.nextLine();
            if (item.toLowerCase().equals("x")) {
                break;
            }
            if (shoppingList.contains(item)) {
                System.out.println("This item is already on the list");
            } else {
                shoppingList.add(item);
            }
        }
        System.out.println("Shopping list: " + shoppingList);
        System.out.println("Add an item to delete: ");
        item = scanner.nextLine();
        if (!shoppingList.contains(item)) {
            System.out.println("There is no such item on the list.");
        } else {
            shoppingList.remove(item);
        }

        System.out.println("Shopping list: " + shoppingList);
    }
}