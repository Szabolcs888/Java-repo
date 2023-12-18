package Exercises;
/* 3.a Feladat
Készítsetek programot, ami a megadott két számot, “a”-t és “b” letárolja,
majd megmondja mennyi lesz “a” és “b” szorzata, miután megszoroztuk az “a”-t 3-al.
A program argumentumként olvassa be a számokat */

public class F03a_Arg {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println((a * 3) * b);
    }
}