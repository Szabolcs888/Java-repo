package JavaCore.task06;

/*
6.	Hotel nyilvántartás. A nyilvántartás képes a vendég adatokat beolvasni és letárolni,
 majd megjeleníteni őket. Kötelezően tárolja milyen névre szólt a foglalás, az érkezés
  és a távozás időpontját valamint, hogy hány főre foglaltak szállást. Opcionálisan pedig
   lehessen letárolni a foglaláshoz tartozó telefonszámot. Legyen limitálva, hogy hány
    foglalást tud kezelni a program.
a.	Hozz létre egy Booking osztályt, amely tartalmazza a foglalás adatait. Írj metódusokat
az osztály változók értékeinek megadására illetve lekérdezésére. Ezen felül hasznos lehet
 egy toString metódus a letárolt adatainak a megjelenítésére.

 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Booking> bookingsList = new ArrayList<>();
        Map<Integer, Booking> bookingMap = new HashMap<>();

    //  Booking a = new Booking();

        for (int i = 0; i < 2 ; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your name");
            String name = sc.nextLine();
            System.out.println("Please enter the checkInDate");
            String checkInDate = sc.nextLine();
            System.out.println("Please enter the checkOutDate");
            String checkOutDate = sc.nextLine();

            int numberOfGuests = 0;
            do {
                System.out.println("Please enter numberOfGuests");
                numberOfGuests = sc.nextInt();
            } while (numberOfGuests > 5);

            System.out.println("Please enter your phone number");
            int phone = sc.nextInt();

            Booking user = new Booking(name, checkInDate, checkOutDate, numberOfGuests);
            bookingsList.add(user);
            bookingMap.put(i, user);

            user.setPhoneNumber(phone);

          System.out.println("Name: " + user.getName());
          System.out.println("Phone number: " + user.getPhoneNumber());
          System.out.println("Check in date: " + user.getCheckInDate());
          System.out.println("Check out date:  " + user.getCheckOutDate());
          System.out.println("Name: Number of guests: " + user.getNumberOfGuests());
        }
        System.out.println(bookingsList);
        for (Map.Entry mapElement : bookingMap.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }
    }
}
