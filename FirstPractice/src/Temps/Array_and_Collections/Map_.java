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

import java.util.*;

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
        adultsAges.put("Anikó", 36);
        adultsAges.put("Péter", 25);
        adultsAges.put("Emma", 27);
        adultsAges.put("János", 19);
        adultsAges.put("Erzsébet", 45);
        adultsAges.put("Mária", 30);
        System.out.println(adultsAges);

        System.out.println();

        // a map tartalmából eltávolításra kerülnek azok az elemek, amelyeknek értéke 45
        for (int i = 0; i < adultsAges.size(); i++) {
            adultsAges.values().remove(45);
        }
        // Ue. for-each-vel (a 22-es értékű elemek kerülnek eltávolításra). A feltételben szereplő ' + "" ' alakítja át a value Objektumot Stringgé.
        // Előfordulhat, hogy nem működik és a map-et ConcurrentHashMap-ként kell létrehozni, mert a ConcurrentHashMap engedélyezi azt, hogy egyidejűleg olvassuk és módosítsuk is a tartalmát.
        for (Map.Entry mapElement : adultsAges.entrySet()) {
            if ((mapElement.getValue() + "").equals("27")) {  // vagy: if(Integer.parseInt(mapElement.getValue() + "") == 22) {
                adultsAges.remove(mapElement.getKey());
            }
        }


        // a map adott értékű elemeinek felülírása (azaz, ha map adott elemének értéke (value) 19 volt, akkor 21 lesz)
        for (Map.Entry mapElement : adultsAges.entrySet()) {
            if (mapElement.getValue().equals(19)) {  // vagy: if ((mapElement.getValue() + "").equals("19")) {
                adultsAges.put(mapElement.getKey() + "", 21);
            }
        }


        // map tartalmának kiíratása for-each-vel (a for-each entrySet parancsa Objectumként adja vissza a mapElement változóba kerülő értékékeket (még akkor is, ha String volt), ezért kell az idézőjelekkel visszakonvertálni Stringgé)
        for (Map.Entry mapElement : adultsAges.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }

        // map tartalmának kiíratása "Iterator" Objektummal
        Iterator<Map.Entry<String, Integer>> iterator = adultsAges.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
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

        // A legnagyobb valeu-jú key lekérése (ha fennáll a lehetősége, hogy több key-nek is ugyanaz lehet az értéke, akkor célszerű másik mapbe, vagy egy listába másolni a key-eket.
        int biggerNum = adultsAges.get("Anikó");
        for (Integer number : adultsAges.values()) {
            if (biggerNum < number) {
                biggerNum = number;
            }
        }

        // Egy key megtalálása adott value alapján.
        String winner = "Anikó";
        for (Map.Entry mapElement : adultsAges.entrySet()) {
            if (mapElement.getValue().equals(biggerNum)) {  // az equals után a zárójelbe kell beírni a konkrét value-t
                winner = mapElement.getKey() + "";
            }
        }
        System.out.println(winner + " a legidősebb.");


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
            // sum2 = sum2 + Integer.parseInt(mapElement.getValue() + "");
            // sum2 = sum2 + (int)(mapElement.getValue()); // ún. "parseolás"-sal is átalakítható az adott érték int-té
        }
        System.out.println(adultsAges);
        System.out.println("debug" + sum2);


        // lista tartalmának áthelyezése mapbe úgy, hogy a lista minden második eleme legyen a value (ez esetben még összeadásra is kerültek azon key-ek value-i, amelyek már szerepelnek (így nem felülíródnak, hanem összeadódnak a value-k)
        // a value-ba íródó számok eredetileg Stringek voltak és a map feltöltése közben lettek átalakítva int-té
        List<String> splitLoggedHours = Arrays.asList(
                "Zuckerberg", "4", "Steve", "4", "Bill", "1", "Bill", "2", "Zuckerberg", "4", "Bill", "2",
                "Zuckerberg", "1", "Zuckerberg", "3", "Zuckerberg", "1", "Zuckerberg", "1", "Steve", "4");
        Map<String, Integer> loggedHoursMap = new HashMap<>();
        for (int i = 0; i < splitLoggedHours.size(); i += 2) {
            if (!loggedHoursMap.containsKey(splitLoggedHours.get(i)))
                loggedHoursMap.put(splitLoggedHours.get(i), Integer.valueOf(splitLoggedHours.get(i + 1)));
            else {
                loggedHoursMap.put(splitLoggedHours.get(i), loggedHoursMap.get(splitLoggedHours.get(i)) +
                        Integer.valueOf(splitLoggedHours.get(i + 1)));
            }
        }



        /* egyéb lehetőségek map iterálására

        To summarize the other answers and combine them with what I know, I found 10 main ways to do this (see below).
        Also, I wrote some performance tests (see results below). For example, if we want to find the sum of all of the
        keys and values of a map, we can write:

        A többi válasz összefoglalására és az általam ismertekkel való kombinálására 10 fő módszert találtam erre (lásd alább).
        Ezenkívül írtam néhány teljesítménytesztet (lásd az eredményeket lent). Például, ha meg akarjuk találni a térkép összes
        kulcsának és értékének összegét, akkor a következőket írhatjuk:


        1. Using iterator and Map.Entry

        long i = 0;
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> pair = it.next();
            i += pair.getKey() + pair.getValue();
        }

        --
        2. Using foreach and Map.Entry

        long i = 0;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            i += pair.getKey() + pair.getValue();
        }

        --
        3. Using forEach from Java 8

        final long[] i = {0};
        map.forEach((k, v) -> i[0] += k + v);

        --
        4. Using keySet and foreach

        long i = 0;
        for (Integer key : map.keySet()) {
            i += key + map.get(key);
        }

        --
        5. Using keySet and iterator

        long i = 0;
        Iterator<Integer> itr2 = map.keySet().iterator();
        while (itr2.hasNext()) {
            Integer key = itr2.next();
            i += key + map.get(key);
        }

        --
        6. Using for and Map.Entry

        long i = 0;
        for (Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator(); entries.hasNext(); ) {
            Map.Entry<Integer, Integer> entry = entries.next();
            i += entry.getKey() + entry.getValue();
        }

        --
        7. Using the Java 8 Stream API

        final long[] i = {0};
        map.entrySet().stream().forEach(e -> i[0] += e.getKey() + e.getValue());

        --
        8. Using the Java 8 Stream API parallel

        final long[] i = {0};
        map.entrySet().stream().parallel().forEach(e -> i[0] += e.getKey() + e.getValue());

        --
        9. Using IterableMap of Apache Collections

        long i = 0;
        MapIterator<Integer, Integer> it = iterableMap.mapIterator();
        while (it.hasNext()) {
            i += it.next() + it.getValue();
        }

        --
        10. Using MutableMap of Eclipse (CS) collections

        final long[] i = {0};
        mutableMap.forEachKeyValue((key, value) -> {
            i[0] += key + value;
        });

         */


    }
}
