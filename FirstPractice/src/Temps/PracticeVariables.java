package Temps;

public class PracticeVariables {
    public static void main(String[] args) { // a speciális main metódus, a program futáskori elindulási pontja (main-re kiírja az egész utasítást)

        // változó létrehozása
        int day;                               // változó létrehozása értékadás nélkül (ez a változó deklarálása)
        int year = 2023;                       // változó létrehozása kezdőérték megadásával
        byte needEggs = 8;
        short actualMoney = 32700;
        long totalLotteryAmount = 1234567891;

        // egysoros komment
        /* többsoros komment
        egy újabb sor, és komment vége */

        // konzolra való kiíratás print metódussal (sout-ra kiírja az egész utasítást)
        System.out.println("Hello Progmatic"); // A println új sorba teszi a következő utasítást
        System.out.print("új sor "); //

        System.out.println();
        System.out.println(); // új üres sor

        System.out.println(year);
        year = 2024;                           // változó értékének felülírása
        System.out.println(year);

        System.out.println("A year változó tartalma: " + year); // kiegészítésre került egy stringgel

        System.out.println();

        // példa String típusú változóra
        String name;                           // String típusú változó létrehozása érték nélkül
        String actualDay = "Saturday";         // String típusú változó létrehozása értékadással

        System.out.println(actualDay);
        System.out.println("Today is " + actualDay);

        name = "Szabolcs";                     // változó felülírása (ez esetben érték adása)
        System.out.println(name);

        System.out.println();

        // példa char típusú változóra (csak egy karakter lehet)
        char classID;                          // char típusú változó értékadás nélkül
        char answer = 'C';                     // char típusú változó értékadással
        System.out.println(answer);

        System.out.println();

        // példa boolean típusú változóra (csak true vagy false értéke lehet)
        boolean nitroExist;                    // boolean típusú változó értékadás nélkül
        boolean allWheelDrive = false;         // boolean típusú változó értékadással (logikai értékkel)
        boolean isYearEqualNeedEggs = year == needEggs; // boolean típusú változó összehasonlítással
        boolean trueOrFalse = (year> 200) && (needEggs < 24);


        nitroExist = true;                     // változó értékadása true logikai értékkel
        System.out.println(nitroExist);
        System.out.println(allWheelDrive);
        System.out.println(isYearEqualNeedEggs);
        System.out.println(trueOrFalse);

        System.out.println();

        // nem egész számok tárolása float és double típusú változóval
        float average = 7.88888767657524f;     // a számsor végén az f jelzi, hogy float típusú
        double averagePrecise = 8.43453676547455227788341889001340006889; // a double hosszabb (ezáltal pontosabb) számok tárolását teszi lehetővé

        System.out.println(averagePrecise);

        System.out.println(String.format("%.3f",averagePrecise)); // tizedesek kiírásának hossza. Figyelem! Ettől a szám Stringgé válik, ez az utasítás csak kiíratásra való
    }
}

