package ExamPreparation.Command.ValaisGame.Strategy;

public class StrategySimplon implements StrategyGame {

    @Override
    public void move() {
        System.out.println("Driving to Simplon pass.");
    }

    @Override
    public void end() {
        System.out.println("Ending the Simplon game.");
    }

    @Override
    public void setWinner() {
        System.out.println("Deciding about the winner of Simplon game.");
    }
}
