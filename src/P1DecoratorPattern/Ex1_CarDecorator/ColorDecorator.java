package P1DecoratorPattern.Ex1_CarDecorator;

public class ColorDecorator extends CarDecorator {
    public ColorDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 500;
    }

    @Override
    public int getSecurityLevel() {
        return super.getSecurityLevel();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Color";
    }
}
