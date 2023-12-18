package Exercises;

import java.util.Scanner;

        /* 22. Feladat (saját megoldás)
        Írjuk át a számológép feladatot, switch-case adatszerkezet
        segítségével, kiváltva az if-else szelekciókat. Miután kiírta
        az eredményt kérdezze meg, hogy a felhasználó szeretne-e
        további számításokat végezni. Y/N-val, (azaz Yes/No-val)
        lehet válaszolni. Y esetén természetesen újraindul a fenti
        folyamat. N esetén pedig az illedelmes számológép megköszöni,
        hogy szolgálhatta felhasználóját.  */

public class F22_Szamologep_While {
    public static void main(String[] args) {

        String userAnswer = "i";
        while (userAnswer.equals("i")) {
            System.out.println();
            System.out.println("Kérem az első számot:");
            Scanner scan = new Scanner(System.in); // a "Scanner scan = new Scanner(System.in)" -t  elég egyszer meghívni!
            float userNum1 = scan.nextFloat();

            System.out.println("Kérem a második számot:");
            float userNum2 = scan.nextFloat();

            System.out.println("Kérek egy operátort! (+, -, *, /, p(pumped))");
            String userOperator = scan.next();

            float result = 0;
            switch (userOperator) {
                case "+":
                    result = userNum1 + userNum2;
                    System.out.println(userNum1 + " + " + userNum2 + " = " + result);
                    break;
                case "-":
                    result = userNum1 - userNum2;
                    System.out.println(userNum1 + " - " + userNum2 + " = " + result);
                    break;
                case "*":
                    result = userNum1 * userNum2;
                    System.out.println(userNum1 + " * " + userNum2 + " = " + result);
                    break;
                case "/":
                    result = userNum1 / userNum2;
                    System.out.println(userNum1 + " / " + userNum2 + " = " + result);
                    break;
                case "pumped", "p":
                    result = userNum1 * userNum1 * userNum1 * userNum2 * userNum2 * userNum2;
                    System.out.println(userNum1 + " pumped " + userNum2 + " = " + result);
                    break;
            }
            System.out.println();
            System.out.println("Szeretnél még számításokat végezni? i/n");
            Scanner scanString = new Scanner(System.in);
            userAnswer = scanString.next();
        }
        System.out.println();
        System.out.println("Köszönöm, hogy velem számoltál.");
    }
}

