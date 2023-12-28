package Exercises;

            /* 71. Feladat (saját megoldás)
            Készítsetek egy alkalmazást, ami mindaddig beolvas egy szöveget a konzolról,
            amíg x-et nem kap. Minden értéket, amit beolvasott, mentsünk el egy List-be,
            de már csak a bevitt szöveg kisbetűs változatát! */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F71_String_List_toLowerCase {
    public static void main(String[] args) {

        List<String> textList = getTextsFromUser();
        listPrint(textList);
    }

    private static List<String> getTextsFromUser() {
        List<String> localFruitList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        do {
            localFruitList.add(scan.nextLine().toLowerCase());
        } while (!localFruitList.contains("x"));
        if (localFruitList.contains("x"))
            localFruitList.remove("x");
        return localFruitList;
    }

    private static void listPrint(List<String> textList) {
        System.out.println(textList);
    }
}
