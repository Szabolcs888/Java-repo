package Exercises;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.SimpleDoc;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

// Gyakorló fájl, bármikor törölhető a tartalma

public class F0_Gyakorlas {
    public static void main(String[] args) {
        Map<String, Integer> adultsAges = new HashMap<>();
        adultsAges.put("Géza", 22);
        adultsAges.put("Anikó", 19);
        adultsAges.put("Erzsébet", 45);
        adultsAges.put("Mária", 30);
        System.out.println(adultsAges);

        int sumOfVotes = 0;
        for (Map.Entry mapElement : adultsAges.entrySet()) {
            sumOfVotes += (int) mapElement.getValue();
        }
        System.out.println(sumOfVotes);


        Scanner scan = new Scanner(System.in);
        String userDataStr = scan.nextLine();

        //int a = (int) userDataStr;
        }
}

