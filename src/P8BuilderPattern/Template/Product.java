package P8BuilderPattern.Template;

public class Product {
    private String partA;
    private String partB;
    private String partC;


    public void setPartB(String s) {
        this.partB = s;
    }

    public void setPartA(String s) {
        this.partA = s;
    }

    public void setPartc(String s) {
        this.partC = s;
    }

    @Override
    public String toString() {
        return "Product amde of parts: " + partA+ partB+ partC;
    }
}
