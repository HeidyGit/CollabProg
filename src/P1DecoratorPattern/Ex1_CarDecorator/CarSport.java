package P1DecoratorPattern.Ex1_CarDecorator;

public class CarSport extends BasicCar {
    public CarSport() {
        super("Sport Car");
    }

    @Override
    public double getPrice() {
        return 25000;
    }

    @Override
    public int getSecurityLevel() {
        return 3;
    }
}
