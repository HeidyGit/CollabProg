package P3AbstractFactoryPattern.Ex2_CarProgram.creator;

import P3AbstractFactoryPattern.Ex2_CarProgram.cars.Car;
import P3AbstractFactoryPattern.Ex2_CarProgram.cars.Coupe;

public class CoupeCreator extends CarCreator
{
    @Override
    protected Car createCar() {
		return new Coupe();
	}
}
