package Temps.Array_and_Collections;

            /* Tömb (array)
            - sorszám alapú (indexelt)
            - bármelyek elemet elkérhetjük
            - engedi egy adott elem többszöri ismétlődését
            - bármennyi null értéket hozzáadhatunk

            - méretkorlát (a létrehozáskor definiált méretet utána nem tudjuk módosítani futásidőben) */

import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {

        // -----tömb létrehozása-----

        int[] firstArray = new int[5];   //tömb létrehozása méretének megadásával (egy tömbbe csak azonos típusú elemeket tehetünk)
        String[] firstArrayS = new String[2];   //tömb létrehozása méretének megadásával
        boolean[] firstArrayB = new boolean[1];   //tömb létrehozása méretének megadásával
        float[] firstArrayF = new float[1];   //tömb létrehozása méretének megadásával

        int[] secondArray = {34, 2, 222, 101, 1223, 0, 9}; //tömb létrehozása kezdőértékek megadásával
        boolean[] secondArrayB = {true, false, true, true}; //tömb létrehozása kezdőértékek megadásával
        String[] secondArrayS = {"Alma", "Körte", "Dinnye"}; //tömb létrehozása kezdőértékek megadásával
        float[] secondArrayF = {56f, 21.468398f}; //tömb létrehozása kezdőértékek megadásával

        int[] thirdArray;        // így is létre lehet hozni, de utána értéket kell neki adni (ami lehet egy változó is)
        thirdArray = new int[5];


        // -----értékadás a tömb egy adott elemének-----

        firstArray[0] = 11;   //beállítom a tömb első elemét 11-re
        secondArrayS[2] = "Eper";  //felülírom a tömb 3. elemét, ami a 2. indexen található (indexelés 0.-tól indul) Eper-re


        // -----tömb adott értékének kiolvasása-----

        System.out.println(firstArray[0]);  //elkérem az firstArray tömb 0. elemét
        System.out.println(secondArrayS[0]);  //elkérem az secondArrayS tömb 0. elemét
        System.out.println(secondArrayS[1]);  //elkérem az secondArrayS tömb 1. elemét
        System.out.println(secondArrayS[2]);  //elkérem az secondArrayS tömb 2. elemét

        System.out.println();

        System.out.println(firstArray.length); //a length segítségével el tudom kérni a tömbben lévő elemek darabszámát
        System.out.println(secondArrayS.length);
        System.out.println(secondArray.length);

        int arraySize = secondArrayS.length; // egy új változó értékül kapja a secondArrayS tömb darabszámát
        System.out.println(arraySize);


        System.out.println();
        System.out.println("--------Cycles---------");

        //-----tömb értékeinek megadása ciklus segítségével-----

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;  // nem szükségszerű, hogy "i" legyen a szög.zárójelben - jelenleg csak az i értékével (ami ciklusonként növekszik) töltjük fel a tömböt
        }

        System.out.println();


        //-----tömb értékeinek kiolvasása for ciklus segítségével-----

        for (int i = 0; i < numbers.length; i++) {    // numbers.length-2; az utolsó két elemet nem olvassa ki
            System.out.println(numbers[i]);
        }

        System.out.println();

        for (int i = 0; i < secondArrayF.length; i++) {
            System.out.println(secondArrayF[i]);
        }

        System.out.println();


        //-----tömb értékeinek kiolvasása for each ciklus segítségével-----

        for (String item : secondArrayS)
            System.out.println(item);

        System.out.println();

        for (int item : secondArray)
            System.out.println(item);

        System.out.println();


        //-----tömb elemeinek összehasonlítása for ciklus segítségével-----

        String myFavoriteFruit = "Körte";

        for (int i = 0; i < secondArrayS.length; i++) {
            if (secondArrayS[i].equals(myFavoriteFruit)) {
                System.out.println(secondArrayS[i] + " a kedvenc gyümölcsöm!");
                break;
            }
        }

        System.out.println();


        //-----tömb elemeinek összehasonlítása boolean-val-----

        for (int i = 0; i < secondArrayS.length; i++) {
            System.out.print(secondArrayS[i].equals(myFavoriteFruit) + " ");
            }


        System.out.println();System.out.println();

        //-----tömb átkonvertálása listává

        String[] sampleArrayConvList = {"kutya", "macska", "holló"};
        List<String> list = Arrays.asList(sampleArrayConvList);

        System.out.println(list);
    }
}
