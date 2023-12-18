package Exercises;

import java.util.Scanner;

        /* 11.b Feladat2 (bővített)
        Készítsetek egy összegző programot,
        ami egész számokat olvas be a felhasználótól mindaddig,
        amíg az az x karaktert nem adja meg szám helyett.
        Amikor ez megtörténik, írjuk ki a megadott számok összegét.
        Készítsük el for-al */

public class F11b_Osszeadas2_For {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int c = 0;

        for (String currentInput; (!(currentInput = scanner.next()).equals("x")); ) {
            int currentInputAsInt = Integer.parseInt(currentInput);
            sum = sum + currentInputAsInt;
            c++;
        }

        System.out.println("Az összeg: " + sum);
        System.out.println("ciklusszám: " + c);
    }
}
