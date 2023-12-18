package Temps;

public class PracticeOperators {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 7;

        System.out.println("---- Logical operators (== , !=)----");
        // == és != logikai operátor

        boolean result;
        result = number1 == number2;            // == esetén ha két értéket összehasonlítunk, akkor az eredmény true vagy false
        System.out.println(result);

        // a == összehasonlítja, hogy a két érték azonos-e, a != pedig ennek az ellenkezője
        System.out.println(number1 == number2); // nem muszáj új változót bevezetni és annak értékét kiíraítni, elegendő a print elembe beírni a két változó összehasonlítását
        System.out.println(number1 != number2);

        /*
        Stringet így lehet összehasonlítani egy másik Stringgel:
        (currentInput.equals("x"))   (valtozonev.equals("szoveg"))

        nem egyenlő:
        (!(currentInput.equals("x")))
        (!(currentInput = scanner.next()).equals("x"))  (ugyanaz, csak a scanner értékének behívásával)
        */

        // összehasonlításnál figyelmen kívül hagyja a kis és nagybetűket:
        // (event.toLowerCase().equals("x"));


        System.out.println();

        System.out.println("----------Logical operator (&&)----------");

        /* logikai ÉS operátor - az eredménye true/false.
        Csak akkor lesz az eredmény igaz, ha mindkét oldala true */
        System.out.println(true && false);
        System.out.println(4 == 4 && 5 != 7);
        System.out.println(11 != 0 && 8 == 32);
        System.out.println(11 != 0 && 8 == 8 && 5 != 9);

        System.out.println();

        System.out.println("----------Logical operator (||)----------");

        /* logikai VAGY operátor az eredménye true/false
        Csak akkor lesz az eredmény igaz, ha legalább az egyik oldala true */
        System.out.println(4 == 4 || 5 != 7);
        System.out.println(11 != 0 || 8 == 32);

        System.out.println();

        System.out.println("----------Arithmetical operators (+,-,*,/,%)----------");

        System.out.println("Number1 variable: " + number1);
        System.out.println(number1 + 9);
        System.out.println(number1 - 2);        // nem íródott felül a number1 értéke, csak kiírta az eredményt
        System.out.println(number1 * 2);
        System.out.println(number1 / 2);        // azért 2 és nem 2.5 az eredmény, mert az int-tel csak egész számokat inicializáltunk, ezért az eredmény is egész szám


        System.out.println();

        System.out.println(15 / 2);             // az eredmény 7, tört szám nélkül
        System.out.println(15 % 2);             // az eredmény 1, maga a maradék

        System.out.println();

        System.out.println(15.0 / 2.0);         // az eredmény már tizedes pontosságú
        System.out.println(15.0 % 2.0);

        System.out.println(15.0 / 2);           // elég az egyik szám után tizedes

        System.out.println();

        System.out.println("Jancsi és " + "Juliska"); // összefűzés + operátorral (más operátorokkal erre nincs mód)
        System.out.println("5 + 11 eredménye: " + 5 + 11); // az eredmény 511 lesz mert csak hozzáfűzi a számokat
        System.out.println("5 + 11 eredménye: " + (5 + 11)); // az eredmény helyes lesz
        System.out.println("5 * 11 eredménye: " + 5 * 11); // szorzásnál nem szükséges zárójel, mert a szorzás előbb hajtódik végre

        System.out.println();

        System.out.println("----------Increment/decrement operators (++, --)----------");

        int number3 = 7;
        System.out.println(number3);           // az eredmény 7
        number3++;
        System.out.println(number3);           // az eredmény 8, mert a ++ eggyel növeli a változó értékét (ugyanaz, mint a: number3 = number3 +1;)
        number3--;
        System.out.println(number3);           // az eredmény ismét 7

        System.out.println();

        System.out.println(number3++);         // az eredmény újra 7, mert noha hozzáadódott az egy, de előbb kiírja a number3 addigi értékét és csak utána növeli meg
        System.out.println(number3);           // az eredmény már a megnövelt érték, azaz 8
        System.out.println(number3--);         // az eredmény még mindig 8
        System.out.println(number3);           // az eredmény már a csökkentett érték, azaz 7

        System.out.println();

        System.out.println(--number3);         // az eredmény eggyel kevesebb, mert a -- művelet a kiíratás előtt végrahajtódik
        System.out.println(++number3);         // az eredmény újra 7

        System.out.println();

        System.out.println("----------Increment/decrement operators (+=, -=, *=, /=, %=)----------");
        // az adott változó értékét konkrét számmal növeli, csökkenti, szorozza és osztja

        int number4 = 10;
        number4 += 4;                          // a művelet megegyezik a: number4 = number4 + 4; művelettel
        System.out.println(number4);
        number4 -= 7;                          // a művelet megegyezik a: number4 = number4 - 7; művelettel
        System.out.println(number4);
        number4 *= 3;                          // a művelet megegyezik a: number4 = number4 * 3; művelettel
        System.out.println(number4);
        number4 /= 4;                          // a művelet megegyezik a: number4 = number4 / 4; művelettel
        System.out.println(number4);
        number4 %= 3;                          // a művelet megegyezik a: number4 = number4 % 3; művelettel
        System.out.println(number4);

        System.out.println();

        System.out.println("----------Logical NOT operator----------");
        // negálás, a logikai true-ból false-t állít elő, a logika false-ból pedig true-t

        boolean logicalVariable = false;
        System.out.println(logicalVariable);
        System.out.println(!logicalVariable);

        boolean condition = 5 != 7;
        System.out.println(condition);
        System.out.println(!condition);
        System.out.println(!(5 != 7));
    }
}
