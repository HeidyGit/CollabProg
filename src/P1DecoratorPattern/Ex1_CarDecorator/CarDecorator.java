package P1DecoratorPattern.Ex1_CarDecorator;
//This is a base decorator
/*The decorator pattern uses a base abstract class that implements the same interface as the
objects it decorates. This allows us to wrap our BasicCar with different features.*/
public abstract class CarDecorator implements Car {
    protected Car decoratedCar;

    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public String getDescription() {
        return "This is a car";
    }

    @Override
    public double getPrice() {

        return decoratedCar.getPrice();
    }

    @Override
    public int getSecurityLevel() {
        return decoratedCar.getSecurityLevel();
    }
}
