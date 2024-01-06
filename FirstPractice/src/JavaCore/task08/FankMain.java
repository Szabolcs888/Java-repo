package JavaCore.task08;

public class FankMain {
    public static void main(String[] args) {
        KlasszikusFank  klasszikF = new KlasszikusFank();
        klasszikF.setÍzesítés("porcukros");

        CsokisFank azEnFankom = new CsokisFank();
        azEnFankom.setKakaotartalom("csokis");
        System.out.println(azEnFankom);

        LekvarosFank aMasikFankom = new LekvarosFank();

        System.out.println(aMasikFankom);
        System.out.println(klasszikF);


    }
}
