package Exercises;

            /* 75. Feladat (saját megoldás)
            Készítsetek teszteset futási összesítő alkalmazást.
            A futási eredmények az alábbi formában tároljuk le
            egy ArrayList-ben vagy konzolról beolvasva kapjuk.
            Minden teszteset futás kezdődik egy 4 számjegyű számmal,
            majd egy 1-es ha PASS, X ha SKIP, valamint 0 ha FAILED.
            Egy példa adat tehát: 00171 A feladat, hogy számoljuk össze
            a)	Összesen hány teszteset került futtatásra?
            b)	Mennyi volt PASS? SKIP? FAILED?
            c)	Jelenítsük meg az adatokat százalékos formában is  */

import java.util.Arrays;
import java.util.List;

public class F75_Megcsinalva_deUjra {
    public static void main(String[] args) {
        List<String> testCaseList = Arrays.asList("00171", "00181", "00190", "00200", "0021X", "0023X", "00220", "00281", "00290");

        String controllTestCase = "";
        float passCount = 0;
        float failedCount = 0;
        float skipCount = 0;
        for (int i = 0; i < testCaseList.size(); i++) {
            controllTestCase = testCaseList.get(i);
            switch (controllTestCase.charAt(4) + "") {
                case "1":
                    passCount += 1;
                    break;
                case "X":
                    skipCount += 1;
                    break;
                case "0":
                    failedCount += 1;
                    break;
            }
        }

        System.out.println();
        System.out.println("Összesen " + testCaseList.size() + " teszteset futott le.");
        System.out.println("PASS: " + passCount + " (" + passCount/testCaseList.size()*100 + "%)");
        System.out.println("FAILED: " + failedCount + " (" + failedCount/testCaseList.size()*100 + "%)");
        System.out.println("SKIP: " + skipCount + " (" + skipCount/testCaseList.size()*100 + "%)");
    }
}
