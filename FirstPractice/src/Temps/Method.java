package Temps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Method {

    public static void main(String[] args) {

        vonalKiirasa();
        String userAnswer = readFromUser();
        System.out.println(userAnswer);

        System.out.println(amount(Arrays.asList(1, 2, 3))); // az amount metódusnak lista jellegű adatokat küldünk
    }

    // void-ot akkor használunk, ha nincs visszatérési érték, minden más esetben használnunk kell a return utasítást
    public static void vonalKiirasa() {
        System.out.println("-----");
    }

    public static String readFromUser() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }


    private static int amount(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;

        }
        return sum;
    //} return sum/numbers.size();    // a visszatérési érték a elgkülönbözőfélébb lehet
}


}
