package Exercises;

            /* 75. Feladat (Zsolt megoldása)
            Készítsetek teszteset futási összesítő alkalmazást. A futási eredményeket
            tároljuk le egy ArrayList-ben. Minden teszteset futás kezdődik egy 4 számjegyű
            számmal, majd egy 1-es, ha PASS, X ha SKIP, valamint 0, ha FAILED. Egy példa
            adat tehát: 00171. A feladat, hogy számoljuk össze
            - összesen hány teszteset került futtatásra?
            - mennyi volt PASS? SKIP? FAILED?
            - jelenítsük meg az adatokat százalékos formában is. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F75a_String_List_Charat_Teszteset5ikszam_Osszeadas2 {
    public static void main(String[] args) {
        List<String> execitonResultList = Arrays.asList("00171", "00181", "00190", "00200", "0021X", "00220");

        int passCount = 0, failedCount = 0, skipCount = 0;
        //int tccount=0;
        for (String execution : execitonResultList) {
            // tccount++;
            System.out.println(execution);
            /*
            if(execution.endsWith("1")){
                passCount++;
            }else if(execution.endsWith("0")){
                failedCount++;
            }else{
                skipCount++;
            }*/

            /*
            char executionResult = execution.charAt(4);
            switch (executionResult) {
                case '1':
                    passCount++;
                    break;
                case '0':
                    failedCount++;
                    break;
                case 'X':
                    skipCount++;
                    break;
            }*/
            /*
            String executionResult = execution.charAt(4)+"";
            switch (executionResult) {
                case "1":
                    passCount++;
                    break;
                case "0":
                    failedCount++;
                    break;
                case "X":
                    skipCount++;
                    break;
            }*/
            String executionResult = execution.substring(4);
            switch (executionResult) {
                case "1":
                    passCount++;
                    break;
                case "0":
                    failedCount++;
                    break;
                case "X":
                    skipCount++;
                    break;
            }
        }
        System.out.println("TOTAL executed test cases: " + execitonResultList.size());
        // System.out.println("TOTAL executed test cases: " + tccount); //ua mint fentebb
        // System.out.println("TOTAL executed test cases: " + (passCount + failedCount + skipCount)); //ua mint fentebb

        System.out.println("PASSED test executions: " + passCount);
        System.out.println("FAILED test executions: " + failedCount);
        System.out.println("SKIPPED test executions: " + skipCount);

        double passCountInDouble = passCount;
        System.out.println("PASSED test executions in %: " + passCountInDouble / execitonResultList.size() * 100 + "%");
        System.out.println("FAILED test executions in %: " + (double) failedCount / execitonResultList.size() * 100 + "%");
        System.out.println("SKIPPED test executions in %: " + (double) skipCount / execitonResultList.size() * 100 + "%");

        /*
        String varible = "5";
        double variableInDouble =Double.parseDouble(varible);
        int varibleInt = 5;
        double intVariableInDouble = (double)varibleInt;
        */
    }
}
