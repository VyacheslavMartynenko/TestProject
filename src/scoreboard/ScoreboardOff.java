package scoreboard;

public class ScoreboardOff implements Command {
    private Scoreboard scoreboard;

    public ScoreboardOff(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
    }

    @Override
    public void execute() {
        scoreboard.off();
    }
}
