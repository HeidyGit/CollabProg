package P1DecoratorPattern.Ex1_CarDecorator;

public class EngineDecorator extends CarDecorator {
    public EngineDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5000;
    }

    @Override
    public int getSecurityLevel() {
        return super.getSecurityLevel() + 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Engine";
    }
}
