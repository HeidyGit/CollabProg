package P10MementoPattern.Ex01VideoGame;

import P10MementoPattern.Ex01VideoGame.CareTaker;

public class TestGame {
    public static void main (String[] args){
        Player player = new Player(0,0,0);
        Game game = new Game();
        CareTaker careTaker = new CareTaker();

        game.setPlayer(player);
        printStates (game);

        game.movePlayerTo(1,1);
        game.increaseScore(100);
        System.out.println("Player moves to: (" + game.getPlayer().getX()  + "," + game.getPlayer().getY() + ") gain +"+ 100);
        printStates (game);
        careTaker.saveState(game.createState());


        game.movePlayerTo(2,2);
        printStates (game);
        careTaker.saveState(game.createState());

        game.movePlayerTo(6,6);
        game.increaseScore(100);
        System.out.println("Player moves to: (" + game.getPlayer().getX()  + "," + game.getPlayer().getY() + ") gain +"+ 100 );
        printStates (game);

        System.out.println("Player dies restore point");
        careTaker.revert(game);
        printStates (game);



    }

    public static void printStates(Game game){

        System.out.println("Player position:" + game.getPlayer().getX() + "," + game.getPlayer().getY() );
        System.out.println("Player score:" + game.getPlayer().getScore());
    }
}
