package P11FlyweightPattern;

/**
 * Class UnsharedConcreteFlyweight
 * <p>
 * In your Ex02_DungeonDragons, this corresponds to the **wizard** class.
 * <p>
 * This is an object that is NOT shared by the Flyweight Factory. It's a special case,
 * a unique instance that doesn't fit the shared model but still needs to be used
 * alongside the flyweight objects.
 */
public class UnsharedConcreteFlyweight implements Flyweight {

    /**
     * All state is stored within the unshared flyweight.
     * It does not need to distinguish between intrinsic and extrinsic state
     * because it is not shared.
     */
    private final String allState;

    public UnsharedConcreteFlyweight(String allState) {
        this.allState = allState;
    }

    /**
     * The operation for an unshared flyweight might not need extrinsic state,
     * or it might use it differently.
     *
     * @param extrinsicState Context-specific data (may be ignored or used).
     */
    @Override
    public void operation(String extrinsicState) {
        System.out.println("UnsharedConcreteFlyweight with All State '" + allState +
                "' is performing an operation with Extrinsic State '" + extrinsicState + "'.");
    }
}
