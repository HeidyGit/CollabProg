package ExamPreparation.Command.ValaisGame.Command;

import ExamPreparation.Command.ValaisGame.Context.ValaisGame;

public class CmdMove implements Command {
    private ValaisGame valaisGame;

    public CmdMove(ValaisGame valaisGame) {
        this.valaisGame = valaisGame;
    }

    @Override
    public void execute() {
        valaisGame.move();
    }
}
