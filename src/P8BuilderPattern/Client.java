package P8BuilderPattern;

public class Client {
    public static void main (String[] args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director();
        director.setBuilder(builder);
        director.construct();
        Product product = builder.getResult();
    }
}
