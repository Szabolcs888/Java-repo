package Exercises;

            /* 94. Feladat (saját megoldás)
            A task64 megoldása alapján bővítsétek ki a számológép működését, hogy amit a felhasználó
            számol és annak eredménye kerüljön elmentésre egy naplófájlként. (calculator.log) néven */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        main();
            getNumberFromUser();
            getOperatorFromUser();
            getCalculationResult();
            showResultToTheUser();
            writeToFile();
*/

public class F94_WriteFile_Szamologep {
    public static void main(String[] args) {
        List<Float> calcNumList = getNumberFromUser();
        float num1 = calcNumList.get(0);
        float num2 = calcNumList.get(1);
        String operator = getOperatorFromUser();
        float result = getCalculationResult(operator, num1, num2);
        showResultToTheUser(result);
        writeToFile(num1, num2, operator, result);
    }

    public static List<Float> getNumberFromUser() {
        List<Float> scanList = new ArrayList<>();
        float number1 = 0;
        float number2 = 0;
        boolean num1YOn;
        System.out.println(System.lineSeparator() + "Kérem az első számot:");
        do {
            try {
                Scanner scan = new Scanner(System.in);
                number1 = scan.nextFloat();
                num1YOn = true;
            } catch (Exception e) {
                num1YOn = false;
                System.err.println("Valós számot adj meg!");
            }
        } while (num1YOn == false);
        System.out.println(System.lineSeparator() + "Kérem a második számot:");
        do {
            try {
                Scanner scan = new Scanner(System.in);
                number2 = scan.nextFloat();
                num1YOn = true;
            } catch (Exception e) {
                num1YOn = false;
                System.err.println("Valós számot adj meg!");
            }
        } while (num1YOn == false);
        scanList.add(number1);
        scanList.add(number2);
        return scanList;
    }

    public static String getOperatorFromUser() {
        Scanner scan = new Scanner(System.in);
        String operator = "";
        System.out.println(System.lineSeparator() + "Kérek egy operátort! (+, -, *, /, p(pumped))");
        do {
            try {
                operator = scan.next();
            } catch (Exception e) {
            }
            // if (!operator.equals("+") || !operator.equals("-") || !operator.equals("*") || !operator.equals("/") || !operator.equals("p") || !operator.equals("pumped"))
            //if (!operator.equals("+"))
            if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/") && !operator.equals("p") && !operator.equals("pumped")) {
                System.err.println(System.lineSeparator() + "Valós operátort adj meg! (+, -, *, /, p(pumped))");
            }
        } while (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/") && !operator.equals("p") && !operator.equals("pumped"));
        return operator;
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
        System.out.println(System.lineSeparator() + "Az eredmény: " + localResult);
    }

    private static void writeToFile(float num1, float num2, String operator, float result) {
        try {
            String content = num1 + " " + operator + " " + num2 + " = " + result + System.lineSeparator();
            Files.write(Paths.get("src/resources/calculator.log"), content.getBytes("UTF-8"), StandardOpenOption.APPEND);
        } catch (IOException e) {
        }
    }
}