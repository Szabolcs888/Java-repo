package Exercises;

            /* 72. Feladat (Órai) (Zsolt megoldása)
            Adott egy List, amiben az adott hónapban felvásárolt cégeket rögzítjük. Pl ez:
            List<String> companies = Arrays.asList(
            "Zuckerberg,4", "Steve,4", "Bill,1", "Bill,2", "Zuckerberg,4", "Bill,2",
            "Zuckerberg,1", "Zuckerberg,3", "Zuckerberg,1", "Zuckerberg,1", "Steve,4",
            "Bill,2", "Zuckerberg,3", "Bill,2", "Zuckerberg,4", "Steve,1", "Bill,3",
            "Steve,2", "Steve,2", "Bill,1", "Zuckerberg,4", "Bill,4", "Steve,4", "Bill,2",
            "Bill,3", "Zuckerberg,3", "Steve,4", "Zuckerberg,4", "Bill,2", "Zuckerberg,3");
            Összegezzük, hogy összesen hány céget vásároltak fel a fenti úriemberek. */

import java.util.*;

public class F72_String_ListSplit_OsszeadasToArray_2 {
    public static void main(String[] args) {

        List<String> companies = Arrays.asList(
                "Zuckerberg,4", "Steve,4", "Bill,1", "Bill,2", "Zuckerberg,4", "Bill,2",
                "Zuckerberg,1", "Zuckerberg,3", "Zuckerberg,1", "Zuckerberg,1", "Steve,4",
                "Bill,2", "Zuckerberg,3", "Bill,2", "Zuckerberg,4", "Steve,1",
                "Bill,3", "Steve,2", "Steve,2", "Bill,1", "Zuckerberg,4",
                "Bill,4", "Steve,4", "Bill,2", "Bill,3", "Zuckerberg,3",
                "Steve,4", "Zuckerberg,4", "Bill,2", "Zuckerberg,3");
        // "Zuckerberg,4"
        // String name = "Zuckerberg";
        // int compCount = 4;

        int result = 0;
        for (String company : companies) {
            String[] companyArray = company.split(",");
            //System.out.println(companyArray[1]);
            result += Integer.parseInt(companyArray[1]);
        }

        System.out.println("Total number of companies: " + result);
    }
}
