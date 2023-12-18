package Exercises;

import java.util.Scanner;

        /* 12. feladat (Otthoni haladó) (Tamás megoldása)
        Írjunk egy sörösüvegek visszaváltó programot.
        A zöld üvegeket 10 forintért, a feketéket pedig 30-ért.
        A program minden üvegnél kérdezze meg, hogy milyen színű,
        illetve jegyezze meg, hogy mennyivel nőtt a beváltott üvegek értékének összege.
        Ha a felhasználó az X karaktert adja meg, úgy a program írja ki,
        hogy mennyi pénzt ad a beváltott üvegekért. */

public class F12_Uvegvisszavalto2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String currentColor = "";
        while (true) {
            System.out.println("Milyen színű az üveg?");
            currentColor = sc.nextLine();
            if (currentColor.equals("z")) {
                sum = sum + 10;
            } else if (currentColor.equals("f")) {
                sum = sum + 30;
            } else if (currentColor.equals("x")) {
                break;
            } else {
                System.out.println("ismeretlen szín");
            }
        }
        System.out.println("Összeg: " + sum);
    }
}



