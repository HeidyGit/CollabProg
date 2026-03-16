package P11FlyweightPattern;

import java.util.Arrays;

public abstract class Flyweight {
    private final long[] internalStorage = new long[10000000];

    public Flyweight() {
        Arrays.fill(internalStorage, 1);
    }

    public abstract void operation(long extrinsicState);
}
