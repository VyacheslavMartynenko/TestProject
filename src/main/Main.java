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
import stadium.StadiumWithRoof;
import style.type.Style;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Stadium mainStadium = new Stadium.StadiumBuilder("Old Trafford", 82000).observers(new ArrayList<>()).build();
        StadiumWithRoof stadiumWithRoof = new StadiumWithRoof(mainStadium);

        PlayerFactory playerFactory = new PlayerFactory();
        AbstractFactory normalFactory = new FactoryCreator().getFactory(FactoryType.NORMAL);
        AbstractFactory aggressiveFactory = new FactoryCreator().getFactory(FactoryType.AGGRESSIVE);

        Move normalMove = normalFactory.getMove();
        Move aggressiveMove = aggressiveFactory.getMove();
        Style normalStyle = normalFactory.getStyle();
        Style aggressiveStyle = aggressiveFactory.getStyle();

        Player defender = playerFactory.getPlayer(PlayerPosition.DEFENDER, normalMove, normalStyle, stadiumWithRoof);
        Player midfielder =  playerFactory.getPlayer(PlayerPosition.MIDFIELDER, normalMove, normalStyle, stadiumWithRoof);
        Player striker = playerFactory.getPlayer(PlayerPosition.STRIKER, aggressiveMove, aggressiveStyle, stadiumWithRoof);

        System.out.println("Stadium: " +  mainStadium.getName() + ", capacity: " + mainStadium.getCapacity() + ".\n");

        System.out.println(Defender.class.getSimpleName() + " " + defender.moveBall());
        System.out.println(Midfielder.class.getSimpleName() + " " + midfielder.moveBall());
        System.out.println(Striker.class.getSimpleName() + " " + striker.moveBall());

        midfielder.setMove(aggressiveMove);
        System.out.println(Midfielder.class.getSimpleName() + " " + midfielder.moveBall());

        System.out.println("\nGOAL!!!");
        stadiumWithRoof.notifyObserver(midfielder);

        System.out.println("\nWin!!!");
        stadiumWithRoof.notifyObservers();

        Striker benchStriker = (Striker) striker.clone();
        Midfielder benchMidfielder = (Midfielder) midfielder.clone();
        System.out.println("\nBench styles: " + benchMidfielder.getStyle().chooseStyle()
                + ", " + benchStriker.getStyle().chooseStyle() + ".");
    }
}
