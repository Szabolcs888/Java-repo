package Exercises;

public class F00_ValtozokEsOperatorok {
    public static void main(String[] args) {

        System.out.println();
// ------------
        System.out.println("-----int-----");

        int a = 2000;
        int b = 31;

        int c = a + b;
        System.out.println(c);

        int d = a - b;
        System.out.println(d);

        int e = a * b;
        System.out.println(e);

        System.out.println();
// ------------
        System.out.println("-----double-----");

        double f = 9.32;
        double g = 1.93;

        double h = f / g;
        System.out.println(h);

        System.out.println();
// ------------
        System.out.println("-----boolean-----");

        boolean aIsEqualB = a == b;
        System.out.println(aIsEqualB);

        boolean aIsNotEqualB = a != b;
        System.out.println(aIsNotEqualB);

        boolean resultOfAnAndOperator = (a > 200) && (b < -200);
        System.out.println(resultOfAnAndOperator);

        boolean resultOfAnOrOperator = (a > 2000000) || (b > -200);
        System.out.println(resultOfAnOrOperator);

        System.out.println();
// ------------
        System.out.println("-----% operator and increment/decrement operators-----");

        System.out.println(7 % 2);

        int a2 = 5;
        a2++;
        System.out.println("a2 after ++ is " + a2);

        int a3 = 7;
        a3--;
        System.out.println("a3 after -- is " + a3);

        int a4 = 10;
        a4 += 7;
        System.out.println("a4 after += 7 is " + a4);

        int a5 = 1;
        a5 -= 7;
        System.out.println("a5 after -= 7 is " + a5);

        int a6 = 3;
        a6 *= 6;
        System.out.println("a6 after *= 6 is " + a6);

        System.out.println();
// ------------
        System.out.println("-----String operator-----");

        String hello = "Hello";
        String world = " World!";
        System.out.println(hello + world);
    }
}
