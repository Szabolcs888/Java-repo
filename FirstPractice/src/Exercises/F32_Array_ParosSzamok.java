package Exercises;
            /* 32. Feladat (Órai) (saját megoldás; nem a legszebb, de működik)
            Készítsetek egy programot, amely elszámol 1-től 100-ig és a páros
            számokat lementi egy evenNumbers nevű array-be. Írjuk is ki a
            képernyőre egy sorban az értékeit. */

public class F32_Array_ParosSzamok {
    public static void main(String[] args) {

        int[] evenNumbers = new int[50];

        int numbers = 0;
        for (int i = 0; i < 100; i++) {
            numbers++;
            evenNumbers[i / 2] = numbers;
            // System.out.print(numbers + " ");
        }
        // System.out.println();

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
