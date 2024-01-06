package JavaCore.task05T;

public class User {
    /*
    (Órai) Regisztrációs lap. Egy közösségi oldal regisztrációs űrlapját kell elkészíteni. Készíts egy POJO-t amely
    magába foglalja a következő információkat a felhasználóról:
     - email
     - név
     - születési idő
     - telefonszám
     - munkahely
    A sikeres regisztrációhoz kötelező megadni az email címet, nevet, illetve a születési dátumot. A többi adatot
    opcionálisan adhatja meg a felhasználó.
    Készíts olyan osztályt, amely rendelkezik a megfelelő konstruktorokkal, illetve getter és setter metódusokkal.
    Ha egy felhasználó nem rendelkezik a megfelelő adatokkal, a program írjon ki hibaüzentet. Abban az esetben, ha a
    felhasználó kitöltötte a kötelező mezőket, a program írja ki az összes megadott adatot.

     */
    private String e_mail;
    private String name;
    private String birthday;
    private String phone;
    private String company;

    public User(String e_mail, String name, String birthday) {
        this.e_mail = e_mail;
        this.name = name;
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + e_mail + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone=" + phone +
                ", company='" + company + '\'' +
                '}';
    }
}
