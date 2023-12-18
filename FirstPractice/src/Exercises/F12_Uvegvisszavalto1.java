package Exercises;

import java.util.Scanner;

        /* 12. feladat (Otthoni haladó) (saját megoldás)
        Írjunk egy sörösüvegek visszaváltó programot.
        A zöld üvegeket 10 forintért, a feketéket pedig 30-ért.
        A program minden üvegnél kérdezze meg, hogy milyen színű,
        illetve jegyezze meg, hogy mennyivel nőtt a beváltott üvegek értékének összege.
        Ha a felhasználó az X karaktert adja meg, úgy a program írja ki,
        hogy mennyi pénzt ad a beváltott üvegekért. */

public class F12_Uvegvisszavalto1 {
    public static void main(String[] args) {

        Scanner scanString = new Scanner(System.in);

        System.out.println();
        System.out.println("Üdvözöllek, én egy üvegvisszaváltógép vagyok.");
        System.out.println("Kérlek, add meg az üveg színét (zöld vagy fekete: z/f)! Az összegzésért nyomd meg az x-et. ");

        String userBottle = "";

        int sum = 0;
        while (!(userBottle.equals("x"))) {
            System.out.println();
            System.out.println("Milyen színű az üveg?");
            userBottle = scanString.next();
            if (userBottle.equals("z")) {
                sum = sum + 10;
                System.out.println("Ez egy zöld üveg és 10ft-ot ér. Eddig összesen " + sum + "ft.");
            } else if (userBottle.equals("f")) {
                sum = sum + 30;
                System.out.println("Ez egy fekete üveg és 30ft-ot ér. Eddig összesen " + sum + "ft.");
            } else {
                System.out.println("Nem ismerem fel a színt, kérlek zöldet vagy feketét válassz!");
            }
        }

        System.out.println(sum + " ft-ot adok az üvegekért.");
    }
}

