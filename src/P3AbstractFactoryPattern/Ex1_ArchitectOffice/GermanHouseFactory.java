package P3AbstractFactoryPattern.Ex1_ArchitectOffice;

public class GermanHouseFactory implements HouseFactory{
    //here it is mandatory to specify the creation since we implement HouseFactory

    @Override
    public Door createDoor() {
        return new LargeDoor();
    }

    @Override
    public Window createWindow() {
        return new StrctureWindow();
    }

}
