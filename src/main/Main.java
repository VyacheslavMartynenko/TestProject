package main;

import creation.AbstractFactory;
import creation.FactoryCreator;
import creation.FactoryType;
import move.type.Move;
import player.*;
import player.position.Defender;
import player.position.Midfielder;
import player.position.Player;
import player.position.Striker;
import stadium.Stadium;
import style.type.Style;

public class Main {

    public static void main(String[] args) {
        Stadium stadium = new Stadium();

        PlayerFactory playerFactory = new PlayerFactory();
        AbstractFactory normalFactory = new FactoryCreator().getFactory(FactoryType.NORMAL);
        AbstractFactory aggressiveFactory = new FactoryCreator().getFactory(FactoryType.AGGRESSIVE);

        Move normalMove = normalFactory.getMove();
        Move aggressiveMove = aggressiveFactory.getMove();
        Style normalStyle = normalFactory.getStyle();
        Style aggressiveStyle = aggressiveFactory.getStyle();

        Player defender = playerFactory.getPlayer(PlayerPosition.DEFENDER, normalMove, normalStyle, stadium);
        Player midfielder =  playerFactory.getPlayer(PlayerPosition.MIDFIELDER, normalMove, normalStyle, stadium);
        Player striker = playerFactory.getPlayer(PlayerPosition.STRIKER, aggressiveMove, aggressiveStyle, stadium);

        System.out.println(Defender.class.getSimpleName() + " " + defender.moveBall());
        System.out.println(Midfielder.class.getSimpleName() + " " + midfielder.moveBall());
        System.out.println(Striker.class.getSimpleName() + " " + striker.moveBall());

        midfielder.setMove(aggressiveMove);
        System.out.println(Midfielder.class.getSimpleName() + " " + midfielder.moveBall());

        System.out.println("\nGOAL!!!");
        stadium.notifyObserver(midfielder);

        System.out.println("\nWin!!!");
        stadium.notifyObservers();
    }
}
