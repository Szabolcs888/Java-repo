package Exercises;

            /* 80. Feladat (saját megoldás)
            Írjatok egy metódust, amely képes megkeresni a paraméterként kapott szöveg
            elejéről, a szintén paraméterként kapott darabszámig kivágni a karaktereket.
            Az eredmény Stringet adja vissza a metódus. Program argumentumként
            feldolgozott értékekkel, futtassátok meg a metódust a main-ből. */

public class F80_String_Substring_FromArgs {
    public static void main(String[] args) {

        String processedString = cutProcess(args[0], Integer.parseInt(args[1]));
        System.out.println(processedString);
    }

    private static String cutProcess(String text, int cutAmount) {
        String cutText = "";
        if (text.length() >= cutAmount)
        cutText = text.substring(0, cutAmount);
        else
            System.out.println("Hosszabb a kivágandó szövegrész, mint maga az eredeti szöveg.");
        return cutText;
    }
}
