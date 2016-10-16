package player.position;

import move.type.Move;
import observer.Observer;
import observer.Subject;
import style.type.Style;

public class Player implements Observer {
    private Move move;
    private Style style;

    Player(Move move, Style style, Subject subject) {
        this.move = move;
        this.style = style;
        subject.addObserver(this);
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public String moveBall() {
        return style.chooseStyle() + " " + move.moveBall();
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public void update() {
        System.out.println("Player greeted by stadium.");
    }
}
