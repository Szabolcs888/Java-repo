package Exercises;

            /* 95. Feladat (Zsolt megoldása)
            Készítsetek egy olyan alkalmazást, amely egy fájlból felolvas különböző háromszögek
            lehetséges értékeit. Minden egyes sor egy lehetséges háromszög oldalait tartalmazza.
            (triangleExamples.txt). A program végig iterál a listán, ami a fájlban van és minden
            egyes sorról eldönti, hogy a háromszög szerkeszthető-e és ki is írja a képernyőre.
            Minimum minden olyan esetet vegyetek fel, mint példa háromszög, amikre szerintetek
            szükség van, hogy megfelelően le legyen tesztelve a logika. Az eredmény kerüljön
            lementésre egy fájlba (triangleResults.log). */

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class F95_ReadFile_WriteFile_ListSplitToArray_HaromszogOldalSzamitas2 {
    public static void main(String[] args) {
        // 1. triangleExamples.txt-bem teszt esetek létrehozása (Pl.: side a: 5, side b: 6, side c: 7. Pl 2.: 5,6,7)
        // 2. metódus létrehozása az adatok beolvasásásra
        List<String> triangleData = readFromFile("savedFiles/triangleExamples.txt");
        // 3. metódus létrehozása a háromszögek szerkeszthetőségének eldöntésére
        analyseTriangeData(triangleData);
        // 4. az eredmény triangleResults.log-ba mentése (Pl.: "The following triange is VALID. Side A: 5, Side B: 6, Side C: 7")
    }

    public static List<String> readFromFile(String fileName) {
        //a megadott fájl beolvasása
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            System.out.println("NEM LÉTEZIK");
        }
        return lines;
    }

    public static void analyseTriangeData(List<String> triangleDataList) {
        //a megadott lista feldolgozása és a feldolgozott adatból kinyert számokkal való metódushívás
        String decision = "";
        for (String triangle : triangleDataList) {
            //0. triangle = "5,6,7"
            String[] triangleSidesArray = triangle.split(","); //["5","6","7"]
            int aside = Integer.parseInt(triangleSidesArray[0]);
            int bside = Integer.parseInt(triangleSidesArray[1]);
            int cside = Integer.parseInt(triangleSidesArray[2]);
            decision += getTriangleMsg(aside, bside, cside) + System.lineSeparator();
        }
        writeToFile("triangleResults.log", decision);
    }

    public static String getTriangleMsg(int aside, int bside, int cside) {
        // utasítások az oldal szerkeszthetőségének eldöntésére
        String decisionText = "";
        if ((aside + bside > cside) && (aside + cside > bside) && (cside + bside > aside)) {
            decisionText = "VALID";
        } else {
            decisionText = "INVALID";
        }
        return "The following triange is " + decisionText + ". Side A: " + aside + ", Side B: " + bside + ", Side C: " + cside;
    }

    public static void writeToFile(String fileName, String content) {
        //a megadott fájlba, a megadott content írása
        try {
            new File("savedFiles").mkdirs();  //mappa létrehozása, amennyiben még nem létezik
            Files.write(Paths.get("savedFiles/" + fileName), content.getBytes(StandardCharsets.UTF_8));  //felülírja a fájl tartalmát ha van már benne valami
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}