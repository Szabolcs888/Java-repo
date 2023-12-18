package Exercises;

            /* 58.c Feladat (saját megoldás)
            Készítsetek programot, ami összeszámolja a dolgozói
            szavazatokat amely a karácsonyi party helyszínével kapcsolatos.
            Szerencsére egy gyakornok összegyűjtötte a szavazatokat egy
            Listába, íme: "Salt", "Platán", "42", "Essencia", "Babel",
            "Borkonyha", "Costes", "42", "Borkonyha", "Rumour", "Platán",
            "Babel", "Stand", "Rumour", "Salt", "Platán", "42", "Rumour",
            "Rumour", "Borkonyha", "Rumour", "Borkonyha", "Babel",
            "Essencia", "Salt", "Platán", "Borkonyha", "42", "Babel",
            "Essencia", "42", "Stand", "Salt", "Costes", "42", "42",
            "Costes", "Stand", "Borkonyha", "Stand", "Costes", "Babel",
            "Essencia", "Stand", "Salt", "Platán", "Costes", "Salt",
            "Platán", "Salt", "Platán", "Essencia", "Rumour", "Salt",
            "Platán", "Rumour", "Stand", "Salt", "Essencia", "Babel",
            "Babel", "Essencia", "Rumour", "Essencia", "Salt", "Platán",
            "Borkonyha", "Stand", "Essencia", "Rumour", "Borkonyha",
            "Costes", "Babel", "Costes", "Salt", "Platán", "Essencia",
            "Stand", "Costes", "Borkonyha", "Essencia", "42", "Essencia",
            "42", "Stand", "Rumour", "Salt", "Platán", "Rumour",
            "Borkonyha", "Stand", "Babel", "Rumour", "Stand", "Salt",
            "Essencia", "Costes", "Costes", "42", "42", "Salt", "Platán",
            "Essencia", "Babel", "Costes", "Rumour", "Costes", "Stand",
            "Rumour", "Essencia", "Borkonyha", "Salt", "Platán", "Rumour",
            "Borkonyha", "42", "Babel", "Stand", "42", "Costes", "42",
            "Salt", "42", "Salt", "Essencia", "Borkonyha", "Essencia",
            "Borkonyha", "Rumour"
            Array.asList(“Essencia”,... -ként nyugodtan állítsuk be a
            programunknak a List kezdeti értékét és a feladat végeredményét
            mentsük egy Map-be. Írjuk ki a képernyőre a szavazás eredményét
            az alábbi példának megfelelően: “Borkonyha - 11 szavazat”, és hogy
            hány Michelin csillagos étterem van (hány szavazat érkezett)?
            Tételezzük fel, hogy az Essencia jelezte, hogy nem tudják fogadni
            a céget. Távolítsuk el őket az eredmény Map-ből. */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class F58c_Map_ListToMap_ValueByVotes_DeleteOneKey {
    public static void main(String[] args) {
        List<String> voteList = Arrays.asList("Salt", "Platán", "42", "Essencia", "Babel", "Borkonyha", "Costes", "42", "Borkonyha", "Rumour", "Platán", "Babel", "Stand", "Rumour", "Salt", "Platán", "42", "Rumour", "Rumour", "Borkonyha", "Rumour", "Borkonyha", "Babel", "Essencia", "Salt", "Platán", "Borkonyha", "42", "Babel", "Essencia", "42", "Stand", "Salt", "Costes", "42", "42", "Costes", "Stand", "Borkonyha", "Stand", "Costes", "Babel", "Essencia", "Stand", "Salt", "Platán", "Costes", "Salt", "Platán", "Salt", "Platán", "Essencia", "Rumour", "Salt", "Platán", "Rumour", "Stand", "Salt", "Essencia", "Babel", "Babel", "Essencia", "Rumour", "Essencia", "Salt", "Platán", "Borkonyha", "Stand", "Essencia", "Rumour", "Borkonyha", "Costes", "Babel", "Costes", "Salt", "Platán", "Essencia", "Stand", "Costes", "Borkonyha", "Essencia", "42", "Essencia", "42", "Stand", "Rumour", "Salt", "Platán", "Rumour", "Borkonyha", "Stand", "Babel", "Rumour", "Stand", "Salt", "Essencia", "Costes", "Costes", "42", "42", "Salt", "Platán", "Essencia", "Babel", "Costes", "Rumour", "Costes", "Stand", "Rumour", "Essencia", "Borkonyha", "Salt", "Platán", "Rumour", "Borkonyha", "42", "Babel", "Stand", "42", "Costes", "42", "Salt", "42", "Salt", "Essencia", "Borkonyha", "Essencia", "Borkonyha", "Rumour");
        Map<String, Integer> votelistInMap = new HashMap<>();

        // A lista mappába helyezése. A címek lesznek a key értékek és az előfordulásuk száma a value értékek.
        for (String restaurant : voteList) {
            if (votelistInMap.containsKey(restaurant)) {
                int originValue = votelistInMap.get(restaurant);
                votelistInMap.put(restaurant, originValue + 1);
            } else {
                votelistInMap.put(restaurant, 1);
            }
        }

        // Egy elem eltávolítása.
        votelistInMap.remove("Essencia");

        // A mappa integer értékeinek összeadása.
        int sum = 0;
        for (Integer number : votelistInMap.values()) {
            sum = sum + number;
        }

        System.out.println(votelistInMap);
        System.out.println();
        System.out.println(votelistInMap.size() + " étteremre lehetett szavazni.");
        System.out.println("Összesen " + sum + " szavazat érkezett.");
        System.out.println();
        System.out.println("A szavazatok eloszlása:");

        for (Map.Entry mapElement : votelistInMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " szavazat");
        }
    }
}
