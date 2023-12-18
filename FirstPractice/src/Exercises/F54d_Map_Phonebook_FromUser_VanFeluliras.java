package Exercises;

            /* 54.d Feladat (saját megoldás)
            Írjatok egy telefonkönyv programot, amely a konzolról a felhasználó
            által megadott mennyiségű nevekhez és az azokhoz tartozó
            telefonszámokat lementi egy HashMap-ben. Névazonosság esetén frissítse
            a meglévőt és erről tájékoztassa is a felhasználót. */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F54d_Map_Phonebook_FromUser_VanFeluliras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        int counter = 0;
        System.out.println("Mennyi telefonszámot szeretnél elmenteni?");
        counter = scan2.nextInt();

        String name = "";
        String phoneNumber = "";
        for (int i = 1; i < counter + 1; i++) {
            System.out.println();
            System.out.println("Kérlek, add meg a(z) " + i + ". nevet:");
            name = scan.nextLine();
            System.out.println("A hozzá tartozó telefonszám:");
            phoneNumber = scan.nextLine();
            if (phoneBook.containsKey(name)) {
                System.out.println(name + " telefonszáma frissült!");
                i--;
            }
            phoneBook.put(name, phoneNumber);
        }
        System.out.println();
        System.out.println("A telefonkönyv tartalma:");
        for (Map.Entry mapElement : phoneBook.entrySet()) {
            System.out.println(mapElement.getKey() + ": " + mapElement.getValue());
        }
    }
}
