package Exercises;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.SimpleDoc;
import java.io.FileInputStream;
import java.util.*;

// Gyakorló fájl, bármikor törölhető a tartalma

public class F0_Gyakorlas {
    public static void main(String[] args) {

        List<String> loggedHours = Arrays.asList(
                "Zuckerberg,4", "Steve,4", "Bill,1", "Bill,2", "Zuckerberg,4", "Bill,2",
                "Zuckerberg,1", "Zuckerberg,3", "Zuckerberg,1", "Zuckerberg,1", "Steve,4",
                "Bill,2", "Zuckerberg,3", "Bill,2", "Zuckerberg,4", "Steve,1", "Bill,3",
                "Steve,2", "Steve,2", "Bill,1", "Zuckerberg,4", "Bill,4", "Steve,4", "Bill,2",
                "Bill,3", "Zuckerberg,3", "Steve,4", "Zuckerberg,4", "Bill,2", "Zuckerberg,3");

        String[] comArray = new String[2];
        for (String c : loggedHours) {
            comArray = c.split(",");

          //  System.out.println(comArray[1]);


        }

        for (String item : comArray)
            System.out.println(item);

}
}

