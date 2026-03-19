package P4CommandPattern.Ex2TextFile;

public class cOpen implements cMenuCommands {

    @Override
    public void execute(TextFile textFile){
        textFile.open();
    }

}
