package main;

import move.PassMove;
import move.ShootMove;
import move.TackleMove;
import player.Defender;
import player.Midfielder;
import player.Player;
import player.Striker;
import stadium.Stadium;

public class Main {

    public static void main(String[] args) {
        Stadium stadium = new Stadium();
        PassMove pass = new PassMove();
        ShootMove shoot = new ShootMove();
        TackleMove tackle = new TackleMove();

        Player defender = new Defender(tackle, stadium);
        System.out.println(Defender.class.getSimpleName() + " " + defender.moveBall());

        Player midfielder = new Midfielder(pass, stadium);
        System.out.println(Midfielder.class.getSimpleName() + " " + midfielder.moveBall());

        Player striker = new Striker(shoot, stadium);
        System.out.println(Striker.class.getSimpleName() + " " + striker.moveBall());

        midfielder.setMove(shoot);
        System.out.println(Midfielder.class.getSimpleName() + " " + midfielder.moveBall());

        System.out.println("\nGOAL!!!");
        stadium.notifyObserver(midfielder);

        System.out.println("\nWin!!!");
        stadium.notifyObservers();
    }
}
