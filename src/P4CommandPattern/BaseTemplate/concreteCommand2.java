package P4CommandPattern.BaseTemplate;

public class concreteCommand2 implements Command {
    Receiver receiver;
    public concreteCommand2(Receiver r){
        this.receiver = r;
    }
    public void execute(){
        this.receiver.execute();
    }
}
