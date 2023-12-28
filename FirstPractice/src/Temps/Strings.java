package Temps;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        String name = "Steve Jobs";

        System.out.println(name.length()); // String hosszának lekérdezése
        System.out.println(name.contains("ev"));   // megmondja, hogy a String a megadott kifejezést tartalmazza-e
        System.out.println(name.startsWith("St")); // megmondja, hogy a String a megadott kifejezéssel kezdődik-e
        System.out.println(name.endsWith("Jobs")); // megmondja, hogy a String a megadott kifejezéssel végződik-e
        System.out.println(name.indexOf("e"));     // az első előfordulása az adott karakter(ek)nek (vagyis, több karakterből is állhat a keresés)
        System.out.println(name.charAt(3));        // megkérdezzük, mi az adott indexen lévő karakter
        System.out.println(name.replace("e", "*")); // kicseréli a target argumentum összes előfordulását a replacement-re
        System.out.println(name.substring(2)); // az adott index-től kezdve kivágja a String-et
        System.out.println(name.substring(2, 4));   // az adott index-től az adott indexig kivágja a String-et (az endindex nem lesz az eredmény része)
        System.out.println(name.trim());           // a string elejéről és végéről eltávolításra kerülnek a szóközök
        System.out.println(name.isEmpty());        // megmondja, hogy a String tartalmaz-e karaktereket (nyilván egyetklen betű is true-t fog eredményezni)

        // a split darabokra vágja a karakterláncot a megadott kifejezés szerint
        String fruits = "Málna-Eper";
        System.out.println(fruits.split("-")[0]);         //"Málna-Eper"  --  ["Málna","Eper"]  // a []-be pedig a "feldarabolt" String kiírandó részének "indexszáma" írandó
        System.out.println(fruits.split("-")[1]);         //"Málna-Eper"  --  ["Málna","Eper"]


        // String kisbetűsből nagybetűssé alakítása és fordítva
        System.out.println(name.toUpperCase());    // a szöveg nagybetűssé alakítása
        System.out.println(name.toLowerCase());    // a szöveg kisbetűssé alakítása
        // már deklaráslásnál megtörténik az átalakítás
        String userData = " Hello User!2345 ".toUpperCase(); // nagybetűssé alakítva tároljuk el a Stringet
        // String userData = "Hello".toLowerCase(); // kisbetűssé alakítva tároljuk el a Stringet
        System.out.println(userData);

        String a = "kocSi";
        String b = "KOcSi";
        System.out.println(a.equalsIgnoreCase(b)); // figyelmen kívül hagyja a kis és nagybetűt, de csak összehasonlításnál használható, mert boolean értéket ad vissza


        // Scannerrel bekért adatok átalakítása
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérlek, írj valamit: ");
        // String userData2 = scan.next();
        String userData2 = scan.next().toUpperCase();  // a felhasználó által beírt adatot nagybetűssé alakítva tároljuk le
        // String userData2 = scan.next().toLowerCase(); // a felhasználó által beírt adatot kisbetűssé alakítva tároljuk le
        System.out.println("stored data: " + userData2);

        // toCharArray(): visszaadja a karakterláncot char[] formában
        // (vagyis char tömbbe kerül a string, amelynek minden egyes betűje egy elem
        char[] userDataCharArray = name.toCharArray();
        System.out.println(userDataCharArray);
        for (Character item : userDataCharArray)
            System.out.println(item);


        // String összehasonlítása másik Stringgel

        // Soha ne az == operátort használjuk, mert false eredményt mutathat akkor is, ha egyezik a két String tartalma (abban az esetben, ha az egyik két Stringből lett létrehozva/módosítva)!
        // Mindíg az equalst használjuk!

        /*
        (userData2.equals("ASE"))
        (userData2.equalsIgnoreCase("X")); // nem számít, hogy kis vagy nagy betű

        nem egyenlő:
        (!(userData2.equals("HI")))
        (!(userData2 = scanner.next()).equals("HI"))  (ugyanaz, csak a scanner értékének behívásával)
        */


        // String konvertálása számmá, floattá

        String stringNumber = "23";

        int number = Integer.parseInt(stringNumber);
        float number2 = Float.parseFloat(stringNumber);

        // vagy, ha scannerből olvasunk be
        // int number = Integer.parseInt(scanner.nextLine());

        System.out.println(number + 4);

        // szám konvertálása Stringgé
        int num = 1;
        String convNum = num + "";

        System.out.println(3 + convNum); // a num értéke már Stringként jelenik meg
    }
}