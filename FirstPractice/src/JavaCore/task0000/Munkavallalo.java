package JavaCore.task0000;

public class Munkavallalo {
    private String nev;
    private String szerepkor;


    public Munkavallalo() {
    }

    public Munkavallalo(String nev) {
        this.nev = nev;
    }

    public Munkavallalo(String nev, String szerepkor) {
            this.nev = nev;
            this.szerepkor = szerepkor;
        }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getSzerepkor() {
        return szerepkor;
    }

    public void setSzerepkor(String szerepkor) {
        this.szerepkor = szerepkor;
    }
}

