package ExamPreparation.Command.Flight;

import ExamPreparation.Command.Flight.Command.Controller;

public class FlightTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pilot max = new Pilot(false);
		Pilot alex = new Pilot(true);
		
		Plane plane = new Plane("Airbus");
		
		Controller proxy = new Proxy(plane);
		
		proxy.takeOff(max);
		proxy.landing(max);
		proxy.startAutoPilot(max);
		
		proxy.takeOff(alex);
		proxy.landing(alex);
		proxy.startAutoPilot(alex);
		
	}

}
