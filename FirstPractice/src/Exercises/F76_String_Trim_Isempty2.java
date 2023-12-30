package Exercises;

            /* 76. Feladat (Órai) (Zsolt megoldása)
            Készítsünk egy konzolról beolvasó metódust, amely a beírt szöveget Stringként
            beolvassa és eltávolítja a felesleges szóközöket az elejéről és végéről, majd
            visszaadja azt. Építsünk bele olyan logikát, hogy ha 0 hosszú a bevitt
            kifejezés, akkor írjon ki a konzolra hibaüzenetet. */

import java.util.Scanner;

public class F76_String_Trim_Isempty2 {
    public static void main(String[] args) {
        // String result = getTrimmedTextFromConsole();
        // System.out.println(result);

        System.out.println(getTrimmedTextFromConsole());
        //printTrimmedTextFromConsole();
    }

    public static String getTrimmedTextFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a string: ");

        String string = scanner.nextLine().trim();
        //if (string.length() == 0)  //ez is jó if feltétel
        String result = "";
        if (string.isEmpty())
            result = "You added nothing";
        else
            result = "Consolidated string-" + string + "-";

        // vagy
        /*
        String string = scanner.nextLine();
        String result = string.trim();
        System.out.println("Consolidated string-" + result+ "-");
        */
        return result;
    }

    public static void printTrimmedTextFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a string: ");

        String string = scanner.nextLine().trim();
        //if (string.length() == 0)  //ez is jó if feltétel
        if (string.isEmpty())
            System.out.println("You added nothing");
        else
            System.out.println("Consolidated string-" + string + "-");
    }
}
