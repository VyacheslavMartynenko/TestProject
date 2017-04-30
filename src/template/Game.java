package template;

public abstract class Game {

    public abstract void start();
    public abstract void rest();
    public abstract void end();

    public final void play() {
        start();
        rest();
        end();
    }

}
