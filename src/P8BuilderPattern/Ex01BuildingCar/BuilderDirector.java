package P8BuilderPattern.Ex01BuildingCar;

public class BuilderDirector {
    private CarBuilder carBuilder;;

    public void setCarBuilder( CarBuilder specificCarBuilder){
        this.carBuilder = specificCarBuilder;
    }

    public void buildCar(){
        carBuilder.buildBreaks();
        carBuilder.buildEngine();
        carBuilder.buildPower();
        carBuilder.buildSeats();
        carBuilder.buildWindows();
    }
}
