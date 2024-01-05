package Exercises;

import java.io.*;


public class F0_Gyakorlas2 {
    static public void main(String args[]) {
        String readFromFile = "";
        try {
            File fileDirs = new File("src/resources/restaurants.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDirs), "ISO-8859-1"));
            String str;
            while ((str = in.readLine()) != null) {
                readFromFile += str + ", ";
            }
        } catch (Exception e) {
        }
        System.out.println(readFromFile);
    }
}


