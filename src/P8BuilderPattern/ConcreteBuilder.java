package P8BuilderPattern;

public class ConcreteBuilder extends Builder{
    @Override
    public void buildPartA() {
        product.setPartA("material 1 ");
        System.out.println("Part A is created");
    }

    @Override
    public void buildPartB() {
        product.setPartB("material 2 ");
        System.out.println("Part B is created");
    }

    @Override
    public void buildPartC() {
        product.setPartc("material 3 ");
        System.out.println("Part C is created");
    }

}
