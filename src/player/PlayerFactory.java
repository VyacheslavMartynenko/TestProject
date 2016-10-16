package player;

import move.type.Move;
import observer.Subject;
import player.position.Defender;
import player.position.Midfielder;
import player.position.Player;
import player.position.Striker;

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
