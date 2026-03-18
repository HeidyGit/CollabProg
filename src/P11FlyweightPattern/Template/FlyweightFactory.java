package P11FlyweightPattern.Template;

import java.util.HashMap;
import java.util.Map;

/**
 * Class FlyweightFactory
 * <p>
 * In your Ex02_DungeonDragons, this corresponds to the **CharacterFactory**.
 * <p>
 * This factory is the heart of the pattern. It ensures that flyweight objects are shared.
 * When a client requests a flyweight, the factory checks if one with the same
 * intrinsic state already exists. If so, it returns the existing instance; otherwise,
 * it creates a new one.
 */
public class FlyweightFactory {

    /**
     * The pool of shared flyweights. The key is the intrinsic state.
     * In Ex02, the key is a combination of Race, Eye Color, etc.
     */
    private static final Map<String, Flyweight> flyweights = new HashMap<>();

    /**
     * Gets a shared flyweight object.
     *
     * @param key The intrinsic state of the desired flyweight.
     * @return A shared ConcreteFlyweight instance.
     */
    public static Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweights.get(key);

        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }

    /**
     * Helper method to show how many objects are in the cache.
     */
    public static int getFlyweightsCount() {
        return flyweights.size();
    }
}
