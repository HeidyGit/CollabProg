package P10MementoPattern.Ex01VideoGame;

import P10MementoPattern.Template.Originator;

import java.util.Stack;

public class CareTaker {
    Stack<Game.GameState> checkpoint = new Stack<Game.GameState>();

    public void saveState (Game.GameState state){
        checkpoint.push(state);
    }

    public void revert (Game game){
        if(!checkpoint.isEmpty()){
            game.restore(checkpoint.pop());
        }else{
            System.out.println("Cannot undo !");
        }
    }

}
