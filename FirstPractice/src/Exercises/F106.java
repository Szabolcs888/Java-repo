package Exercises;

import java.util.Scanner;

public class F106 {
    public static void main(String[] args) {


        System.out.println("Give me the actual score:");
        Scanner scan = new Scanner(System.in);
        int actualScore = scan.nextInt();
        System.out.println("The minimum score for passed exam is: " +args[0]);

        int minScore = Integer.parseInt(args[0]);
        if (actualScore >= minScore) {
            System.out.println("Your status: "+Examstatus.PASSED);
        } else {
            System.out.println("Your status: "+Examstatus.FAILED);;

        }
    }
    enum  Examstatus {
        PASSED, FAILED
    }
}
