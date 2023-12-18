package Exercises;
        /* 9.a Feladat (Órai)
        Írjunk programot, amely a számok négyzeteit írja ki 0-tól 20-ig.
        Készítsük el while-al. */

public class F09a_Negyzetreemeles_While {
    public static void main(String[] args) {

        int number = 0;

        while (number <= 20) {
            System.out.println("number: " + number + " square: " + number * number);
            number++;
        }
    }
}
