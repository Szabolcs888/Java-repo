package JavaCore.task0000;

public class MunkavallaloExamlpleMain {
    public static void main(String[] args) {

        Munkavallalo anonymus = new Munkavallalo();
        Munkavallalo bob = new Munkavallalo("Bob");
        Munkavallalo kati = new Munkavallalo("Kati", "Fejleszto");

        System.out.println(anonymus.getNev());
        System.out.println(bob.getNev());

        System.out.println(kati.getNev());
        System.out.println(kati.getSzerepkor());
    }
}
