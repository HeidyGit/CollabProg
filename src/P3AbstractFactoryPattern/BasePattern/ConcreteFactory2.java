package P3AbstractFactoryPattern.BasePattern;

public class ConcreteFactory2 implements abstractFactory{
    @Override
    public abstractProductA createProductA() {
        return new ProductA2();
    }
    @Override
    public abstractProductB createProductB() {
        return new ProductB2();
    }
}
