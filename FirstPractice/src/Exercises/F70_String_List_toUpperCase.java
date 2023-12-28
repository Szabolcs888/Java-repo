package Exercises;

            /* 70. Feladat (Órai) (saját megoldás)
            Adott egy neveket tartalmazó lista. Készítsünk egy programot, ami készít
            egy újabb listát a meglévő nevekből nagybetűre módosítva azok minden betűjét.
            Miután elkészítettük az új listát, írjuk ki annak tartalmát. Nem szükséges
            for ciklust használnunk a végeredmény kiíratásához, elég ha a listát
            odaadjuk a System.out.println() metódusnak. */

import java.util.ArrayList;
import java.util.List;

/*
        main();
            getListWithNames();
            listTransformToUppercase();
            printList();
*/

public class F70_String_List_toUpperCase {
    public static void main(String[] args) {
/*      // metódus nélkül
        List<String> namesList = Arrays.asList("Sándor", "József", "Benedek");
        List<String> newNamesList = new ArrayList<>();

        for (String item : namesList)
            newNamesList.add(item.toUpperCase());

        System.out.println(newNamesList);
 */

        List<String> namesList = getListWithNames();
        List<String> namesListToUpper = listTransformToUppercase(namesList);
        printList(namesListToUpper);
    }

    private static List<String> getListWithNames() {
        List<String> originNamesList = new ArrayList<>();
        originNamesList.add("Sándor");
        originNamesList.add("József");
        originNamesList.add("Benedek");
        return originNamesList;
    }

    private static List<String> listTransformToUppercase(List<String> namesList) {
        List<String> newNamesList = new ArrayList<>();
        for (String item : namesList)
            newNamesList.add(item.toUpperCase());
        return newNamesList;
    }

    private static void printList(List<String> newNamesList) {
        System.out.println(newNamesList);
    }
}
