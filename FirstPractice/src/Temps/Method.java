package Temps;

import java.util.*;

// A visszatérési érték mindig csak egy adat lehet. Egy int, egy boolean, vagy egy list, stb..
// Viszont egy metóduson belüli újabb metódushívással már bármennyi adatot továbbküldhetünk!

public class Method {
    public static void main(String[] args) {

        String userAnswer = readFromUser();
        System.out.println(userAnswer);


        List<String> namesList = Arrays.asList("kicsi", "nagy", "óriási");
        print(namesList); // lista metódus meghívása visszatérési érték nélkül


        List<Integer> numList = Arrays.asList(1990, 1987, 2002, 1992, 1972, 2009, 2004, 2016);
        int a = numbersList(numList);
        System.out.println(a);


        System.out.println(amount(Arrays.asList(1, 2, 3))); // meghívjuk az amount lista jellegű metódust és a visszatérési értéket kinyomtatjuk

        String newSentence = words(Arrays.asList("szia", "jó napot", "viszont látásra")); // meghívjuk a lista jellegű words metódust, amelynek visszatérési értékét beletettük a newSentence változóba
        System.out.println(newSentence); // kiíratjuk a newSentence tartalmát


        List<Integer> numList2 = Arrays.asList(1990, 1987, 2002);
        int result = ListInput(numList2); // meghívjuk a lista metódust, ami integert ad vissza
        System.out.println(result);


        int intArr[] = {9, 1, 4, 8, 10, 11, 15, 20, 22, 35, 23, 27, 33, 45, 65,};
        arrayPrint(intArr); // meghívjuk az arrayPrint metódust az intArr map értékkel, és visszatérési értékként megkapjuk a lista tartalmát


        int rngNumber = rng(); // véletlenszám generátor metódus meghívása
        System.out.println(rngNumber);


        System.out.println(atlag(8.45, 17.3378)); // két szám átlagát kiszámoló metódus meghívása és a visszatérési érték kiíratása
        System.out.println(atlag(8.56689, 34.6789)); // egy metódus többször is meghívható

        System.out.println(atlag(4, 9)); // egy adott metódusnév többször is használható eltérő paraméterezéssel

    }

    // metódus usertől adatbekérésre
    public static String readFromUser() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    // metódus usertől adatbekérésre kiírandó szöveggel
    public static String readFromUser(String question) {
        Scanner scan = new Scanner(System.in);
        System.out.println(question);
        return scan.nextLine();
    }

    // metódus usertől adatbekérésre ciklusban listába gyűjtve, kiírandó szöveggel
    public static List<String> readFromUser2(String question) {
        List<String> shoppingList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println(question);
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n" + i + ". tétel:");
            shoppingList.add(scan.nextLine());
        }
        return shoppingList;
    }



    // metódus lista feldolgozására visszatérési érték nélkül
    private static void print(List<String> nyomtatas) {
        System.out.println(nyomtatas);
    }

    // metódus lista feldolgozására visszatérési értékkel
    private static int numbersList(List<Integer> szamolas) {
        int size = szamolas.size();
        return size;
    }

    // metódus lista jellegű adatok feldolgozására integerrel, visszatérési értékkel
    private static int amount(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
        //} return sum/numbers.size();    // a visszatérési érték nem csak egy szimpla változó lehet
    }

    // metódus lista jellegű adatok feldolgozására Stringgel, visszatérési értékkel
    private static String words(List<String> szavak) {
        String newWord = szavak.get(1) + " kívánok!";
        return newWord;
    }

    // metódus lista paraméterrel és int visszatérési értékkel
    public static int ListInput(List<Integer> abclist) {
        return (abclist.get(0) + abclist.get(1)) * abclist.get(2);
    }

    // metódus lista visszatérési értékkel (nincs meghívva!)
    // public static List<Integer> scoreSum(int count, String winner){}


/*     metódus lista user általi feltöltésére, lista visszatérési értékkel (nincs meghívva!)
    private static List<String> getFruitList() {
        List<String> localFruitList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            localFruitList.add(scan.nextLine());
        }
        return localFruitList;
    }
 */


    // metódus array(tömb) feldolgozására visszatérési érték nélkül
    public static void arrayPrint(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i] + " ");
        }
    }

    // metódus véletlenszám generásására
    public static int rng() {
        Random rng = new Random();
        // int randomNumber = rng.nextInt(100); // felesleges változóba menteni
        // return randomNumber;
        return rng.nextInt(100);
    }

    // metódus két szám átlagának a kiszámítására
    public static double atlag(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    // egy adott metódusnév többször is használható eltérő paraméterezéssel
    public static int atlag(int num1, int num2) {
        return (num1 * num2);
    }
}
