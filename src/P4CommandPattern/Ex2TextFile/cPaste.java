package P4CommandPattern.Ex2TextFile;

public class cPaste implements cMenuCommands{
    @Override
    public void execute(TextFile textFile){
        textFile.paste();
    }
}
