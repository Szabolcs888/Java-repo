package Exercises;

/*
95)	Készítsetek egy olyan alkalmazást, amely egy fájlból felolvas különböző háromszögek
 lehetséges értékeit. Minden egyes sor egy lehetséges háromszög oldalait tartalmazza.
 (triangleExamples.txt). A program végig iterál a listán ami a fájlban van és minden
 egyes sorról eldönti hogy a háromszög szerkeszthető-e és ki is írja a képernyőre.
  Minimum minden olyan esetet vegyetek fel mint példa háromszög, ami szerintetek szükség van,
  hogy megfelelően le legyen tesztelve a logika. Az eredmény kerüljön lementésre egy fájlba (triangleResults.log)
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/*
public class F95 {
    public static void main(String[] args) {

        // Sajnos nekem sem lett kész, egyelőre több időre lett volna szükségem. Amint egysdzer már megvan legközelebb jóval gyorsabban megy.

        // txt létrehozása
        // metódus létrehozása
        // metódus háromszögek szerkeszthetőségének eldöntésére
        // az eredmény log fájlba mentése


        List<String> txtList = readFromFile();
        System.out.println(txtList.get(0));

        analyseTriangleData(txtList);

        getTriangleMsg(txtList.get(0), txtList.get(1), txtList.get(2));
        //System.out.println(getTriangleMsg());
    }

    public static List<String> readFromFile() {
        List<String> nums = new ArrayList<>();
        try {
            nums = Files.readAllLines(Paths.get("src/resources/triangleExamples.txt"));
            nums.addAll(nums);
        } catch (IOException e) {
            System.out.println("NEM LÉTEZIK");
        }
        return nums;
    }

    public static String analyseTriangleData(List<String> triangleDatalist) {

        for (String tr: triangleDatalist)
        // ide jött volna a splitelés
        String[] traArr = tr.split(",");

        return ;
    }

    public static boolean getTriangleMsg(String aside, String bside, String cside) {
        int a = Integer.parseInt(aside);
        int b = Integer.parseInt(bside);
        int c = Integer.parseInt(cside);

        boolean yesOrNo = true;
        if (a + b > c && a + c > b && c + b > a) {
            System.out.println("You are a lucky person.");
            yesOrNo = true;
        } else {
            System.out.println("Please, try again.");
            yesOrNo = false;
        }
        return yesOrNo;

    }

    public static void writeToFile(String filename, String content) {
        try {
            String content =  "......";
            Files.write(Paths.get("src/resources/triangleExamples.txt"), content.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

*/