package pl.edu.vistula.task2;

public class TrafficLightSimulator {
    private TrafficLightColor currentColor;

    public TrafficLightSimulator(TrafficLightColor startColor) {
        this.currentColor = startColor;
    }

    public void changeColor() {
        switch (currentColor) {
            case RED:
                currentColor = TrafficLightColor.GREEN;
                break;
            case GREEN:
                currentColor = TrafficLightColor.YELLOW;
                break;
            case YELLOW:
                currentColor = TrafficLightColor.RED;
                break;
        }
    }

    public TrafficLightColor getCurrentColor() {
        return currentColor;
    }

    public String toString() {
        return "Current light: " + currentColor;
    }
}