package Exercises;

        /* 10.b Feladat
        Készítsetek egy programot, amely a számok szorzatát írja ki 1-tól 10-ig.
        (magukat a számokat nem, csak az összes szám szorzatát)
        Készítsük el for-val. */

public class F10b_Szorzat_For {
    public static void main(String[] args) {

        int result = 1;
        for (int number = 1; number <= 10; number++) {
            result = result * number;

        }
        System.out.println(result);
    }
}
