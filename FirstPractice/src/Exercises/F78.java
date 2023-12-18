package Exercises;

import java.util.Scanner;

public class F78 {
    public static void main(String[] args) {

        String longText = getInputFromUser();
        String searchText = getInputFromUser();
        boolean result = isStringPresent(longText, searchText);
        sout(result);
    }

    // félbe lett hagyva a kétszeri scannelés különböző szöveg kiírásának a megoldása
    public static String getInputFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérem a szöveget:");
      //  Scanner scan2 = new Scanner(System.in);
      //  System.out.println("Kérem a keresendő kifejezést:");
        return scan.nextLine();

    }

    public static boolean isStringPresent(String text, String search) {
        return text.startsWith(search);
    }

    public static void sout(boolean result) {
        if (result)
            System.out.println("Talált!");
        else
            System.out.println("Nem talált!");

    }


}
