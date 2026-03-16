package P3AbstractFactoryPattern.BasePattern;

public class ConcreteFactory1 implements abstractFactory{
    @Override
    public abstractProductA createProductA() {
        return new ProductA();
    }
    @Override
    public abstractProductB createProductB() {
        return new ProductB();
    }
}
