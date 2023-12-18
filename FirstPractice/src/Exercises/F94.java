package Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class F94 {
    public static void main(String[] args) {
        float number1 = getNumberFromUser();
        float number2 = getNumberFromUser();
        String userOperator = getOperatorFromUser();
        float result = getCalculationResult(userOperator, number1, number2);
        showResultToTheFile(userOperator, number1, number2, result);
    }

    public static float getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number: ");
        float userNumber = sc.nextFloat();
        return userNumber;
    }

    public static String getOperatorFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the an operator: ");
        String userOperator = sc.next();
        return userOperator;
    }

    public static float getCalculationResult(String operator, float number1, float number2) {
        float calResult = 0;
        switch (operator) {
            case "+" -> {
                calResult = number1 + number2;
            }
            case "-" -> {
                calResult = number1 - number2;
            }
            case "*" -> {
                calResult = number1 * number2;
            }
            case "/" -> {
                calResult = number1 / number2;
            }
            default -> System.out.println("Wrong operator, please restart the calculator");
        }
        return calResult;
    }

    public static void showResultToTheFile(String userOperator, float number1, float number2float, float result) {
        try {
            String content = number1 + userOperator + number2float + "=" + result;
            Files.write(Paths.get("src/resources/calculator.log"), content.getBytes("UTF-8"), StandardOpenOption.APPEND);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}