package JavaCore.task12;

public class SemiFinal implements Sports, Event {

    private String eventName;
    private String location;
    private String homeTeam;
    private String awayTeam;
    private String sportType;

    public SemiFinal(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    @Override
    public void setEventName() {
        eventName = "Világbajnoki elődöntő";
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getLocation() {
        return "Puskás Aréna";
    }

    @Override
    public void setHomeTeam(String team) {

    }

    @Override
    public void setAwayTeam(String team) {

    }

    @Override
    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }
}
