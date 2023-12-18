package Exercises;

import java.util.Scanner;

        /* 18. Feladat (saját megoldás)
        Készítsetek programot, amely a program indításakor bekér két számot,
        valamint egy operátort. Majd írja ki konzolra a végeredményt.
        A számológép tudjon összeadni, kivonni, szorozni, osztani és
        “pumpedelni”, ami a számok köbének szorzata. */

public class F64_Szamologep_ujraMegcsinalni {
    public static void main(String[] args) {

        float num1 = getNumber1FromUser();
        float num2 = getNumber2FromUser();
        String operator = getOperatorFromUser();
        float result = getCalculationResult(operator, num1, num2);
        System.out.println(num1 + operator + num2);
        showResultToTheUser(result);

       /* System.out.println(num1);
        System.out.println(num2);
        System.out.println(operator); */


    }

    public static float getNumber1FromUser() {
        System.out.println();
        System.out.println("Kérem az első számot:");
        Scanner scan = new Scanner(System.in);
        float localNum1 = scan.nextFloat();

        return localNum1;
    }

    public static float getNumber2FromUser() {
        System.out.println();
        System.out.println("Kérem a második számot:");
        Scanner scan = new Scanner(System.in);
        float localNum2 = scan.nextFloat();

        return localNum2;
    }

    public static String getOperatorFromUser() {
        System.out.println();
        System.out.println("Kérek egy operátort! (+, -, *, /, p(pumped))");
        Scanner scan = new Scanner(System.in);
        String localOperator = scan.next();

        return localOperator;
    }

    public static float getCalculationResult(String userOperator, float userNum1, float userNum2) {

        float result = 0;
        if (userOperator.equals("+")) {
            result = userNum1 + userNum2;
            // System.out.println(userNum1 + " + " + userNum2 + " = " + result);
        } else if (userOperator.equals("-")) {
            result = userNum1 - userNum2;
            //   System.out.println(userNum1 + " - " + userNum2 + " = " + result);
        } else if (userOperator.equals("*")) {
            result = userNum1 * userNum2;
            //  System.out.println(userNum1 + " * " + userNum2 + " = " + result);
        } else if (userOperator.equals("/")) {
            result = userNum1 / userNum2;
            //  System.out.println(userNum1 + " / " + userNum2 + " = " + result);
        } else if ((userOperator.equals("pumped")) || (userOperator.equals("p"))) {
            result = userNum1 * userNum1 * userNum1 * userNum2 * userNum2 * userNum2;
            //  System.out.println(userNum1 + " pumped " + userNum2 + " = " + result);
        }
        return result;
    }

    public static void showResultToTheUser(float result) {
        System.out.println("Az eredmény: " + result);
    }
}




