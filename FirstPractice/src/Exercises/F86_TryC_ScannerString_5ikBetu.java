package Exercises;

            /* 86. Feladat (saját megoldás)
            Kérjünk el egy stringet a felhasználótól és írjuk ki a
            5. karakterét. Kezeljük le a keletkező exceptiont. */

import java.util.Scanner;

public class F86_TryC_ScannerString_5ikBetu {
    public static void main(String[] args) {

      String userText =  readFromUser("Kérek egy legalább ötbetűs szót:");
      print(userText);
    }

    public static String readFromUser(String question) {
        Scanner scan = new Scanner(System.in);
        System.out.println(question);
        return scan.nextLine();
    }

    private static void print(String userText) {
        try {
            System.out.println(userText.charAt(4));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Ez nincs meg 5 karakter!");
        }
    }
}
