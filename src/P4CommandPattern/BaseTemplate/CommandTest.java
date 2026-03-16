package P4CommandPattern.BaseTemplate;

public class CommandTest {
    public static void main(String[] args) {
        Invoker invoker = new Invoker ();
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        invoker.setCommand(command);
        invoker.buttonWasPushed();

    }


}
