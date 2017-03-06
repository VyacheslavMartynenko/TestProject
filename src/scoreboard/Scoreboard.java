package scoreboard;

public class Scoreboard implements Device {
    @Override
    public void on() {
        System.out.println("Scoreboard on.");
    }

    @Override
    public void off() {
        System.out.println("Scoreboard off.");
    }
}
