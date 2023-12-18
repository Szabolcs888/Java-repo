package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class F82 {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("basszus", "kutyafáját", "picsába");

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a text:");
        String word = scan.nextLine();

        replaceWord(word);

    }

    public static void replaceWord(String w) {
        List<String> namesList = Arrays.asList("basszus", "kutyafáját", "picsába");
        String a = "";
        int length = 0;
        for (int i = 0; i < namesList.size(); i++) {
            a = namesList.get(i);
            for (int it = 0; it < a.length(); it++)

            w = w.replace(a,  "*" );
            length = a.length();
        }
      // for (int i =0; i< length; i++ ) {
            System.out.print(w);
      // }
    }
}
