package move;

import move.type.Move;
import move.type.PassMove;
import move.type.ShootMove;
import move.type.TackleMove;

public class MoveFactory {
    public Move getMove(MoveType moveType) {
        switch (moveType) {
            case TACKLE:
                return new TackleMove();
            case PASS:
                return new PassMove();
            case SHOOT:
                return new ShootMove();
            default:
                return null;
        }
    }
}
