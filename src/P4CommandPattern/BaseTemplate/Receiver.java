package P4CommandPattern.BaseTemplate;

public class Receiver implements Command{
    Invoker i;

    public void executeInCommannd(Invoker invoker){
        this.i = invoker;
    }


    public void excecute(){
        i.buttonWasPushed();
    };

    @Override
    public void execute() {

    }
}
