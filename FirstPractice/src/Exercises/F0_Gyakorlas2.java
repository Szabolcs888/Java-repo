package Exercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class F0_Gyakorlas2 {
    static public void main(String args[]) {
        List<String> szetvalasztandoElemekListaja2 = Arrays.asList("a,b,c", "g,j,k");
        String decision = "";
        for (String triangle : szetvalasztandoElemekListaja2) {
            String[] triangleSidesArray = triangle.split(",");
            String aside = triangleSidesArray[0];
            String bside = triangleSidesArray[1];
            String cside = triangleSidesArray[2];
            decision += "" + aside + ", " + bside + ", " + cside + System.lineSeparator();
        }
        System.out.println(decision);
    }
}



