package scoreboard;

public class ScoreboardButton {
    Command command;

    public ScoreboardButton(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
