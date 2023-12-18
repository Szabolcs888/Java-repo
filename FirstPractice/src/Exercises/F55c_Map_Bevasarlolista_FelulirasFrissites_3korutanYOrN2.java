package Exercises;

            /* 55.c Feladat (Zsolt megoldása)
            Írjatok egy bevásárló lista programot, amely nem csinál mást,
            mint a felhasználótól beolvasott elemeket, majd az elemhez
            tartozó darabszámot elmenti egy Map-be és a végén ki is írja
            a felhasználó számára az elmentett elemeket. Oldjuk meg, hogy
            ha az elem már szerepel a Map-ben, akkor írja ki a program,
            hogy “Az elem darabszáma frissítésre került”. Ne legyen
            limitálva, hogy mennyi elemet adhat hozzá a felhasználó, hanem
            miután hozzáadott 3 elemet, kérdezze meg a program minden elem
            hozzáadása után, hogy szeretne-e még új elemet hozzáadni. “Y”
            esetén újbóli beolvasás, “N” esetén a Map kiíratása
            következik. */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F55c_Map_Bevasarlolista_FelulirasFrissites_3korutanYOrN2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> shoppingList = new HashMap<>();

        boolean wantmore = true;
        while (wantmore) {
            System.out.println("Add the name of the item: ");
            String itemName = scanner.nextLine();
            System.out.println("Count: ");
            int itemCount = Integer.parseInt(scanner.nextLine());
            if (shoppingList.containsKey(itemName)) {
                System.out.println("The count of item has been updated.");
            }
            shoppingList.put(itemName, itemCount);
            System.out.println(shoppingList);

            if (shoppingList.size() >= 3) {
                System.out.println("Do you want to add a new item? Y:Yes N:No");
                String userAnswer = scanner.nextLine();
                if (!userAnswer.equals("Y")) {
                    wantmore = false;
                }
            }
        }
        System.out.println("The final shoppinglist: " + shoppingList);
    }
}