package P3AbstractFactoryPattern.Ex1_ArchitectOffice;

public class DutchHouseFactory implements HouseFactory{
    @Override
    public Door createDoor() {
        return new ThinDoor();
    }

    @Override
    public Window createWindow() {
        return new FloorWindow();
    }
}
