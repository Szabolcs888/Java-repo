package Exercises;

            /* 85.b Feladat (saját megoldás)
            Készítsetek egy metódust (getNumberFromConsole()), amely beolvas egy számot
            a konzolról, a nextInt() metódus segítségével. Próbáljátok ki milyen exception
            érkezik, ha futtatáskor szám helyett valami szöveget írtok. Ha megvan az
            exception neve, akkor írjatok rá egy try-catch blokkot amely-ben elkapjátok ezt
            az exceptiont és kiírjátok a konzolra az alábbi üzenetet: “You added a string,
            only number please!”

            Dobjátok tovább a metódusban keletkező lehetséges exceptiont, és a hívás helyén
            a main-ben kapjátok el! */

import java.util.InputMismatchException;
import java.util.Scanner;

public class F85b_TryC_ScannerNumber_MetodusonKivul {
    public static void main(String[] args) {

        try {
            System.out.println(getNumberFromConsole("Give me a number:"));
        } catch (InputMismatchException e) {
            System.out.println("You added a string, only number please!");
        }
    }

    public static int getNumberFromConsole(String question) throws InputMismatchException {
        int scanNumber = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println(question);
        scanNumber = scan.nextInt();
        return scanNumber;
    }
}
