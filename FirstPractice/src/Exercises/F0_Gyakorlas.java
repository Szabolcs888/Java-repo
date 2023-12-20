package Exercises;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.SimpleDoc;
import java.io.FileInputStream;
import java.util.*;

// Gyakorló fájl, bármikor törölhető a tartalma

public class F0_Gyakorlas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("szöveget kérek:");
        String userDataStr = scan.nextLine();
        System.out.println("számot kérek:");
        int a = scan.nextInt();

        System.out.println(userDataStr + a);

        System.out.println(amount(Arrays.asList(1, 2, 3)));


    }

    private static int amount(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;

        }return sum;
    }

}

