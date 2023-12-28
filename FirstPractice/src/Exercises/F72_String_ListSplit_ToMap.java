package Exercises;

            /* 72. Feladat (Órai) (saját megoldás)
            Adott egy List, amiben az adott hónapban felvásárolt cégeket rögzítjük. Pl ez:
            List<String> companies = Arrays.asList(
            "Zuckerberg,4", "Steve,4", "Bill,1", "Bill,2", "Zuckerberg,4", "Bill,2",
            "Zuckerberg,1", "Zuckerberg,3", "Zuckerberg,1", "Zuckerberg,1", "Steve,4",
            "Bill,2", "Zuckerberg,3", "Bill,2", "Zuckerberg,4", "Steve,1", "Bill,3",
            "Steve,2", "Steve,2", "Bill,1", "Zuckerberg,4", "Bill,4", "Steve,4", "Bill,2",
            "Bill,3", "Zuckerberg,3", "Steve,4", "Zuckerberg,4", "Bill,2", "Zuckerberg,3");
            Összegezzük, hogy összesen hány céget vásároltak fel a fenti úriemberek.

            Kiegészítettem azzal, hogy egyenként is összegeztem, hogy kinek mennyi cége van
            és ettől vált összetetté a feladat. */

import java.util.*;

/*
        main();
            splitString();
            listConvertToMap();
            printMap();
*/

public class F72_String_ListSplit_ToMap {
    public static void main(String[] args) {
        List<String> companies = Arrays.asList(
                "Zuckerberg,4", "Steve,4", "Bill,1", "Bill,2", "Zuckerberg,4", "Bill,2",
                "Zuckerberg,1", "Zuckerberg,3", "Zuckerberg,1", "Zuckerberg,1", "Steve,4",
                "Bill,2", "Zuckerberg,3", "Bill,2", "Zuckerberg,4", "Steve,1", "Bill,3",
                "Steve,2", "Steve,2", "Bill,1", "Zuckerberg,4", "Bill,4", "Steve,4", "Bill,2",
                "Bill,3", "Zuckerberg,3", "Steve,4", "Zuckerberg,4", "Bill,2", "Zuckerberg,3");

        List<String> splitCompanies = splitListStrings(companies);
        Map<String, Integer> CompaniesMap = listConvertToMap(splitCompanies);
        printMap(CompaniesMap);
    }

    // lista elemeinek felszeletelése
    private static List<String> splitListStrings(List<String> companies) {
        List<String> splitCompanies = new ArrayList<>();
        for (String item : companies)
            splitCompanies.addAll(Arrays.asList(item.split(",")));
        return splitCompanies;
    }

    // lista tartalmának áthelyezése mapbe úgy, hogy a lista minden második eleme legyen a value és ne felül írja a már meglévőt, hanem hozzáadásra kerüljön
    private static Map<String, Integer> listConvertToMap(List<String> splitCompanies) {
        Map<String, Integer> localCompaniesMap = new HashMap<>();
        for (int i = 0; i < splitCompanies.size(); i += 2) {
            if (!localCompaniesMap.containsKey(splitCompanies.get(i)))
                localCompaniesMap.put(splitCompanies.get(i), Integer.valueOf(splitCompanies.get(i + 1)));
            else {
                localCompaniesMap.put(splitCompanies.get(i), localCompaniesMap.get(splitCompanies.get(i)) +
                        Integer.valueOf(splitCompanies.get(i + 1)));
            }
        }
        return localCompaniesMap;
    }

    private static void printMap(Map<String, Integer> CompaniesMap) {
        int sum = 0;
        for (Map.Entry mapElement : CompaniesMap.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue() +" céget vásárolt.");
            sum = sum+ (int) mapElement.getValue();
        }
        System.out.println("Összesen "+ sum +" céget vásároltak.");
    }
}
