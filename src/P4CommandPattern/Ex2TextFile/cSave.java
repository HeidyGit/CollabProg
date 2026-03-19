package P4CommandPattern.Ex2TextFile;

public class cSave implements cMenuCommands{
    @Override
    public void execute(TextFile textFile){
        textFile.save();
    }
}
