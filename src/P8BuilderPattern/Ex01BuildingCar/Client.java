package P8BuilderPattern.Ex01BuildingCar;

public class Client {
    public static void main (String[] args){
        BuilderDirector director = new BuilderDirector();
        CarBuilder builderBerlin = new BerlinBuilder();
        director.setCarBuilder(builderBerlin);

        director.buildCar();
        Car berlincar = builderBerlin.getCarResult();
        System.out.println(berlincar);

        CarBuilder builderSport = new SportBuilder();
        director.setCarBuilder(builderSport);
        director.buildCar();
        Car sportCar = builderSport.getCarResult();
        System.out.println(sportCar);
    }
}
