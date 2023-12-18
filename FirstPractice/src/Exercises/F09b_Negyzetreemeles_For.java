package Exercises;
        /* 9.b Feladat (Órai)
        Írjunk programot, amely a számok négyzeteit írja ki 0-tól 20-ig.
        Készítsük el for-al. */

public class F09b_Negyzetreemeles_For {
    public static void main(String[] args) {

        for (int number = 0; number <= 20; number++)
            System.out.println("number: " + number + " square: " + number * number);
    }
}
