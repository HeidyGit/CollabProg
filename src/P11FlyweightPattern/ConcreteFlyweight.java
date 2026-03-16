package P11FlyweightPattern;

public class ConcreteFlyweight extends Flyweight {
    private final long intrinsicState;

    public ConcreteFlyweight(long intrinsicState) {
        super();
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(long extrinsicState) {
        System.out.println("Flyweight " + intrinsicState +
                " calling operation with extrinsic state " + extrinsicState);
    }
}
