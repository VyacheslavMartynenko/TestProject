package player.position;

import move.type.Move;
import observer.Observer;
import observer.Subject;

public class Player implements Observer {
    private Move move;

    Player(Move move, Subject subject) {
        this.move = move;
        subject.addObserver(this);
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public String moveBall() {
        return move.moveBall();
    }

    @Override
    public void update() {
        System.out.println("Player greeted by stadium.");
    }
}
