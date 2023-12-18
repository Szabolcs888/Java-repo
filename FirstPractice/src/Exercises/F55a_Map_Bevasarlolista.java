package Exercises;

            /* 55.a Feladat (saját megoldás)
            Írjatok egy bevásárló lista programot, amely nem csinál mást,
            mint a felhasználótól beolvasott elemeket, majd az elemhez
            tartozó darabszámot elmenti egy Map-be és a végén ki is írja
            a felhasználó számára az elmentett elemeket. fix 7 elemű legyen
            a Map, pontosan 7 elemet lehessen hozzáadni */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F55a_Map_Bevasarlolista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        Map<String, Integer> shoppingList = new HashMap<>();
        String item = "";
        int piece = 0;
        for (int i = 1; i < 8; i++) {
            System.out.println();
            System.out.println("Kérlek, add meg a(z) " + i + ". tételt:");
            item = scan.nextLine();
            System.out.println("Hány db-ot szeretnél?");
            piece = scan2.nextInt();
            shoppingList.put(item, piece);
        }
        System.out.println();
        System.out.println("A bevásárlólista:");
        for (Map.Entry mapElement : shoppingList.entrySet()) {
            System.out.println(mapElement.getKey() + ": " + mapElement.getValue() + "db");
        }
    }
}