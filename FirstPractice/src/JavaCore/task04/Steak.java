package JavaCore.task04;

public class Steak {
    private String hustipus;
    private int sutesi_ido;
    private String sutesi_mod;
    private String fuszerezes;
    private String pacolas;

    public Steak(String hustipus, int sutesi_ido, String sutesi_mod, String fuszerezes, String pacolas) {
        this.hustipus = hustipus;
        this.sutesi_ido = sutesi_ido;
        this.sutesi_mod = sutesi_mod;
        this.fuszerezes = fuszerezes;
        this.pacolas = pacolas;
    }

    public String getHustipus() {
        return hustipus;
    }

    public void setHustipus(String hustipus) {
        this.hustipus = hustipus;
    }

    public int getSutesi_ido() {
        return sutesi_ido;
    }

    public void setSutesi_ido(int sutesi_ido) {
        this.sutesi_ido = sutesi_ido;
    }

    public String getSutesi_mod() {
        return sutesi_mod;
    }

    public void setSutesi_mod(String sutesi_mod) {
        this.sutesi_mod = sutesi_mod;
    }

    public String getFuszerezes() {
        return fuszerezes;
    }

    public void setFuszerezes(String fuszerezes) {
        this.fuszerezes = fuszerezes;
    }

    public String getPacolas() {
        return pacolas;
    }

    public void setPacolas(String pacolas) {
        this.pacolas = pacolas;
    }

    @Override
    public String toString() {
        return "Steak{" +
                "hustipus='" + hustipus + '\'' +
                ", sutesi_ido=" + sutesi_ido +
                ", sutesi_mod='" + sutesi_mod + '\'' +
                ", fuszerezes='" + fuszerezes + '\'' +
                ", pacolas='" + pacolas + '\'' +
                '}';
    }
}
