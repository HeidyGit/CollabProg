package P3AbstractFactoryPattern.BasePattern;

public class Client {
    private abstractFactory abstractFactory;
    private abstractProductA ProductA;
    private abstractProductB ProductB;

    public Client (abstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void setUp() {
        ProductA = abstractFactory.createProductA();
        ProductB = abstractFactory.createProductB();
    }

    @Override
    public String toString() {
        return "Client{" +
                "ProductA=" + ProductA +
                ", ProductB=" + ProductB +
                '}';
    }
}
