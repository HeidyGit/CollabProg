package P6TemplatePattern.basicTemplateMethod;

public class ConcreteClass extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("Concrete operation 1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("Concrete operation 2");
    }
}
