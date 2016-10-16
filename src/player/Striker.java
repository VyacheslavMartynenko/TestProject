package player;

import move.Move;
import observer.Subject;

public class Striker extends Player {
    public Striker(Move move, Subject subject) {
        super(move, subject);
    }
}
