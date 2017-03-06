package scoreboard;

public class ScoreboardOn implements Command {
    private Scoreboard scoreboard;

    public ScoreboardOn(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
    }

    @Override
    public void execute() {
        scoreboard.on();
    }
}
