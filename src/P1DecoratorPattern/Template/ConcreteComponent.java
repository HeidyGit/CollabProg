package P1DecoratorPattern.Template;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("Concrete operation");
    }

}
