package P4CommandPattern.BaseTemplate;

public class ConcreteCommand implements Command {
    Receiver receiver;
    public ConcreteCommand(Receiver r){
        this.receiver = r;
    }
    public void execute(){
        this.receiver.execute();
    }
}
