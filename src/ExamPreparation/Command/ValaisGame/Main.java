package ExamPreparation.Command.ValaisGame;

import ExamPreparation.Command.ValaisGame.Context.ValaisGame;
import ExamPreparation.Command.ValaisGame.Invoker.MenuInvoker;
import ExamPreparation.Command.ValaisGame.Strategy.StrategyNax;
import ExamPreparation.Command.ValaisGame.Strategy.StrategyNendaz;
import ExamPreparation.Command.ValaisGame.Strategy.StrategySimplon;

public class Main {
    public static void main(String[] args) {
        ValaisGame myGame = new ValaisGame();
        myGame.setGameStragegy(new StrategyNax());
        MenuInvoker menuInvoker = new MenuInvoker(myGame);
        menuInvoker.callItem(2);
        menuInvoker.callItem(1);
        menuInvoker.callItem(0);
        myGame.setGameStragegy(new StrategyNendaz());
        menuInvoker.callItem(2);
        menuInvoker.callItem(1);
        menuInvoker.callItem(0);
        myGame.setGameStragegy(new StrategySimplon());
        menuInvoker.callItem(2);
        menuInvoker.callItem(1);
        menuInvoker.callItem(0);
    }
}