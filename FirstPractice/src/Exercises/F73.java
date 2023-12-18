package Exercises;

import java.util.*;

public class F73 {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();
        Map<String, String> splitNames = new HashMap<>();
        String element = "";

        System.out.println();
        System.out.println("Kérlek, add meg a bevásárlólista tételeit!");
        for (int i = 1; i <= 3; i++) {
            System.out.println();
            System.out.println(i + ". tétel:");
            element = scan.next();
            shoppingList.add(element);
        }
        System.out.println();
        System.out.println("A bevásárlólista:");

        int result = 0;
        for (String company : shoppingList) {
/*
            splitNames.put(company.get);
            //booksMap.put(book, originValue + 1);
           // String<> splitNames = company.split("-");
            //System.out.println(companyArray[1]);
           // result += Integer.parseInt(splitNames[1]);

            System.out.println(splitNames);

            System.out.println("Total number of comanies: " + result);
            // for (String item : shoppingList)
            //     System.out.println(item);

 */

        }
    }
}
