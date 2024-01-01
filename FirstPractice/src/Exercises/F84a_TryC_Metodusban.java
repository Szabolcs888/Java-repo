package Exercises;

            /* 84.a Feladat (Órai) (saját megoldás)
            Készítsünk programot, amely kiírja a “There are no program arguments.”, ha nem talál
            hozzáadott program argumenteket. Készítsünk egy metódust (printArgConsole()), amelyik
            kiírja az első paraméter tartalmát a konzolra. Kapjuk el a lehetséges keletkező
            exceptiont a metódusban. */

public class F84a_TryC_Metodusban {
    public static void main(String[] args) {

        printArgConsole(args);
    }

    private static void printArgConsole(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(args[i]);
            }
        } catch (Exception e) {
            System.out.println("There are no program arguments.");
        }
    }
}
