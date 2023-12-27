package Exercises;

            /* 69. Feladat (saját megoldás)
            A 37. feladat metódusítása */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        main();
            getFruitList();
            printWithFor();
            printWithForEach();
 */

public class F69_Met_List_FeltoltesKiolvasas {
    public static void main(String[] args) {

        List<String> fruitList = getFruitList();
        printWithFor(fruitList);
        System.out.println("---------------------------");
        printWithForEach(fruitList);
    }

    private static List<String> getFruitList() {
        List<String> localFruitList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            localFruitList.add(scan.nextLine());
        }
        return localFruitList;
    }

    private static void printWithFor(List<String> fruitList) {
        for (int i =0; i < fruitList.size(); i++)
            System.out.println(fruitList.get(i));
    }

    private static void printWithForEach(List<String> fruitList) {
        for (String item : fruitList)
            System.out.println(item);
    }
}
