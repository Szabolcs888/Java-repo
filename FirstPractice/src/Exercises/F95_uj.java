package Exercises;

            /* 95. Feladat (saját megoldás)
            Készítsetek egy olyan alkalmazást, amely egy fájlból felolvas különböző háromszögek
            lehetséges értékeit. Minden egyes sor egy lehetséges háromszög oldalait tartalmazza.
            (triangleExamples.txt). A program végig iterál a listán, ami a fájlban van és minden
            egyes sorról eldönti, hogy a háromszög szerkeszthető-e és ki is írja a képernyőre.
            Minimum minden olyan esetet vegyetek fel, mint példa háromszög, amikre szerintetek
            szükség van, hogy megfelelően le legyen tesztelve a logika. Az eredmény kerüljön
            lementésre egy fájlba (triangleResults.log). */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/*
        main();
            readFromFile();
            datasCountAndPrint();
            datasCountAndWriteToFile();
*/

public class F95_uj {
    public static void main(String[] args) {
        List<String> triangleDataListFromFile = readFromFile();
        String result = datasCountAndPrint(triangleDataListFromFile);
        datasCountAndWriteToFile(result);
    }

    private static List<String> readFromFile() {
        List<String> listFromFile = new ArrayList<>();
        List<String> splitListFromFile = new ArrayList<>();
        try {
            listFromFile = Files.readAllLines(Paths.get("src/resources/triangleExamples.txt"));
        } catch (IOException e) {
            System.out.println("Nem létezik a fájl!");
        }
        for (String line : listFromFile) {
            for (String item : line.split(", ")) {
                item.trim();
                splitListFromFile.add(item);
            }
        }
        return splitListFromFile;
    }

    private static String datasCountAndPrint(List<String> triangleDataListFromFile) {
        int caseCounter = 1;
        int listNumbersCounter = 0;
        String result = "";
        for (int i = 0; i < triangleDataListFromFile.size() / 3; i++) {
            int a = Integer.parseInt(triangleDataListFromFile.get(0 + listNumbersCounter));
            int b = Integer.parseInt(triangleDataListFromFile.get(1 + listNumbersCounter));
            int c = Integer.parseInt(triangleDataListFromFile.get(2 + listNumbersCounter));
            System.out.print((caseCounter) + ". teszteset: " + triangleDataListFromFile.get(0 + listNumbersCounter) + ", " + triangleDataListFromFile.get(1 + listNumbersCounter) + ", " + triangleDataListFromFile.get(2 + listNumbersCounter));
            if (a + b > c && a + c > b && c + b > a) {
                System.out.println(" oldalhosszokból lehetséges háromszög.");
                result += (caseCounter) + ". teszteset: " + triangleDataListFromFile.get(0 + listNumbersCounter) + ", " + triangleDataListFromFile.get(1 + listNumbersCounter) + ", " + triangleDataListFromFile.get(2 + listNumbersCounter)+" oldalhosszokból lehetséges háromszög."+ System.lineSeparator();
            } else {
                System.out.println(" oldalhosszokból nem lehetséges háromszög.");
                result += (caseCounter) + ". teszteset: " + triangleDataListFromFile.get(0 + listNumbersCounter) + ", " + triangleDataListFromFile.get(1 + listNumbersCounter) + ", " + triangleDataListFromFile.get(2 + listNumbersCounter)+" oldalhosszokból nem lehetséges háromszög."+ System.lineSeparator();
            }
            caseCounter += 1;
            listNumbersCounter += 3;
        } return result;
    }

    private static void datasCountAndWriteToFile(String result) {
        try {
            Files.write(Paths.get("src/resources/triangleResults.log"), result.getBytes("UTF-8"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("A fájl nem létezett, ezért létrehoztam.");
            try {
                Files.write(Paths.get("src/resources/triangleResults.log"), result.getBytes("UTF-8"));
            } catch (IOException j) {
                System.out.println("valami nem jó");
            }
        }
    }
}
