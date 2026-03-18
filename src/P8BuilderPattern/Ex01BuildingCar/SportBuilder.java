package P8BuilderPattern.Ex01BuildingCar;

public class SportBuilder extends CarBuilder{
    private Car sportcar = new Car("Sport");

    @Override
    public void buildPower(){
        sportcar.setPower("sportcar power");
    }

    @Override
    public  void buildEngine(){
        sportcar.setEngine("sportcar engine");
    }
    @Override
    public  void buildBreaks(){
        sportcar.setBreaks("sportcar breaks");
    }
    @Override
    public  void buildSeats(){
        sportcar.setSeats("sportcar seats");
    }
    @Override
    public  void buildWindows(){
        sportcar.setWindows("sportcar windows");
    }

    @Override
    public Car getCarResult(){
        return  sportcar;
    }
}
