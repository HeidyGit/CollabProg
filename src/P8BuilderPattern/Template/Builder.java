package P8BuilderPattern.Template;

public abstract class Builder {
    protected Product product;

    public void createNewProduct(){
        this.product = new Product();
    }

    //Metodes qui vont être herité en bas.
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getResult(){
        return product;
    }
}
