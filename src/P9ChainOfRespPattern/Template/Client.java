package P9ChainOfRespPattern.Template;

public class Client {
    public static void main(String[] args) {
        Handler firstHandler = new ConcreteHandler1();
        Handler secondHandler = new ConcreteHandler2();
        Handler thirdHandler = new ConcreteHandler3();

        //possible de faire la list dinamique
        firstHandler.setSuccessor(secondHandler);
        secondHandler.setSuccessor(thirdHandler);

        firstHandler.handleRequest(new Request("dog"));
        firstHandler.handleRequest(new Request("yellow"));
    }
}
