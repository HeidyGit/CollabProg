package P11FlyweightPattern.Template;

/**
 * Class ConcreteFlyweight
 * <p>
 * In your Ex02_DungeonDragons, this corresponds to the **creature** class.
 * <p>
 * This is the shared object. It stores **Intrinsic State**, which is constant and shared among many instances.
 * Any instance-specific data (Extrinsic State) is passed in via methods.
 */
public class ConcreteFlyweight implements Flyweight {

    /**
     * Intrinsic State: This data is constant and shared.
     * In Ex02, this corresponds to properties like Race, Eye Color, Hair Color, etc.
     * These are the properties used as a key in the FlyweightFactory.
     */
    private final String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
        System.out.println("ConcreteFlyweight created with state: " + intrinsicState);
    }

    /**
     * The operation method uses both intrinsic state (stored in the object)
     * and extrinsic state (passed as an argument).
     *
     * @param extrinsicState Context-specific data (e.g., "Weapon").
     */
    @Override
    public void operation(String extrinsicState) {
        System.out.println("ConcreteFlyweight with Intrinsic State '" + intrinsicState +
                "' is performing an operation with Extrinsic State '" + extrinsicState + "'.");
    }
}
