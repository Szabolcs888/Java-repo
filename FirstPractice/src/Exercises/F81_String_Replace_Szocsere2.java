package Exercises;

            /* 81. Feladat (Órai) (Zsolt megoldása)
            Írjunk programot, amely a beolvasott szövegben
            lecseréli a “legrosszabb” szót, a “legjobb”-ra. */

import java.util.Scanner;

public class F81_String_Replace_Szocsere2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a text: ");
        replaceTextAndWriteToConsole(scanner.nextLine());
    }

    public static void replaceTextAndWriteToConsole(String text){
        text =  text.replace("legrosszabb","legjobb");
        System.out.println(text);
    }
}
