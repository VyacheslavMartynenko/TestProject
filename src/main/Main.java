package main;

import advert.StadiumAdvert;
import advert.VideoInfo;
import coach.Coach;
import coach.CoachAdapter;
import cook.Cooker;
import creation.AbstractFactory;
import creation.FactoryCreator;
import creation.FactoryType;
import move.type.Move;
import player.*;
import player.position.Defender;
import player.position.Midfielder;
import player.position.Player;
import player.position.Striker;
import scoreboard.Scoreboard;
import scoreboard.ScoreboardButton;
import scoreboard.ScoreboardOff;
import scoreboard.ScoreboardOn;
import stadium.Stadium;
import stadium.StadiumWithRoof;
import style.type.Style;
import template.Football;
import template.Game;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Game game = new Football();
        game.start();
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
        Player midfielder = playerFactory.getPlayer(PlayerPosition.MIDFIELDER, normalMove, normalStyle, stadiumWithRoof);
        Player striker = playerFactory.getPlayer(PlayerPosition.STRIKER, aggressiveMove, aggressiveStyle, stadiumWithRoof);

        System.out.println("Stadium: " + mainStadium.getName() + ", capacity: " + mainStadium.getCapacity() + ".\n");

        Cooker cooker = new Cooker();
        cooker.makeDrinks();
        cooker.makeSnacks();
        cooker.makePizza();
        System.out.println();

        Scoreboard scoreboard = new Scoreboard();
        ScoreboardOn scoreboardOn = new ScoreboardOn(scoreboard);
        ScoreboardButton scoreboardButton = new ScoreboardButton(scoreboardOn);
        scoreboardButton.press();

        StadiumAdvert stadiumAdvert = new StadiumAdvert(new VideoInfo());
        stadiumAdvert.giveAdvert();

        Coach coach = new Coach();
        CoachAdapter coachAdapter = new CoachAdapter(coach);

        System.out.println(Defender.class.getSimpleName() + " " + defender.moveBall());
        striker.sayPass();
        System.out.println(Midfielder.class.getSimpleName() + " " + midfielder.moveBall());
        coachAdapter.sayShoot();
        System.out.println(Striker.class.getSimpleName() + " " + striker.moveBall());

        System.out.println();
        game.rest();
        System.out.println();
        
        midfielder.setMove(aggressiveMove);
        System.out.println(Midfielder.class.getSimpleName() + " " + midfielder.moveBall());

        System.out.println("\nGOAL!!!");
        stadiumWithRoof.notifyObserver(midfielder);

        System.out.println("\nWin!!!");
        stadiumWithRoof.notifyObservers();

        ScoreboardOff scoreboardOff = new ScoreboardOff(scoreboard);
        scoreboardButton = new ScoreboardButton(scoreboardOff);
        scoreboardButton.press();

        Striker benchStriker = (Striker) striker.clone();
        Midfielder benchMidfielder = (Midfielder) midfielder.clone();
        System.out.println("\nBench styles: " + benchMidfielder.getStyle().chooseStyle()
                + ", " + benchStriker.getStyle().chooseStyle() + ".");

        game.end();
    }
}
