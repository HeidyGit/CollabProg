package P11FlyweightPattern.Template;

/**
 * Class TestFlyweight (Client)
 * <p>
 * In your Ex02_DungeonDragons, this corresponds to the **Battle** class.
 * <p>
 * The client is responsible for managing the extrinsic state and passing it to the
 * flyweight objects when calling their operations.
 */
public class TestFlyweight {

    public static void main(String[] args) {
        // --- Simulating the Battle of 5000 creatures ---

        // These represent the possible INTRINSIC states (like Race, Eye Color, etc.)
        String[] intrinsicStates = {"Elf", "Orc", "Dwarf"};

        // These represent the EXTRINSIC states (like Weapon, Position, etc.)
        String[] extrinsicStates = {"Axe", "Sword", "Bow"};

        System.out.println("--- Creating 10 flyweight objects ---");
        for (int i = 0; i < 10; i++) {
            // 1. Get a shared flyweight from the factory based on its intrinsic state.
            String intrinsic = getRandom(intrinsicStates);
            Flyweight flyweight = FlyweightFactory.getFlyweight(intrinsic);

            // 2. Get the extrinsic state for this specific context.
            String extrinsic = getRandom(extrinsicStates);

            // 3. Call the operation, passing the extrinsic state.
            flyweight.operation(extrinsic);
        }

        System.out.println("\nTotal flyweight objects created in factory: " + FlyweightFactory.getFlyweightsCount());
        System.out.println("We created 10 objects, but only " + FlyweightFactory.getFlyweightsCount() + " were actually instantiated and shared.");

        System.out.println("\n--- Using an Unshared Flyweight (like the wizard) ---");
        Flyweight unsharedFlyweight = new UnsharedConcreteFlyweight("Unique Wizard State");
        unsharedFlyweight.operation("Magic Staff");
    }

    private static String getRandom(String[] array) {
        return array[(int) (Math.random() * array.length)];
    }
}
