package Exercises;

        /* 10.a Feladat
        Készítsetek egy programot, amely a számok szorzatát írja ki 1-tól 10-ig
        (magukat a számokat nem, csak az összes szám szorzatát).
        Készítsük el while-al. */

public class F10a_Szorzat_While {
    public static void main(String[] args) {

        int number = 1;
        int counter = 1;

        while (counter <= 10) {
            number = (counter * number);
         // System.out.println(number); // ezzel a kiíratással a folyamat is látszik
            counter++;
        }
        System.out.println(number);


        // Másik megoldás
    /*
        int number = 1;
        int result = number;
        while (number <= 10) {
            result = result * number;   // result *= number
            number++;
        }
        System.out.println("Result: " + result);
     */

    }
}
