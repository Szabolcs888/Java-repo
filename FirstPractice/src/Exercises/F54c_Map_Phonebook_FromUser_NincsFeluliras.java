package Exercises;

            /* 54.c Feladat (saját megoldás)
            Írjatok egy telefonkönyv programot, amely a konzolról a felhasználó
            által megadott mennyiségű nevekhez és az azokhoz tartozó
            telefonszámokat lementi egy HashMap-ben. Névazonosság esetén ne adja
            hozzá, hanem kérje be újra és ugyanezt tegye számazonosság esetén is */

            /* Zsolt megoldása rövidebb mert a ciklus feltételeként a phonebook
            méretét hasonlította össze a bekért számmal, így amíg az nem lesz
            egyenlő, addig fut a ciklus. A megoldást lásd az 54c/2-ben. */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F54c_Map_Phonebook_FromUser_NincsFeluliras {
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
            do {
                System.out.println();
                System.out.println("Kérlek, add meg a(z) " + i + ". nevet:");
                name = scan.nextLine();
                if (phoneBook.containsKey(name)) {
                    System.out.println("Ez a név már szerepel egyszer. Új nevet kérek!");
                }
            } while (phoneBook.containsKey(name));
            do {
                System.out.println();
                System.out.println("A hozzá tartozó telefonszám:");
                phoneNumber = scan.nextLine();
                if (phoneBook.containsValue(phoneNumber)) {
                    System.out.println("Ez a szám már szerepel egyszer. Új számot kérek!");
                }
            } while (phoneBook.containsValue(phoneNumber));
            phoneBook.put(name, phoneNumber);
        }
        System.out.println();
        System.out.println("A telefonkönyv tartalma:");
        for (Map.Entry mapElement : phoneBook.entrySet()) {
            System.out.println(mapElement.getKey() + ": " + mapElement.getValue());
        }
    }
}

