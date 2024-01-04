package Temps.Array_and_Collections;

            /* Lista (list)
            - sorszám alapú (indexelt)
            - bármelyik elemet elkérhetjük
            - engedi egy adott elem többszöri ismétlődését
            - nincs méretkorlát (létrehozását követően hozzáadhatunk és eltávolíthatunk elemeket, akár
             futás időben.)
            - bármennyi null értéket hozzáadhatunk

            - több memóriát használ mint a tömb és (elvileg) lassabb, mint a tömb


            Set (halmaz)
            - nem sorszám alapú (nem indexelt, ezért egy konkrét elemet nem tudunk elkérni tőle)
            - nem engedi egy adott elem többszöri ismétlődését, ezért inkább egyedi elemek tárolására alkalmas (ha kétszer beletesszük ugyanazt az elemet, akkor is csak egyszer fogja tartalmazni).
            - nincs méretkorlát
            - csak egy null értéket tartalmazhat

            - elvileg lassú az új elem hozzáadásában és törlésében */

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class List_Set {
    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        List<Integer> numsList = new ArrayList<>();
        List<Double> doubleNumsList = new ArrayList<>();
        List<Boolean> booleansList = new ArrayList<>();

        //lista létrehozása érték(ek) megadásával
        List<String> namesList3 = Arrays.asList("Sándor", "József", "Benedek");
        List<Integer> numsList3 = Arrays.asList(1990, 1987, 2002, 1992);


        System.out.println("----------még üres a lista és lekérdezés----------");
        System.out.println(namesList.isEmpty()); // annak lekérdezése, hogy a lista "üres-e?"
        System.out.println(namesList.size());    // a lista méretének lekérdezése


        System.out.println();

        System.out.println("----------elem hozzáadása a listához és lekérdezés----------");
        namesList.add("Autó"); // elem hozzáadása a listához
        System.out.println(namesList.isEmpty());
        System.out.println(namesList.size());


        System.out.println();

        System.out.println("----------még néhány elem hozzáadásra került----------");
        namesList.add("Hajó");
        namesList.add("Repülő");
        namesList.add("Busz");
        System.out.println(namesList.size());


        System.out.println();

        System.out.println("----------egyszerre több elem hozzáadása a listához és lekérdezés----------");
        List<String> namesList2 = Arrays.asList("Sándor", "József", "Benedek");
        System.out.println(namesList2.size());
        System.out.println(namesList2); // a lista tartalmának kiíratása(lekérdezése)


        System.out.println();

        System.out.println("----------a namesList-hez hozzáadásra került a namesList2----------");
        namesList.addAll(namesList2);
        System.out.println(namesList2.size());
        System.out.println(namesList);
        System.out.println(namesList2);


        System.out.println();

        System.out.println("----------a 4-ik elem kiíratása (a 0 az első)----------");
        System.out.println(namesList.get(3));


        System.out.println();

        System.out.println("----------egy elem törlése indexszámmal (ami után az indexelés is megváltozik)----------");
        namesList.remove(2);
        System.out.println(namesList);
        System.out.println(namesList.get(3));


        System.out.println();

        System.out.println("----------egy elem törlése megnevezéssel----------");
        namesList.remove("Busz");
        System.out.println(namesList);
        System.out.println(namesList.get(3));


        System.out.println();

        System.out.println("----------lekérdezés a listától, hogy tartalmaz-e egy bizonyos elemet----------");
        if (namesList.contains("József")) {
            System.out.println("Van benne József");
        }


        System.out.println();

        System.out.println("----------integer lista feltöltése bizonyos számokkal----------");

        for (int i = 100; i <= 111; i++) {
            numsList.add(i);
        }
        System.out.println(numsList);


        System.out.println();

        System.out.println("----------String lista feltöltése usertől bekért adatokkal----------");

        /*

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            filmList.add(scan.next());
        }

         */


        System.out.println();

        System.out.println("----------String lista elemeinek (felszeletelése) elválasztása egymástól és új listába helyezése----------");

        // mindkettőnek ugyanaz az eredménye
        List<String> loggedHours = new ArrayList<>();
        List<String> splitLoggedHours = new ArrayList<>();
        for (String item : loggedHours)
            for (String spliItem : item.split(","))
                splitLoggedHours.add(spliItem);

/*      ugyanaz az eredmény:
        List<String> loggedHours = new ArrayList<>();
        List<String> splitLoggedHours = new ArrayList<>();
        for (String item : loggedHours)
            splitLoggedHours.addAll(Arrays.asList(item.split(",")));
    }
 */

        System.out.println("----------String lista elemeinek (felszeletelése) elválasztása egymástól és a számok összeadása tömb segítségével----------");
        List<String> companies = Arrays.asList(
                "Zuckerberg,4", "Steve,4", "Bill,1", "Bill,2");

        int result = 0;
        for (String company : companies) {
            String[] companyArray = company.split(",");
            result += Integer.parseInt(companyArray[1]);
        }
        System.out.println("Total number of companies: " + result);


        System.out.println();

        System.out.println("----------lista sorrendbe rendezése----------");

        Collections.sort(numsList3);
        System.out.println(numsList3);
        Collections.sort(namesList3);
        System.out.println(namesList3);

        // visszafelé
        Collections.reverse(numsList3);
        System.out.println(numsList3);
        Collections.reverse(namesList3);
        System.out.println(namesList3);

        System.out.println();

        //lista sorrendjének felcserélése (akkor is, ha nincsenek sorba rendezve)
        List<Integer> forditottSorrend = new ArrayList<>();
        for (Integer item : numsList) {
            forditottSorrend.add(0, item);
        }
        System.out.println(forditottSorrend);


        System.out.println();

        System.out.println("----------Lista kiíratása----------");

        // egyszerűen
        System.out.println(numsList);

        System.out.println();

        //for-each-vel
        for (Integer item : numsList)
            System.out.println(item);

        System.out.println();

        // for-ral
        for (
                int i = 0; i < numsList.size(); i++)
            System.out.println(numsList.get(i));


        System.out.println();

        System.out.println("----------Lista integereinek összeadása----------");

        int sum = 0;
        for (
                Integer item : numsList)
            sum = sum + item;

        System.out.println(sum);


        System.out.println();

        System.out.println("----------egy lista nem csak egy típusú elemet tartalmazhat----------");

        List<Object> names = Arrays.asList("Sándor", "József", "Benedek", 1 - 4, true); // a lista tartalmazhat egyszerre számot, stringet, booleant, stb. is:
        System.out.println(names);


        System.out.println();
        System.out.println();
        System.out.println(namesList);
        System.out.println(numsList);


        System.out.println();

        System.out.println("----------Lista tartalmának átírása map-be. A key-ek maguk a címek lesznek (de mindegyik csak egyszer) és a value, mint darabszám (az adott cím előfordulásának száma) jelenik meg (azaz, ahányszor szerepel egy elem a listában)----------");

        List<String> booksList = Arrays.asList("Son", "Harry Potter VI.", "Down and Out in Paris and London", "All about Sam", "1984", "Keep the Aspidistra Flying", "The Fellowship of the Ring", "Keep the Aspidistra Flying", "A Summer to Die", "Harry Potter V", "The Return of the King", "Harry Potter VI.", "The Return of the King", "Down and Out in Paris and London", "Harry Potter V", "A Summer to Die", "Harry Potter I.", "Harry Potter III.", "All about Sam", "Animal Farm", "Gathering Blue", "Homage to Catalonia", "Son", "The Two Towers", "Harry Potter III.", "Messenger", "The Return of the King", "Homage to Catalonia", "Harry Potter III.", "Harry Potter I.", "The Two Towers", "Gathering Blue", "Messenger", "The Fellowship of the Ring", "1984", "Harry Potter VI.", "Keep the Aspidistra Flying", "Gathering Blue", "Harry Potter V", "Harry Potter II.", "Homage to Catalonia", "Harry Potter V", "Animal Farm", "All about Sam", "Son");
        Map<String, Integer> booksMap = new ConcurrentHashMap<>();

        for (String book : booksList) {
            if (booksMap.containsKey(book)) {
                int originValue = booksMap.get(book);
                booksMap.put(book, originValue + 1);
            } else {
                booksMap.put(book, 1);
            }
        }
        System.out.println(booksMap);



        /*

        A lista sokkal rugalmasabb, mint a tömb. Egy lista pl. tartalmazhat sok más listát is:
        List<List<String>> names = Arrays.asList("Sándor", "József", "Benedek");

         */


        System.out.println();

        System.out.println("----------Set----------");

        // létrehozás
        Set<String> randomNames = new HashSet<>();
        Set<Integer> randomNums = new HashSet<>();
        Set<Double> randomDoubleNums = new HashSet<>();
        Set<Boolean> randomBooleans = new HashSet<>();


        randomNames.add("asszony");     // új elem hozzáadása
        randomNames.add("nő");
        randomNames.add("lány");
        randomNames.add("hölgy");
        randomDoubleNums.add(2.1);
        randomBooleans.add(false);

        System.out.println(randomNames); // a kiolvasás csak egyben lehetséges, nem lehet elkérni egy adott elemet

        randomNums.add(12);
        randomNums.add(25);
        randomNums.add(5);
        randomNums.add(38);

        for (
                Integer item : randomNums)  // kiolvasás for-each-vel
            System.out.println(item);

        System.out.println(randomNums);


        randomNums.size();               // visszaadja, hogy hány elem van aktuálisan a listában
        randomNums.isEmpty();            // megmondja, hogy a lista üres-e, vagy sem, az eredménye true vagy false lesz
        randomNums.remove(15);        // kitörli az adott elemet
        randomNums.contains(15);         //megnézi, hogy az adott elem benne van-e a halmaz


    }
}
