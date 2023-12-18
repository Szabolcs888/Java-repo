package Exercises;

import java.util.Scanner;

        // Az egyik oktató készítette, de hibás (az oktatóiban ez a 11c feladat)!!

        /* 11.a Feladat3 (bővített)
        Készítsetek egy összegző programot,
        ami egész számokat olvas be a felhasználótól mindaddig,
        amíg az az x karaktert nem adja meg szám helyett.
        Amikor ez megtörténik, írjuk ki a megadott számok összegét.
        Készítsük el while-al */

public class F11a_OsszeadasBovitett_While2 {
    public static void main(String[] args) {

        Scanner userScan = new Scanner(System.in);
        int result = 0;
        int c = 0;
        String currentInput = userScan.next();
        while (!(currentInput.equals("x"))) {
            int curInpAsInteger = Integer.parseInt(currentInput);
            result = result + curInpAsInteger;
            c++;
        }
        System.out.println("Az összeg: " + result);
        System.out.println("Ennyi számot adtál össze: " + c);
    }
}
