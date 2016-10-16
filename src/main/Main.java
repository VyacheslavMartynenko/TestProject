package main;

import move.*;
import player.*;
import stadium.Stadium;

public class Main {

    public static void main(String[] args) {
        Stadium stadium = new Stadium();

        PlayerFactory playerFactory = new PlayerFactory();
        MoveFactory moveFactory = new MoveFactory();

        Move tackle = moveFactory.getMove(MoveType.TACKLE);
        Move pass = moveFactory.getMove(MoveType.PASS);
        Move shoot = moveFactory.getMove(MoveType.SHOOT);

        Player defender = playerFactory.getPlayer(PlayerPosition.DEFENDER, tackle, stadium);
        Player midfielder =  playerFactory.getPlayer(PlayerPosition.MIDFIELDER, pass, stadium);
        Player striker = playerFactory.getPlayer(PlayerPosition.STRIKER, shoot, stadium);

        System.out.println(Defender.class.getSimpleName() + " " + defender.moveBall());
        System.out.println(Midfielder.class.getSimpleName() + " " + midfielder.moveBall());
        System.out.println(Striker.class.getSimpleName() + " " + striker.moveBall());

        midfielder.setMove(shoot);
        System.out.println(Midfielder.class.getSimpleName() + " " + midfielder.moveBall());

        System.out.println("\nGOAL!!!");
        stadium.notifyObserver(midfielder);

        System.out.println("\nWin!!!");
        stadium.notifyObservers();
    }
}
