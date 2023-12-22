package Exercises;

            /* 64. Feladat (Órai) (saját megoldás)
            Dolgozzátok át a számológép programot úgy, hogy tartalmazzon külön metódust az
            adatok bekérésére a felhasználótól ( getNumberFromUser() ), valamint egyet az
            operátor beolvasásra (getOperatorFromUser() ). Ezt követően egy külön metódust
            amely elvégzi a műveletet és visszaadja az eredményt
            ( getCalculationResult(operator, number1,number2) ), Végül egy metódust ami
            kiírja az eredményt a konzolra (showResultToTheUser(result) ) */

            // getNumberFromUser();
            // getOperatorFromUser();
            // getCalculationResult();
            // showResultToTheUser();

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F64_Met_Szamologep {
    public static void main(String[] args) {
        List<Float> calcNumList = getNumberFromUser();
        float num1 = calcNumList.get(0);
        float num2 = calcNumList.get(1);
        String operator = getOperatorFromUser();
        float result = getCalculationResult(operator, num1, num2);
        showResultToTheUser(result);
    }

    public static List<Float> getNumberFromUser() {
        List<Float> scanList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Kérem az első számot:");
        scanList.add(scan.nextFloat());
        System.out.println("Kérem a második számot:");
        scanList.add(scan.nextFloat());
        return scanList;
    }

    public static String getOperatorFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérek egy operátort! (+, -, *, /, p(pumped))");
        return scan.next();
    }

    public static float getCalculationResult(String localOperator, float number1, float number2) {
        float localResult = 0;
        switch (localOperator) {
            case "+":
                localResult = number1 + number2;
                break;
            case "-":
                localResult = number1 - number2;
                break;
            case "*":
                localResult = number1 * number2;
                break;
            case "/":
                localResult = number1 / number2;
                break;
            case "pumped", "p":
                localResult = number1 * number1 * number1 * number2 * number2 * number2;
                break;
        }
        return localResult;
    }

    public static void showResultToTheUser(Float localResult) {
        System.out.println("Az eredmény: " + localResult);
    }
}