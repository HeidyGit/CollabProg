package P8BuilderPattern.Template;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.createNewProduct();
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }

}
