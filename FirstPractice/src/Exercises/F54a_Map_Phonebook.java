package Exercises;

            /* 54.a Feladat (saját megoldás)
            Írjatok egy telefonkönyv programot, amely a konzolról a felhasználó
            által megadott és beolvasott 5 darab név-hez a hozzá tartozó
            telefonszámot lementi egy HashMap-ben. */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F54a_Map_Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();
        String name = "";
        String phoneNumber = "";
        for (int i = 1; i < 6; i++) {
            System.out.println();
            System.out.println("Kérlek, add meg a(z) " + i + ". nevet:");
            name = scan.nextLine();
            System.out.println("A hozzá tartozó telefonszám:");
            phoneNumber = scan.nextLine();
            phoneBook.put(name, phoneNumber);
        }
        System.out.println();
        System.out.println("A telefonkönyv tartalma:");
        for (Map.Entry mapElement : phoneBook.entrySet()) {
            System.out.println(mapElement.getKey() + ": " + mapElement.getValue());
        }
    }
}
