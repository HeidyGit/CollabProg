package P1DecoratorPattern.Ex1_CarDecorator;

public class AirbagDecorator extends CarDecorator {

    public AirbagDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1000; // Adding cost of Airbag
    }

    @Override
    public int getSecurityLevel() {
        return super.getSecurityLevel() + 2; // Adding security points for Airbag
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Airbag";
    }
}
