package P1DecoratorPattern;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
        component.operation();

        Component component1 = new ConcreteComponent();
        component1 = new ConcreteDecoratorA(component1);
        component1.operation();
        /*component1 = new ConcreteDecoratorB(component1);
        component1.operation();*/
    }
}
