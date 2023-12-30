package Exercises;

            /* 74. Feladat (Órai) (saját megoldás)
            Írjunk programot, amely a beolvasott cikkszám (fixen 3 karakter hosszú),
            majd közvetlen utána lévő darabszám beviteli értéket fel tudja dolgozni,
            és össze tudja adni őket, hogy összesen hány termék van. Figyeljünk oda,
            hogy 0-s darabszám nem lehet, illetve az egyszerűség kedvéért maximum 5
            lehet a darabszám. Egy példa tétel: 1376

            Azért jobb megoldás a substring, mint a charAt, mert nem biztos, hogy
            egy számjegyű a darabszám */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        main();
            getItems();
            sumItems();
            print();
*/

public class F74_String_List_Substring_Cikkszam4ikszam_Osszeadas {
    public static void main(String[] args) {
        List<String> itemList = getItems();
        int sum = sumItems(itemList);
        print(itemList, sum);
    }

    private static List<String> getItems() {
        List<String> localItemList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String item;
        System.out.println("Kérlek, add meg a tételeket:");
        for (int i = 1; i <= 5; i++) {
            item = scan.nextLine();
            String fourthDigit = item.substring(3);
            if (!fourthDigit.equals("0"))
                localItemList.add(item);
            else {
                System.out.println("Nem lehet 0 a cikkszám 4-ik száma, mert az a darabszám!");
                i--;
            }
        }
        return localItemList;
    }

    private static int sumItems(List<String> itemList) {
        int sum = 0;
        for (String item : itemList)
            sum += Integer.parseInt(item.substring(3));
        return sum;
    }

    private static void print(List<String> itemList, int sum) {
        System.out.println("A cikkszámok mennyisége: " + itemList.size());
        System.out.println("Összesen " + sum + " termék van.");
    }
}
