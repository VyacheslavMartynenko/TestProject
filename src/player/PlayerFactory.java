package player;

import move.type.Move;
import observer.Subject;
import player.position.Defender;
import player.position.Midfielder;
import player.position.Player;
import player.position.Striker;
import style.type.Style;

public class PlayerFactory {
    public Player getPlayer(PlayerPosition playerPosition, Move move, Style style, Subject subject) {
        switch (playerPosition) {
            case DEFENDER:
                return new Defender(move, style, subject);
            case MIDFIELDER:
                return new Midfielder(move, style, subject);
            case STRIKER:
                return new Striker(move, style, subject);
            default:
                return null;
        }
    }
}
