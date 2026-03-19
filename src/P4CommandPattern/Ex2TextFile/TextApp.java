package P4CommandPattern.Ex2TextFile;

public class TextApp {
    public static void main (String[] args){
        Menu menu = new Menu();
        TextFile textfile = new TextFile("My doc file");

        menu.setCommands(new cOpen(), 1);
        menu.setCommands(new cClose(), 2);
        menu.setCommands(new cCopy(), 3);
        menu.setCommands(new cPaste(), 4);

        menu.callMenuItem(1, textfile);
        menu.callMenuItem(3, textfile);
        menu.callMenuItem(4, textfile);
        menu.callMenuItem(2, textfile);
    }
}
