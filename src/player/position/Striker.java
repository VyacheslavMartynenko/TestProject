package player.position;

import move.type.Move;
import observer.Subject;
import style.type.Style;

public class Striker extends Player {
    public Striker(Move move, Style style, Subject subject) {
        super(move, style, subject);
    }
}
