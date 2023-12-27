package Exercises;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.SimpleDoc;
import java.io.FileInputStream;
import java.util.*;

// Gyakorló fájl, bármikor törölhető a tartalma

public class F0_Gyakorlas {
    public static void main(String[] args) {
        String compChoice = "PAPÍR";
        String userChoice = "PAPÍ";
        userChoice = userChoice + "R";

        if (compChoice == userChoice)
            System.out.println("Egyenlő");
        if (compChoice.equals(compChoice))
            System.out.println("tényleg egyenlő");
        
        
        as();
    }

    private static void as() {

    }

}

