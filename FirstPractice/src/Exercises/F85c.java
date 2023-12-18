package Exercises;

/*
85)	Készítsetek egy metódust (getNumberFromConsole()), amely beolvas egy számot a konzolról,
a nextInt() metódus segítségével. Próbáljátok ki milyen exception érkezik, ha futtatáskor
 szám helyett valami szöveget írtuk. Ha megvan az exception neve,
a)	akkor írjatok rá egy try-catch blokkot amely-ben elkapjátok ezt az exceptiont és kiírjátok a konzolra
 az alábbi üzenetet: “You added a string, only number please!”
b)	Dobjátok tovább a metódusban keletkező lehetséges exceptiont, és a hívás helyén a main-ben kapjátok el
c)	(extra) mindaddig kérjen be a felhasználótól adatot, amíg számot nem ad

 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class F85c {
    public static void main(String[] args) {

        int result = 0;
        boolean nextRoundNeeded = true;
        while (nextRoundNeeded) {

            try {
                result = getNumberFromConsole();
                nextRoundNeeded = false;
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Számot adj meg, kérlek!");
                nextRoundNeeded =true;
            }
        }
        System.out.println(result);
    }


    public static int getNumberFromConsole() throws InputMismatchException {
        Scanner scanNum = new Scanner(System.in);
        int userCountScan = 0;
        userCountScan = scanNum.nextInt();
        return userCountScan;
    }
}

