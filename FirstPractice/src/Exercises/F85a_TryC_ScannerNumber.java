package Exercises;

            /* 85.a Feladat (saját megoldás)
            Készítsetek egy metódust (getNumberFromConsole()), amely beolvas egy számot
            a konzolról, a nextInt() metódus segítségével. Próbáljátok ki milyen exception
            érkezik, ha futtatáskor szám helyett valami szöveget írtok. Ha megvan az
            exception neve, akkor írjatok rá egy try-catch blokkot amely-ben elkapjátok ezt
            az exceptiont és kiírjátok a konzolra az alábbi üzenetet: “You added a string,
            only number please!” */

import java.util.InputMismatchException;
import java.util.Scanner;

public class F85a_TryC_ScannerNumber {
    public static void main(String[] args) {
        System.out.println(getNumberFromConsole("Give me a number:"));
    }

    public static int getNumberFromConsole(String question) {
        int scanNumber = 0;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println(question);
            scanNumber = scan.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("You added a string, only number please!");
        }
        return scanNumber;
    }
}
