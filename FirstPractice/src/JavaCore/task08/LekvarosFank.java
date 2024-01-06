package JavaCore.task08;

public class LekvarosFank extends KlasszikusFank {
    private String gyumolcstartalom;

    public LekvarosFank() {
        super("kör", "kicsi", "lekváros", "liszt", true);
    }

    public void lekvartoltelekkeszites() {
        System.out.println("finom csokis");
    }

    public LekvarosFank(String alak, String méret, String ízesítés, String alapanyag, boolean díszítés, String gyumolcstartalom) {

        this.gyumolcstartalom = gyumolcstartalom;
    }

    public String getGyumolcstartalom() {
        return gyumolcstartalom;
    }

    public void setGyumolcstartalom(String gyumolcstartalom) {
        this.gyumolcstartalom = gyumolcstartalom;
    }

    @Override
    public String toString() {
        return "LekvarosFank{" +
                "gyumolcstartalom='" + gyumolcstartalom + '\'' +
                '}';
    }
}

