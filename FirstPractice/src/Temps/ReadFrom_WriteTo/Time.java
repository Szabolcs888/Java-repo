package Temps.ReadFrom_WriteTo;

public class Time {
    public static void main(String[] args) {

        // időzítés a Thread.sleep() metódussal, amit mindenképp Exception kezelnünk kell, mert pl. egy oldal tesztelésének automatizálásnál az oldal nem azonnal válaszol (be kell töltenie), így hiba keletkezne, ha nem várna program
        System.out.println("Hello!");
        try {
            Thread.sleep(5000);
            System.out.println("Eltelt 5 másodperc!");
        } catch (Exception e) {
        }
    }
}
