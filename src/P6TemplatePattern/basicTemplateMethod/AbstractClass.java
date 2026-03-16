package P6TemplatePattern.basicTemplateMethod;

public abstract class AbstractClass {
    final void templateMethod() {
        primitiveOperation1();
        notPrimitiveOperation();
        primitiveOperation2();
    }

    private void notPrimitiveOperation() {
        System.out.println("Do some common job");
    }

    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();
}
