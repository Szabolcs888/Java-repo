package Exercises;

            /* 84.b Feladat (Órai) (saját megoldás)
            Készítsünk programot, amely kiírja a “There are no program arguments.”, ha nem talál
            hozzáadott program argumenteket. Készítsünk egy metódust (printArgConsole()), amelyik
            kiírja az első paraméter tartalmát a konzolra. Dobjuk tovább a lehetséges exceptiont
            és kapjuk el azt a main metódusban! */

public class F84b_TryC_MetodusonKivul {
    public static void main(String[] args) {

        try {
            printArgConsole(args);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There are no program arguments.");
        }
    }

    private static void printArgConsole(String[] args) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i < 5; i++) {
            System.out.println(args[i]);
        }
    }
}