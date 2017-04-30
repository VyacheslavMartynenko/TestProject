package template;

public class Football extends Game {
    @Override
    public void start() {
        System.out.println("Football match was started.");
    }

    @Override
    public void rest() {
        System.out.println("Rest between times.");
    }

    @Override
    public void end() {
        System.out.println("Football match was ended.");
    }
}
