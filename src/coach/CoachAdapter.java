package coach;

import move.Speak;

public class CoachAdapter implements Speak {

    private Coach coach;

    public CoachAdapter(Coach coach) {
        this.coach = coach;
    }

    @Override
    public void sayShoot() {
        coach.changeTacticsToShooting();
    }

    @Override
    public void sayPass() {
        coach.changeTacticsToPassing();
    }
}
