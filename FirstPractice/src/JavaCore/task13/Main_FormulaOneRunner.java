package JavaCore.task13;

public class Main_FormulaOneRunner {
    public static void main(String[] args) {
        MercedesPilotOne hakkinen = new MercedesPilotOne();
        System.out.println(hakkinen);


        FerrariPilotOne ferrari1 = new FerrariPilotOne();

        hakkinen.getRacerName();
        hakkinen.acceleration(4.2);
        hakkinen.getCarManufacturer("Mercedes");
        hakkinen.getNationality();

        System.out.println(hakkinen);
    }
}
