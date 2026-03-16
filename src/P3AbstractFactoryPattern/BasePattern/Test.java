package P3AbstractFactoryPattern.BasePattern;

public class Test {
    public static void main(String[] args) {
        Client client = new Client(new ConcreteFactory1());
        client.setUp();
        System.out.println(client);
    }
}
