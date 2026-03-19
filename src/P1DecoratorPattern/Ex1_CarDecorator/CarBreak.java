package P1DecoratorPattern.Ex1_CarDecorator;

public class CarBreak extends BasicCar {
    public CarBreak() {
        super("Break Car");
    }

    @Override
    public double getPrice() {
        return 18000;
    }

    @Override
    public int getSecurityLevel() {
        return 4;
    }
}
