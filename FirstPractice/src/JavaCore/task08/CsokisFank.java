package JavaCore.task08;

public class CsokisFank extends KlasszikusFank {
    private String kakaotartalom;

    public CsokisFank(){
        super("kör", "nagy", "csokis", "liszt", false);
    }

    public void csokitoltelekkeszites(){
        System.out.println("finom csokis");
    }

    public CsokisFank(String alak, String méret, String ízesítés, String alapanyag, boolean díszítés, String kakaotartalom) {
        this.kakaotartalom = kakaotartalom;
    }

    public String getKakaotartalom() {
        return kakaotartalom;
    }

    public void setKakaotartalom(String kakaotartalom) {
        this.kakaotartalom = kakaotartalom;
    }

    @Override
    public String toString() {
        return "CsokisFank{" +
                "kakaotartalom='" + kakaotartalom + '\'' +
                '}';
    }
}
