package ExamPreparation.Command.ValaisGame.Invoker;

import ExamPreparation.Command.ValaisGame.Command.CmdEnd;
import ExamPreparation.Command.ValaisGame.Command.CmdMove;
import ExamPreparation.Command.ValaisGame.Command.CmdSetWinner;
import ExamPreparation.Command.ValaisGame.Command.Command;
import ExamPreparation.Command.ValaisGame.Context.ValaisGame;

import java.util.ArrayList;
import java.util.List;

public class MenuInvoker {
    public List<Command> commands = new ArrayList<Command>();

    public MenuInvoker(ValaisGame valaisGame) {
        commands.add(new CmdEnd(valaisGame));
        commands.add(new CmdSetWinner(valaisGame));
        commands.add(new CmdMove(valaisGame));
    }

    public void callItem(int index) {
        commands.get(index).execute();
    }
}

