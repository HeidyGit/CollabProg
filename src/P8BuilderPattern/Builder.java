package P8BuilderPattern;

public abstract class Builder {
    protected Product product;

    public void createNewProduct(){
        this.product = new Product();
    }

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getResult(){
        return product;
    }
}
