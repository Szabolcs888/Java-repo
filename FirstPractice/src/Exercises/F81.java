package Exercises;

import java.util.Scanner;

public class F81 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a text:");
        replaceTextWriteToConsole(scan.nextLine());

    }
    public static void replaceTextWriteToConsole(String text){
       text = text.replace("legrosszabb", "legjobb");
        System.out.println(text);
    }

}
