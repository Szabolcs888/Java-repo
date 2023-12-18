package Exercises;
            /* 35. Feladat (saját megoldás)
            Készítsetek egy ageInput nevű arrayst, amiben a következő
            számok találhatóak: 5, -3, 0, 21, 55, 18, 32, 255, 42.
            Írjatok egy for ciklust, amely bejárja ezt a tömböt és
            valid age esetén kiírja azt a képernyőre, de csak az
            életszerű, valós age-eket. */

public class F35_Array_EletkorValaszto {
    public static void main(String[] args) {

        int[] ageInput = {5, -3, 0, 21, 55, 18, 32, 255, 42};

        for (int i = 0; i < ageInput.length; i++) {
            if (ageInput[i] > 0 && ageInput[i] < 150) {
                System.out.println("The " + ageInput[i] + " is valid age");
            }
        }
    }
}

