package P1DecoratorPattern.Ex1_CarDecorator;

public class CarBerlin extends BasicCar {
    public CarBerlin() {
        super("Berlin Car");
    }

    @Override
    public double getPrice() {
        return 15000;
    }

    @Override
    public int getSecurityLevel() {
        return 2;
    }
}
