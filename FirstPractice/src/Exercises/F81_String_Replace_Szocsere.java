package Exercises;

            /* 81. Feladat (Órai) (saját megoldás)
            Írjunk programot, amely a beolvasott szövegben
            lecseréli a “legrosszabb” szót, a “legjobb”-ra. */

public class F81_String_Replace_Szocsere {
    public static void main(String[] args) {
        String text = "Ma van a legrosszabb napom.";
        wordChange(text);
    }

    private static void wordChange(String text) {
        text = text.replace("legrosszabb", "legjobb");
        System.out.println(text);
    }
}
