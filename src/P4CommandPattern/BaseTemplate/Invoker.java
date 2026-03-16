package P4CommandPattern.BaseTemplate;

public class Invoker {
    private Command slot;

    public Invoker (){};
    public void setCommand(Command slot){
        this.slot = slot;
    }

    public void buttonWasPushed(){
        slot.execute();
    }
}
