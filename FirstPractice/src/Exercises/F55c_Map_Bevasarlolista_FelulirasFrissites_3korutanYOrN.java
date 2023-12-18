package Exercises;

            /* 55.c Feladat (saját megoldás)
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

public class F55c_Map_Bevasarlolista_FelulirasFrissites_3korutanYOrN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        Map<String, Integer> shoppingList = new HashMap<>();
        String item = "";
        int piece = 0;
        boolean yOrNo = true;
        for (int i = 1; i < 4 || yOrNo; i++) {
            System.out.println();
            System.out.println("Kérlek, add meg a(z) " + i + ". tételt:");
            item = scan.nextLine();
            System.out.println("Hány db-ot szeretnél?");
            piece = scan2.nextInt();
            if (shoppingList.containsKey(item)) {
                System.out.println("Az elem darabszáma frissítésre került");
                i--;
            }
            if (i > 2) {
                System.out.println();
                System.out.println("Szeretnél még újabb elemet hozzáadni? (I/N)");
                String yOrNo2 = scan.nextLine();
                if (yOrNo2.toLowerCase().equals("i"))
                    yOrNo = true;
                else if (yOrNo2.toLowerCase().equals("n")) {
                    yOrNo = false;
                } else {
                }
            }
            shoppingList.put(item, piece);
        }
        System.out.println();
        System.out.println("A bevásárlólista:");
        for (Map.Entry mapElement : shoppingList.entrySet()) {
            System.out.println(mapElement.getKey() + ": " + mapElement.getValue() + "db");
        }
    }
}