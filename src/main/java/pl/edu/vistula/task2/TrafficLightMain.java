package pl.edu.vistula.task2;

public class TrafficLightMain {
    public static void main(String[] args) {
        TrafficLightSimulator simulator = new TrafficLightSimulator(TrafficLightColor.RED);

        for (int i = 0; i < 15; i++) {
            System.out.println(simulator.toString());
            simulator.changeColor();
        }
    }
}