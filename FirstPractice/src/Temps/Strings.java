package Temps;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {


        // isempty és ami kimaradt, megnézni!!!!!


        //----------String kisbetűsből nagybetűssé alakítása és fordítva----------

        // már deklaráslásnál megtörténik az átalakítás
        String userData = " Hello User!2345 ".toUpperCase(); // nagybetűssé alakítva tároljuk el a Stringet
        // String userData = "Hello".toLowerCase(); // kisbetűssé alakítva tároljuk el a Stringet
        System.out.println(userData);

        System.out.println();

        //  Scannerrel bekért adatok átalakítása
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérlek, írj valamit: ");
        // String userData2 = scan.next();
        String userData2 = scan.next().toUpperCase();  // a felhasználó által beírt adatot nagybetűssé alakítva tároljuk le
        // String userData2 = scan.next().toLowerCase();   // a felhasználó által beírt adatot kisbetűssé alakítva tároljuk le
        System.out.println("stored data: " + userData2);

        // összehasonlításnál figyelmen kívül hagyja a kis és nagybetűket:
        // (event.toLowerCase().equals("x"));


        System.out.println();

        //----------String x-edik karakterének tartalmának lekérdezése----------

        System.out.println(userData.charAt(7));


        System.out.println();

        //----------String hosszának lekérdezése----------

        System.out.println(userData.length());


        System.out.println();

        //----------Szóközök levágása a String elejéről és végéről----------

        System.out.println(userData.trim());


        System.out.println();

        //----------toCharArray(): visszaadja a karakterláncot char[] formában----------

        char[] userDataCharArray = userData.toCharArray();

        System.out.println(userDataCharArray);

        for (char item : userDataCharArray)  // kiíratás for-each-vel
            System.out.print(item);

        System.out.println();

        System.out.println(userDataCharArray[3]); // a 4-ik karakter lekérdezése


        System.out.println();

        //----------String összehasonlítása másik Stringgel----------

        /*
        (valtozonev.equals("szoveg"))

        (userData2.equals("ASE"))

        nem egyenlő:
        (!(userData2.equals("HI")))
        (!(userData2 = scanner.next()).equals("HI"))  (ugyanaz, csak a scanner értékének behívásával)

        */

        System.out.println(userData2.equals("HI"));


        System.out.println();

        //----------substring(startIndex, endIndex): visszaad egy másik String-et,
        //          ami a startIndex és endIndex közötti részt tartalmazza (a startIndex
        //          helyen állót tartalmazni fogja, az endIndex helyen lévőt nem)----------

        System.out.println(userData.substring(3, 8));


        System.out.println();

        //----------startsWith(expression): megmondja, hogy a String a megadott kifejezéssel kezdődik-e----------

        System.out.println(userData.startsWith("t"));


        System.out.println();

        //----------endWith(expression): megmondja, hogy a String a megadott kifejezéssel végződik-e----------

        System.out.println(userData.endsWith(" "));


        System.out.println();

        //----------contains(expression): megmondja, hogy a String a megadott kifejezést tartalmazza-e----------

        System.out.println(userData.contains("Z"));


        System.out.println();

        //----------replace(target, replacement): kicseréli az összes előfordulását a target argumentumnak a replacement-re----------

        System.out.println(userData.replace("L", "K"));


        System.out.println();

        //----------split(regex): darabokra vágja a karakterláncot a megadott kifejezés szerint (ez nem világos)----------

        System.out.println(userData.split("H,E,L,L,O"));


        System.out.println();

        //----------String konvertálása számmá, floattá----------

        String stringNumber = "23";

        int number = Integer.parseInt(stringNumber);
        float number2 = Float.parseFloat(stringNumber);

        // vagy, ha scannerből olvasunk be
        // int number = Integer.parseInt(scanner.nextLine());


        System.out.println(number + 4);

        System.out.println();

        //----------Szám konvertálása Stringgé----------

        int num = 1;
        String convNum = num + "";

        System.out.println(3 + convNum); // a num értéke már Stringként jelenik meg

    }
}