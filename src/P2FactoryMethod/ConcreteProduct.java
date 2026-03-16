package P2FactoryMethod;

public class ConcreteProduct implements Product {
    private final String category;
    public ConcreteProduct(String category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "ConcreteProduct{" +
                "category='" + category + '\'' +
                '}';
    }
}
