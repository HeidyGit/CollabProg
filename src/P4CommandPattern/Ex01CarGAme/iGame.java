package P4CommandPattern.Ex01CarGAme;

public class iGame {
    private final cGameCommands[] myCommands = new cGameCommands[4];
    private cGameCommands undoCommand;

    public void pushKey(int key){
        myCommands[key].execute();
        undoCommand = myCommands[key]; //remember last action
    };

    public void setCommandKey(cGameCommands commands, int key){
        myCommands[key] = commands;
    }

    public void undo(){
        System.out.println("undo command to:");
        undoCommand.undo();
    };
}
