package Exercises;

            /* 75.b Feladat (saját megoldás)
            Készítsetek teszteset futási összesítő alkalmazást. A futási eredményeket a
            konzolról beolvasva kapjuk. Minden teszteset futás kezdődik egy 4 számjegyű
            számmal, majd egy 1-es, ha PASS, X ha SKIP, valamint 0, ha FAILED. Egy
            példa adat tehát: 00171. A feladat, hogy számoljuk össze:
            - összesen hány teszteset került futtatásra?
            - mennyi volt PASS? SKIP? FAILED?
            - jelenítsük meg az adatokat százalékos formában is. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        main();
            getTestcases();
            analyse();
            printSum();
*/

public class F75b_String_List_Charat_Teszteset5ikszam_Osszeadas_FromUser {
    public static void main(String[] args) {
        List<String> testCaseList = getTestcases();
        List<Float> listAnalyse = analyse(testCaseList);
        printSum(testCaseList, listAnalyse);
    }

    private static List<String> getTestcases() {
        List<String> localTestCases = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String item;
        System.out.println("Kérlek, add meg a teszteseteket:");
        for (int i = 1; i <= 5; i++) {
            item = scan.nextLine();
            String fourthDigit = item.charAt(4) + "";
            if (fourthDigit.equals("1") || fourthDigit.equals("X") || fourthDigit.equals("0"))
                localTestCases.add(item);
            else {
                System.out.println("A teszteset 5-ik számjegye csak \"1\", " + "\"X\" vagy " + "\"0\" lehet!");
                i--;
            }
        }
        return localTestCases;
    }

    private static List<Float> analyse(List<String> testCaseList) {
        List<Float> localTestCaseList = new ArrayList<>();
        float sum1 = 0;
        float sumX = 0;
        float sum0 = 0;
        for (String item : testCaseList)
            switch (item.charAt(4) + "") {
                case "1":
                    sum1 += +1;
                    break;
                case "X":
                    sumX += +1;
                    break;
                case "0":
                    sum0 += +1;
                    break;
            }
        localTestCaseList.add(sum1);
        localTestCaseList.add(sumX);
        localTestCaseList.add(sum0);
        return localTestCaseList;
    }

    private static void printSum(List<String> testCaseList, List<Float> listAnalyse) {
        System.out.println("Összesen " + testCaseList.size() + " teszteset került lefuttatásra.");
        System.out.println(listAnalyse.get(0) + " PASS (" + (listAnalyse.get(0) / testCaseList.size() * 100) + "%)");
        System.out.println(listAnalyse.get(1) + " SKIP (" + (listAnalyse.get(1) / testCaseList.size() * 100) + "%)");
        System.out.println(listAnalyse.get(2) + " FAILED (" + (listAnalyse.get(2) / testCaseList.size() * 100) + "%)");
    }
}