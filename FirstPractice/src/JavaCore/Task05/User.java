package JavaCore.Task05;

public class User {
    private String email;
    private String nev;
    private int szuletesi_ido;
    private int telefonszam;
    private String munkahely;

    public User(String email, String nev, int szuletesi_ido) {
        this.email = email;
        this.nev = nev;
        this.szuletesi_ido = szuletesi_ido;
    }

    public int getTelefonszam() {
        return telefonszam;
    }

    public void setTelefonszam(int telefonszam) {
        this.telefonszam = telefonszam;
    }

    public String getMunkahely() {
        return munkahely;
    }

    public void setMunkahely(String munkahely) {
        this.munkahely = munkahely;
    }

    @Override
    public String toString() {
        return "RegistrationPage{" +
                "nev='" + nev + '\'' +
                ", email='" + email + '\'' +
                ", szuletesi_ido=" + szuletesi_ido +
                ", telefonszam=" + telefonszam +
                ", munkahely='" + munkahely + '\'' +
                '}';
    }
}
