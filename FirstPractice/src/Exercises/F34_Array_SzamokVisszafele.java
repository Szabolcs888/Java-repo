package Exercises;
            /* 34. Feladat (Órai) (saját megoldás)
            Írjunk egy programot, amely egy array-ben elmenti a számokat 1-21-ig,
            majd kiírja őket visszafele egymás után szóközzel elválasztva. */

public class F34_Array_SzamokVisszafele {
    public static void main(String[] args) {

        int[] arrayNumbers = new int[21];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = i + 1;
        }

        for (int i = 20; i > -1; i--) {   // az i lehetne az "arrayNumbers.length -1" is
            System.out.print(arrayNumbers[i] + " ");
        }
    }
}

