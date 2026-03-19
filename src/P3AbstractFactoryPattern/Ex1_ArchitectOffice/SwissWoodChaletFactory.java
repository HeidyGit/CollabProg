package P3AbstractFactoryPattern.Ex1_ArchitectOffice;

public class SwissWoodChaletFactory implements HouseFactory{
    @Override
    public Door createDoor() {
        return new LargeDoor();
    }

    @Override
    public Window createWindow() {
        return new FloorWindow();
    }
}
