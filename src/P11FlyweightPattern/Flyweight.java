package P11FlyweightPattern;

/**
 * Interface Flyweight
 * <p>
 * In your Ex02_DungeonDragons, this corresponds to the **Character** interface.
 * <p>
 * It declares a method that accepts **Extrinsic State**.
 * Extrinsic State is the data that changes with every instance/context (e.g., the Weapon used, the Position, the Health).
 */
public interface Flyweight {
    /**
     * Performs an operation using extrinsic state.
     *
     * @param extrinsicState Context-specific data (e.g., "Weapon", "Position").
     *                       In Ex02, this is passed to the attack() method.
     */
    void operation(String extrinsicState);
}
