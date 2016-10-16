package player;

import move.Move;
import observer.Subject;

public class PlayerFactory {
    public Player getPlayer(PlayerPosition playerPosition, Move move, Subject subject) {
        switch (playerPosition) {
            case DEFENDER:
                return new Defender(move, subject);
            case MIDFIELDER:
                return new Midfielder(move, subject);
            case STRIKER:
                return new Striker(move, subject);
            default:
                return null;
        }
    }
}
