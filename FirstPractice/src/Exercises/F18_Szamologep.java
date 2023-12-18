package Exercises;

import java.util.Scanner;

        /* 18. Feladat (saját megoldás)
        Készítsetek programot, amely a program indításakor bekér két számot,
        valamint egy operátort. Majd írja ki konzolra a végeredményt.
        A számológép tudjon összeadni, kivonni, szorozni, osztani és
        “pumpedelni”, ami a számok köbének szorzata. */

public class F18_Szamologep {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Kérem az első számot:");
        Scanner scan = new Scanner(System.in); // a "Scanner scan = new Scanner(System.in)" -t  elég egyszer meghívni!
        float userNum1 = scan.nextFloat();

        System.out.println("Kérem a második számot:");
        float userNum2 = scan.nextFloat();

        System.out.println("Kérek egy operátort! (+, -, *, /, p(pumped))");
        String userOperator = scan.next();

        float result = 0;
        if (userOperator.equals("+")) {
            result = userNum1 + userNum2;
            System.out.println(userNum1 + " + " + userNum2 + " = " + result);
        } else if (userOperator.equals("-")) {
            result = userNum1 - userNum2;
            System.out.println(userNum1 + " - " + userNum2 + " = " + result);
        } else if (userOperator.equals("*")) {
            result = userNum1 * userNum2;
            System.out.println(userNum1 + " * " + userNum2 + " = " + result);
        } else if (userOperator.equals("/")) {
            result = userNum1 / userNum2;
            System.out.println(userNum1 + " / " + userNum2 + " = " + result);
        } else if ((userOperator.equals("pumped")) || (userOperator.equals("p"))) {
            result = userNum1 * userNum1 * userNum1 * userNum2 * userNum2 * userNum2;
            System.out.println(userNum1 + " pumped " + userNum2 + " = " + result);
        }
    }
}

