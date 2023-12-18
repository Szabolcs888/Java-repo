package Temps.Array_and_Collections;

            /* Map
            - nem sorszám alapú (nem indexelt)
            - kulcs-érték (key-value) párokat tárol
            - kulcs csak egyszer szerepelhet a Map-ben viszont több ugyanolyan érték is feltűnhet. // ugyanazon kulcs hozzáadásával felülírjuk az eredetit, az új értékkel
            - egyetlen null kulcsot és tetszőleges számú null értéket engedélyez
            - különböző adattípusú elemeket is rakhatunk bele
            - gyorsan tudunk kiolvasni belőle

            - a kulcsot nekünk kell biztosítani
            - több memóriát használ mint a többi Collection elem */

import java.util.HashMap;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) {
        Map<String, String> emailAndNameslist = new HashMap<>();

        emailAndNameslist.put("laci@gmail.com", "Kozma László"); // kulcs és érték pár hozzáadása
        emailAndNameslist.put("juliska@gmail.com", "Kis Juliska");
        emailAndNameslist.put("csilla@gmail.com", "Nagy Csilla");

        System.out.println(emailAndNameslist.isEmpty()); // rákérdezés, hogy üres-e?
        System.out.println(emailAndNameslist.size()); // méret lekérdezése
        System.out.println(emailAndNameslist.get("laci@gmail.com")); // érték lekérése a kulcs(a) által
        System.out.println(emailAndNameslist.containsKey("juliska@gmail.com")); // lekérdezés, hogy szerepel-e az adott kulcsú elem a mapben
        System.out.println(emailAndNameslist.containsValue("Nagy Csilla")); // lekérdezés, hogy szerepel-e az adott értékű elem a mapben
        System.out.println(emailAndNameslist.remove("csilla@gmail.com")); // kitörli az adott kulcsú elemet a mapből
        System.out.println(emailAndNameslist); // map tartalmának kiíratása
        System.out.println(emailAndNameslist.entrySet()); // ugyanúgy kiírja a map tartalmát - összetettebb műveleteknél használatos (pl. for-each-ben). Figyelem!! Ha equalsban használjuk két map összehasonlítására, akkor vagy egyikhez sem írjunk entrySet-et, vagy mindkettőhöz, mert false lesz az eredmény akkor is, ha teljesen egyformák!

        System.out.println(emailAndNameslist.keySet()); // visszaadja a map-ben található kulcsokat, mint egy set-et
        System.out.println(emailAndNameslist.values()); // visszaadja a map-ben található értékeket


        System.out.println();

        Map<String, Integer> adultsAges = new HashMap<>();
        adultsAges.put("Géza", 22);
        adultsAges.put("Anikó", 19);
        adultsAges.put("Erzsébet", 45);
        adultsAges.put("Mária", 30);
        System.out.println(adultsAges);

        System.out.println();

        // a map tartalmából eltávolításra kerülnek azok az elemek, amelyeknek értéke 45
        for (int i = 0; i < adultsAges.size(); i++) {
            adultsAges.values().remove(45);
        }

        // a map adott értékű elemeinek felülírása (azaz, ha map adott elemének értéke (value) 19 volt, akkor 21 lesz)
        for (Map.Entry mapElement : adultsAges.entrySet()) {
            if (mapElement.getValue().equals(19)) {
                adultsAges.put(mapElement.getKey() + "", 21);
            }
        }

        // map tartalmának kiíratása for-eac-vel
        for (Map.Entry mapElement : adultsAges.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }

        System.out.println();

        // így is rákérdezhetünk, hogy adott kulcs, vagy elem szerepel-e a listában (ha integer típusú kulcsról/elemről van szó, akkor is az "equals"-t kell használnunk " == " helyett)
        for (Map.Entry mapElement : adultsAges.entrySet()) {
            if (mapElement.getKey().equals("Erzsébet")) {
                System.out.println(mapElement.getKey() + " szerepel a listában");
            }
            if (mapElement.getValue().equals(30))
                System.out.println(mapElement.getValue() + " szerepel a listában");
        }

        System.out.println();

        // a map integer értékeinek összeadása egy változóba for-each-vel
        int sum = 0;
        for (Integer number : adultsAges.values()) {
            sum = sum + number;
        }
        System.out.println(sum);

        System.out.println();

        // a map integer értékeinek összeadása egy double (vagy int) változóba for-each-vel és entrySet-tel
        double sum2 = 0;
        for (Map.Entry mapElement : adultsAges.entrySet()) {
            sum2 = sum2 + Double.parseDouble(mapElement.getValue() + ""); // először a value átalakul String-gé, utána double-vá.
          //sum2 = sum2 + Integer.parseInt(mapElement.getValue() + "");
        }
        System.out.println(sum2);
    }
}