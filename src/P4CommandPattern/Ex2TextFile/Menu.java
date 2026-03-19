package P4CommandPattern.Ex2TextFile;

import P4CommandPattern.Ex01CarGAme.cGameCommands;

public class Menu {
    private final cMenuCommands[] myCommands = new cMenuCommands[5];

    public void setCommands(cMenuCommands commands, int key) {
        myCommands[key] = commands;
    }

    public void callMenuItem(int key, TextFile textFile){
        myCommands[key].execute(textFile);
    }


}
