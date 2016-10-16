package move;

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
