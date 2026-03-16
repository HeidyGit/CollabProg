package P1DecoratorPattern;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
            super(component);
    }

    @Override
    public void operation() {
        System.out.println("I am adding some new responsabilies here.");
        super.operation();
    }
}
