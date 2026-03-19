package P1DecoratorPattern.Ex1_CarDecorator;
//You can't decorate nothing, so you always start with a concrete car like this.
public class BasicCar implements Car {
    private String description = "Basic Car";

    public BasicCar() {}

    public BasicCar(String description) {
        this.description = description;
    }

    @Override
    public double getPrice() {
        return 10000;
    }

    @Override
    public int getSecurityLevel() {
        return 1;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
