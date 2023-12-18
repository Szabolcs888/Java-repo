package Exercises;

            /* 54.c Feladat (Zsolt megoldása)
            Írjatok egy telefonkönyv programot, amely a konzolról a felhasználó
            által megadott mennyiségű nevekhez és az azokhoz tartozó
            telefonszámokat lementi egy HashMap-ben. Névazonosság esetén ne adja
            hozzá, hanem kérje be újra és ugyanezt tegye számazonosság esetén is */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F54c_Map_Phonebook_FromUser_NincsFeluliras2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        System.out.println("How many names do you want to save?");
        int phoneBookSize = scanner2.nextInt();

        do {
            System.out.println("DEBUG:" + phoneBook);
            System.out.println("Add the name: ");
            String name = scanner.nextLine();
            System.out.println("Add the phone number: ");
            String phonenumber = scanner.nextLine();
            if (phoneBook.containsKey(name))
                System.out.println("Person already exist in your phonebook. Phone number updated.");
            else
                System.out.println("Person saved.");

            if (phoneBook.containsValue(phonenumber))
                System.out.println("This number is for someone else.");
            else
                phoneBook.put(name, phonenumber);
        } while (phoneBook.size() != phoneBookSize);
        System.out.println(phoneBook);
    }
}

