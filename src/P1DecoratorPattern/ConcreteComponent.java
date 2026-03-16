package P1DecoratorPattern;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("Concrete operation");
    }

}
