package P3AbstractFactoryPattern.Ex2_CarProgram.creator;

import P3AbstractFactoryPattern.Ex2_CarProgram.cars.Car;

public abstract class CarCreator {

    public Car orderCar(String color) {
        Car car = createCar();

        car.installEngine();
        car.addExtras();
        car.paint(color);

        return car;
    }

	protected abstract Car createCar();

}
