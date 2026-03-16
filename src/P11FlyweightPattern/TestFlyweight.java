package P11FlyweightPattern;

import java.util.Random;
public class TestFlyweight {
    static Random rand = new Random();

    public static void main(String[] args) {
        int rounds = 100;
        System.out.println(" ----- Testing flyweights -----");
        testFlyweight(rounds);
        System.out.println(" ----- Testing without flyweights -----");
        testUnsharedFlyweight(rounds);
    }

    private static void testFlyweight(int rounds) {
        FlyweightFactory factory = new FlyweightFactory();
        for (int i = 0; i < rounds; i++) {
            Flyweight flyweight = factory.getFlyweight(rand.nextInt(10));
            flyweight.operation(i);
        }
    }

    private static void testUnsharedFlyweight(int rounds) {
        for (int i = 0; i < rounds; i++) {
            Flyweight flyweight = new UnsharedConcreteFlyweight(rand.nextInt());
            flyweight.operation(i);
        }
    }
}