package P4CommandPattern.Ex2TextFile;

public class cCopy implements cMenuCommands{
    @Override
    public void execute(TextFile textFile){
        textFile.copy();
    }
}
