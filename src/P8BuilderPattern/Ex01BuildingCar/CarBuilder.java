package P8BuilderPattern.Ex01BuildingCar;

public abstract class CarBuilder {
    protected Car car;

    public abstract void buildPower();
    public abstract void buildEngine();
    public abstract void buildBreaks();
    public abstract void buildSeats();
    public abstract void buildWindows();

    public Car getCarResult(){
        return car;
    }
}
