package Exercises;

            /* 96. Feladat (saját megoldás)
            Készítsünk egy reportoló alkalmazást, ami a 75-ös feladat megoldásán alapul.
            Tegyük fel, hogy a teszt futások eredményei egy testexecutionresults.txt-ben
            vannak tárolva. Olvassuk be a fájlt (minimum 20 sor szerepeljen benne),
            dolgozzuk fel és az eredményt egy testexecutionreport.txt-be mentsük el. */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/*
        main();
            readFromFile();
            analyse();
                printAndWriteToFile();
*/

public class F96_ReadFile_WriteFile_ListCharAt_Reportolas {
    public static void main(String[] args) {
        List<String> testCasesFromFile = readFromFile("src/resources/testexecutionresults.txt");
        analyse(testCasesFromFile);
    }

    private static List<String> readFromFile(String path) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.out.println("Nem létezik a fájl!");
        }
        return lines;
    }

    private static void analyse(List<String> testCasesFromFile) {
        List<Float> localTestCaseList = new ArrayList<>();
        float sum1 = 0;
        float sumX = 0;
        float sum0 = 0;
        for (String item : testCasesFromFile)
            switch (item.charAt(4) + "") {
                case "1":
                    sum1 += +1;
                    break;
                case "X":
                    sumX += +1;
                    break;
                case "0":
                    sum0 += +1;
                    break;
            }
        localTestCaseList.add(sum1);
        localTestCaseList.add(sumX);
        localTestCaseList.add(sum0);
        printAndWriteToFile(localTestCaseList, testCasesFromFile, "src/resources/testexecutionreport.txt");
    }

    private static void printAndWriteToFile(List<Float> localTestCaseList, List<String> testCasesFromFile, String path) {
        System.out.println("A tesztesetek: ");
        String testCases = "";
        for (String line : testCasesFromFile) {
            System.out.println(line);
            testCases += line + System.lineSeparator();
        }
        String content = "A tesztesetek: " + System.lineSeparator() + testCases + System.lineSeparator()
                + "Összesen " + testCasesFromFile.size() + " teszteset került lefuttatásra." + System.lineSeparator()
                + String.format("%.0f", localTestCaseList.get(0)) + " PASS (" + (String.format("%.2f", localTestCaseList.get(0) / testCasesFromFile.size() * 100)) + "%)"+ System.lineSeparator()
                + String.format("%.0f", localTestCaseList.get(1)) + " SKIP (" + (String.format("%.2f", localTestCaseList.get(1) / testCasesFromFile.size() * 100)) + "%)"+ System.lineSeparator()
                + String.format("%.0f", localTestCaseList.get(2)) + " FAILED (" + (String.format("%.2f", localTestCaseList.get(2) / testCasesFromFile.size() * 100)) + "%)";

        System.out.println(System.lineSeparator() + "Összesen " + testCasesFromFile.size() + " teszteset került lefuttatásra.");
        System.out.println(String.format("%.0f", localTestCaseList.get(0)) + " PASS (" + String.format("%.2f", localTestCaseList.get(0) / testCasesFromFile.size() * 100) + "%)");
        System.out.println(String.format("%.0f", localTestCaseList.get(1)) + " SKIP (" + String.format("%.2f", localTestCaseList.get(1) / testCasesFromFile.size() * 100) + "%)");
        System.out.println(String.format("%.0f", localTestCaseList.get(2)) + " FAILED (" + String.format("%.2f", localTestCaseList.get(2) / testCasesFromFile.size() * 100) + "%)");
        try {
            Files.write(Paths.get(path), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}