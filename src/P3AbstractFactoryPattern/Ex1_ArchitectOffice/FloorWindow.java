package P3AbstractFactoryPattern.Ex1_ArchitectOffice;
//implementation de l'abstract product
public class FloorWindow implements Window{
    double price = 1000;
    public double getPrice(){
        return this.price;
    }
}
