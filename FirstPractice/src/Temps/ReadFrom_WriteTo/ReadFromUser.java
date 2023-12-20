package Temps.ReadFrom_WriteTo;

import java.util.Scanner;

public class ReadFromUser {
    public static void main(String[] args) {

        //----------Read from user as STRING----------
        System.out.println("Program started and wait for input as STRING: "); // A System.out.println utasításban az out az esetek legnagyobb részében a képernyő terminál ablakára utaló parancs

        Scanner scan = new Scanner(System.in);
        String userDataStr = scan.next();
        // Fontos! Ha szóközzel olvasunk be egy elemet és pl. listába mentjük, akkor két elemnek veszi, ha next-et használunk (scan.next(); ), ha nextLine-t, akkor egynek!.

        // String userDataStr = scanString.next().toUpperCase(); //már scanneléskor átalakítja nagybetűssé a beolvasott Stringet

        // Scanner scanString = new Scanner(System.in); // Utasítás, hogy a felhasználó tudjon a consol-val interaktálni (nem muszáj scan-nek hívni!). Maga a Scanner.in azt jelenti, hogy a bemenet billenytyűzetről történik (a Scanner a java.util.Scanner osztályból van).
        // String userDataStr = scanString.next();      // Letároljuk a userDataStr változóba a felhasználó által bevitt adatot Stringként

        System.out.println("stored data: " + userDataStr);


        // (item.equalsIgnoreCase("X")) // figyelmen kívül hagyja a kis és nagybetűt, de csak összehasonlításnál használható, mert boolean értéket ad vissza


        System.out.println();

        //----------Read from user as INT----------
        System.out.println("Program started and wait for input as INT: ");

        Scanner scanInt = new Scanner(System.in);
        int userDataInt = scanInt.nextInt();         // Letároljuk a userDataInt változóba a felhasználó által bevitt adatot integer-ként

        System.out.println("stored data: " + userDataInt);

        // Másik változat
        /*
        Scanner scanInt = new Scanner(System.in);
        int userDataInt = Integer.parseInt(scanInt.nextLine());

        System.out.println(userDataInt + 8);
        */


        System.out.println();

        //----------Read from user as BOOLEAN----------
        System.out.println("Program started and wait for input as BOOLEAN: ");

        Scanner scanBoolean = new Scanner(System.in);
        boolean userDataBln = scanBoolean.nextBoolean(); // Letároljuk a userDataBln változóba a felhasználó által bevitt adatot boolean-ként

        System.out.println("stored data: " + userDataBln);


        //----------Megoldás egy Scanner használatára abban az esetben is, ha int után Stringet kérünk be----------
        System.out.println("számot kérek:");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("szöveget kérek:");
        String string = scan.nextLine();




//---------------------------------------------------------------Methods----------------------------------------------------------------------------------

        String userWrites = readFromUser();
    }
    public static String readFromUser() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}


