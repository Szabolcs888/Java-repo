package JavaCore.task07;

public class RacerCar extends Car{
    private boolean hasExtraBody;
    private boolean hasExtraFireSystem;

    public RacerCar(boolean hasExtraBody, boolean hasExtraFireSystem) {
        this.hasExtraBody = hasExtraBody;
        this.hasExtraFireSystem = hasExtraFireSystem;
    }

    public RacerCar(){
    }

    public boolean isHasExtraBody() {
        return hasExtraBody;
    }

    public void setHasExtraBody(boolean hasExtraBody) {
        this.hasExtraBody = hasExtraBody;
    }

    public boolean isHasExtraFireSystem() {
        return hasExtraFireSystem;
    }

    public void setHasExtraFireSystem(boolean hasExtraFireSystem) {
        this.hasExtraFireSystem = hasExtraFireSystem;
    }

    @Override
    public String toString() {
        return "RacerCar{" +
                "hasExtraBody=" + hasExtraBody +
                ", hasExtraFireSystem=" + hasExtraFireSystem +
                '}';
    }
}
