package P3AbstractFactoryPattern.Ex2_CarProgram.creator;

import P3AbstractFactoryPattern.Ex2_CarProgram.cars.Car;
import P3AbstractFactoryPattern.Ex2_CarProgram.cars.Pickup;

public class PickupCreator extends CarCreator
{
    @Override
	protected Car createCar() {
		return new Pickup();
	}
}
