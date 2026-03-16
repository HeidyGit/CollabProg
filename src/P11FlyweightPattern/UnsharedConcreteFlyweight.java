package P11FlyweightPattern;

public class UnsharedConcreteFlyweight extends Flyweight {
    private final long allState;

    public UnsharedConcreteFlyweight(long allState) {
        super();
        this.allState = allState;
    }

    @Override
    public void operation(long extrinsicState) {
        System.out.println("Unshared Flyweight " + allState +
                " calling operation with extrinsic state " + extrinsicState);
    }
}
