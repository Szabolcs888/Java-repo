package JavaCore.task08;

public class KlasszikusFank {
    private String alak;
    private String méret;
    private String ízesítés;
    private String alapanyag;
    private boolean díszítés;

    public KlasszikusFank(String alak, String méret, String ízesítés, String alapanyag, boolean díszítés) {
        this.alak = alak;
        this.méret = méret;
        this.ízesítés = ízesítés;
        this.alapanyag = alapanyag;
        this.díszítés = díszítés;
    }

    public void elfogy() {
        System.out.println("elfogyott sajnos");
    }

    public void ízélmény() {
        System.out.println("nagyon finom");
    }

    public void megkel() {
        System.out.println("gyorsan megkel");
    }

    public void táplál() {
        System.out.println("nagyon tápláló");
    }

    public void hízlal() {
        System.out.println("kissé hízlal");
    }

    public KlasszikusFank() {

    }

    public String getAlak() {
        return alak;
    }

    public void setAlak(String alak) {
        this.alak = alak;
    }

    public String getMéret() {
        return méret;
    }

    public void setMéret(String méret) {
        this.méret = méret;
    }

    public String getÍzesítés() {
        return ízesítés;
    }

    public void setÍzesítés(String ízesítés) {
        this.ízesítés = ízesítés;
    }

    public String getAlapanyag() {
        return alapanyag;
    }

    public void setAlapanyag(String alapanyag) {
        this.alapanyag = alapanyag;
    }

    public boolean isDíszítés() {
        return díszítés;
    }

    public void setDíszítés(boolean díszítés) {
        this.díszítés = díszítés;
    }

    @Override
    public String toString() {
        return "KlasszikusFank{" +
                "alak='" + alak + '\'' +
                ", méret='" + méret + '\'' +
                ", ízesítés='" + ízesítés + '\'' +
                ", alapanyag='" + alapanyag + '\'' +
                ", díszítés=" + díszítés +
                '}';
    }
}

