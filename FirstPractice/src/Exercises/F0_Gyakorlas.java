package Exercises;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.SimpleDoc;
import java.io.FileInputStream;
import java.util.*;

// Gyakorló fájl, bármikor törölhető a tartalma

public class F0_Gyakorlas {
    public static void main(String[] args) {
        trycatch();
        arrayMethod();
    }

    private static void trycatch() {
        try {

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Hey, there is no such an index in the array!");
        }
        System.out.println("Thanks for using our service!");
    }

    public static void arrayMethod() throws ArrayIndexOutOfBoundsException {
        int[] exampleArray = {21, 44, 33, 77};
        System.out.println(exampleArray[15]);
    }
}

