package Exercises;

            /* 67. Feladat (saját megoldás)
            A 14. feladat metódusítása */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
        main();
            otoslotto();
                rng5();
            hatoslotto();
                rng6();
            heteslotto();
                rng7();
 */

public class F67_Met_Lotto {
    public static void main(String[] args) {

        otoslotto();
        hatoslotto();
        heteslotto();
    }

    private static int rng5() {
        Random random = new Random();

        int otos = random.nextInt(90) + 1;
        return otos;
    }

    private static int rng6() {
        Random random = new Random();

        int hatos = random.nextInt(45) + 1;
        return hatos;
    }

    private static int rng7() {
        Random random = new Random();

        int hetes = random.nextInt(35) + 1;
        return hetes;
    }

    private static void otoslotto() {
        List<Integer> lotto5Numbers = new ArrayList<>();

        lotto5Numbers.add(rng5());
        lotto5Numbers.add(rng5());
        while (lotto5Numbers.get(0) == lotto5Numbers.get(1)) {
            lotto5Numbers.remove(1);
            lotto5Numbers.add(rng5());
        }
        lotto5Numbers.add(rng5());
        while (lotto5Numbers.get(2) == lotto5Numbers.get(0) || lotto5Numbers.get(2) == lotto5Numbers.get(1)) {
            lotto5Numbers.remove(2);
            lotto5Numbers.add(rng5());
        }
        lotto5Numbers.add(rng5());
        while (lotto5Numbers.get(3) == lotto5Numbers.get(0) || lotto5Numbers.get(3) == lotto5Numbers.get(1) || lotto5Numbers.get(3) == lotto5Numbers.get(2)) {
            lotto5Numbers.remove(3);
            lotto5Numbers.add(rng5());
        }
        lotto5Numbers.add(rng5());
        while (lotto5Numbers.get(4) == lotto5Numbers.get(0) || lotto5Numbers.get(4) == lotto5Numbers.get(1) || lotto5Numbers.get(4) == lotto5Numbers.get(2) || lotto5Numbers.get(4) == lotto5Numbers.get(3)) {
            lotto5Numbers.remove(4);
            lotto5Numbers.add(rng5());
        }
        Collections.sort(lotto5Numbers);
        System.out.println("Az ötöslottó nyerőszámai: " + lotto5Numbers.get(0) +", " + lotto5Numbers.get(1) +", " + lotto5Numbers.get(2) +", " + lotto5Numbers.get(3) +", " + lotto5Numbers.get(4));
    }

    private static void hatoslotto() {
        List<Integer> lotto6Numbers = new ArrayList<>();

        lotto6Numbers.add(rng6());
        lotto6Numbers.add(rng6());
        while (lotto6Numbers.get(0) == lotto6Numbers.get(1)) {
            lotto6Numbers.remove(1);
            lotto6Numbers.add(rng6());
        }
        lotto6Numbers.add(rng6());
        while (lotto6Numbers.get(2) == lotto6Numbers.get(0) || lotto6Numbers.get(2) == lotto6Numbers.get(1)) {
            lotto6Numbers.remove(2);
            lotto6Numbers.add(rng6());
        }
        lotto6Numbers.add(rng6());
        while (lotto6Numbers.get(3) == lotto6Numbers.get(0) || lotto6Numbers.get(3) == lotto6Numbers.get(1) || lotto6Numbers.get(3) == lotto6Numbers.get(2)) {
            lotto6Numbers.remove(3);
            lotto6Numbers.add(rng6());
        }
        lotto6Numbers.add(rng6());
        while (lotto6Numbers.get(4) == lotto6Numbers.get(0) || lotto6Numbers.get(4) == lotto6Numbers.get(1) || lotto6Numbers.get(4) == lotto6Numbers.get(2) || lotto6Numbers.get(4) == lotto6Numbers.get(3)) {
            lotto6Numbers.remove(4);
            lotto6Numbers.add(rng6());
        }
        lotto6Numbers.add(rng6());
        while (lotto6Numbers.get(5) == lotto6Numbers.get(0) || lotto6Numbers.get(5) == lotto6Numbers.get(1) || lotto6Numbers.get(5) == lotto6Numbers.get(2) || lotto6Numbers.get(5) == lotto6Numbers.get(3) || lotto6Numbers.get(5) == lotto6Numbers.get(4)) {
            lotto6Numbers.remove(4);
            lotto6Numbers.add(rng6());
        }

        Collections.sort(lotto6Numbers);
        System.out.println("A hatoslottó nyerőszámai: " + lotto6Numbers.get(0) +", " + lotto6Numbers.get(1) +", " + lotto6Numbers.get(2) +", " + lotto6Numbers.get(3) +", " + lotto6Numbers.get(4) +", " + lotto6Numbers.get(5));
    }

    private static void heteslotto() {
        List<Integer> lotto7Numbers = new ArrayList<>();

        lotto7Numbers.add(rng7());
        lotto7Numbers.add(rng7());
        while (lotto7Numbers.get(0) == lotto7Numbers.get(1)) {
            lotto7Numbers.remove(1);
            lotto7Numbers.add(rng7());
        }
        lotto7Numbers.add(rng7());
        while (lotto7Numbers.get(2) == lotto7Numbers.get(0) || lotto7Numbers.get(2) == lotto7Numbers.get(1)) {
            lotto7Numbers.remove(2);
            lotto7Numbers.add(rng7());
        }
        lotto7Numbers.add(rng7());
        while (lotto7Numbers.get(3) == lotto7Numbers.get(0) || lotto7Numbers.get(3) == lotto7Numbers.get(1) || lotto7Numbers.get(3) == lotto7Numbers.get(2)) {
            lotto7Numbers.remove(3);
            lotto7Numbers.add(rng7());
        }
        lotto7Numbers.add(rng7());
        while (lotto7Numbers.get(4) == lotto7Numbers.get(0) || lotto7Numbers.get(4) == lotto7Numbers.get(1) || lotto7Numbers.get(4) == lotto7Numbers.get(2) || lotto7Numbers.get(4) == lotto7Numbers.get(3)) {
            lotto7Numbers.remove(4);
            lotto7Numbers.add(rng7());
        }
        lotto7Numbers.add(rng7());
        while (lotto7Numbers.get(5) == lotto7Numbers.get(0) || lotto7Numbers.get(5) == lotto7Numbers.get(1) || lotto7Numbers.get(5) == lotto7Numbers.get(2) || lotto7Numbers.get(5) == lotto7Numbers.get(3) || lotto7Numbers.get(5) == lotto7Numbers.get(4)) {
            lotto7Numbers.remove(4);
            lotto7Numbers.add(rng7());
        }
        lotto7Numbers.add(rng7());
        while (lotto7Numbers.get(6) == lotto7Numbers.get(0) || lotto7Numbers.get(6) == lotto7Numbers.get(1) || lotto7Numbers.get(6) == lotto7Numbers.get(2) || lotto7Numbers.get(6) == lotto7Numbers.get(3) || lotto7Numbers.get(6) == lotto7Numbers.get(4)|| lotto7Numbers.get(6) == lotto7Numbers.get(5)) {
            lotto7Numbers.remove(4);
            lotto7Numbers.add(rng7());
        }

        Collections.sort(lotto7Numbers);
        System.out.println("A Skandináv lottó nyerőszámai: " + lotto7Numbers.get(0) +", " + lotto7Numbers.get(1) +", " + lotto7Numbers.get(2) +", " + lotto7Numbers.get(3) +", " + lotto7Numbers.get(4) +", " + lotto7Numbers.get(5) +", "  + lotto7Numbers.get(6));
    }
}
