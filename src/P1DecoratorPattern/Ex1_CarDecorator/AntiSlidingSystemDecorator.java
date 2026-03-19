package P1DecoratorPattern.Ex1_CarDecorator;

public class AntiSlidingSystemDecorator extends CarDecorator {
    public AntiSlidingSystemDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2000;
    }

    @Override
    public int getSecurityLevel() {
        return super.getSecurityLevel() + 4;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Anti-Sliding System";
    }
}
