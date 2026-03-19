package P1DecoratorPattern.Ex1_CarDecorator;

public class BreakingSystemDecorator extends CarDecorator {
    public BreakingSystemDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3000;
    }

    @Override
    public int getSecurityLevel() {
        return super.getSecurityLevel() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Breaking System";
    }
}
