package JavaCore.task02;

public class Auto {
    private String gyarto;
    private String tipus;
    private int evjarat;
    private int ajtokSzama;
    private String szin;

// a yaris, a scania, az alfa így lett példányosítva
    @Override
    public String toString() {
        return "Auto{" +
                "gyarto='" + gyarto + '\'' +
                ", tipus='" + tipus + '\'' +
                ", evjarat=" + evjarat +
                ", ajtokSzama=" + ajtokSzama +
                ", szin='" + szin + '\'' +
                '}';
    }
// a mercedes  így lett példányosítva

    public Auto(String gyarto, String tipus, int evjarat, int ajtokSzama, String szin) {
        this.gyarto = gyarto;
        this.tipus = tipus;
        this.evjarat = evjarat;
        this.ajtokSzama = ajtokSzama;
        this.szin = szin;
    }

    public Auto() {}

    public String getGyarto() {
        return gyarto;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getEvjarat() {
        return evjarat;
    }

    public void setEvjarat(int evjarat) {
        this.evjarat = evjarat;
    }

    public int getAjtokSzama() {
        return ajtokSzama;
    }

    public void setAjtokSzama(int ajtokSzama) {
        this.ajtokSzama = ajtokSzama;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }
}
