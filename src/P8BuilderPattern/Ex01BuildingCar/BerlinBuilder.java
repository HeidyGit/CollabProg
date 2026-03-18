package P8BuilderPattern.Ex01BuildingCar;

public class BerlinBuilder extends CarBuilder{
    private Car berlincar = new Car("Berlin");

    @Override
    public void buildPower(){
        berlincar.setPower("Berlin power");
    }

    @Override
    public  void buildEngine(){
        berlincar.setEngine("Berlin engine");
    }
    @Override
    public  void buildBreaks(){
        berlincar.setBreaks("Berlin breaks");
    }
    @Override
    public  void buildSeats(){
        berlincar.setSeats("Berlin seats");
    }
    @Override
    public  void buildWindows(){
        berlincar.setWindows("Berlin windows");
    }

    @Override
    public Car getCarResult(){
        return  berlincar;
    }

}
