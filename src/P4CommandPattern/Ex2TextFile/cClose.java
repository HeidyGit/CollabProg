package P4CommandPattern.Ex2TextFile;

public class cClose implements cMenuCommands{
    @Override
    public void execute(TextFile textFile){
        textFile.close();
    }
}
