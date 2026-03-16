package P2FactoryMethod;

public abstract class Creator {
    //abstract method
    abstract public Product factoryMethod();

    public void anOperation(){
        Product product = this.factoryMethod();
        System.out.println("Do something with product " + product.toString());
    }
}
