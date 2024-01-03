package JavaCore.task02;

public class Runner {
    public static void main(String[] args) {
        Auto yaris = new Auto();
        yaris.setGyarto("Toyota");
        yaris.setTipus("Yaris");
        yaris.setEvjarat(2020);
        yaris.setAjtokSzama(5);
        yaris.setSzin("Zöld");


        Auto scania = new Auto();
        scania.setGyarto("Scania");
        scania.setTipus("R500 super");
        scania.setEvjarat(2021);
        scania.setAjtokSzama(2);
        scania.setSzin("piros");

        Auto alfa = new Auto();
        alfa.setGyarto("Alfa Romeo");
        alfa.setTipus("GT");
        alfa.setEvjarat(2006);
        alfa.setAjtokSzama(3);
        alfa.setSzin("fekete");

        // System.out.println(yaris.getGyarto()+yaris.getTipus());
        System.out.println(yaris);
        System.out.println(scania);
        System.out.println(alfa);

        System.out.println(alfa.getGyarto());

        Auto mercedes = new Auto("Mercedes", "GLS", 2024, 5, "sárga");
        System.out.println(mercedes);
    }
}
