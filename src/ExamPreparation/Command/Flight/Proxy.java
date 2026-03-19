
package ExamPreparation.Command.Flight;

import ExamPreparation.Command.Flight.Command.Controller;
import ExamPreparation.Command.Flight.Command.FullController;

public class Proxy implements Controller {

	@Override
	public void takeOff(Pilot pilot) {
		if (!pilot.isCopilot()) {
			fullController.takeOff(pilot);
		}
	}

	@Override
	public void landing(Pilot pilot) {
		if (!pilot.isCopilot()) {
			fullController.landing(pilot);
		}
	}

	@Override
	public void startAutoPilot(Pilot pilot) {
		fullController.startAutoPilot(pilot);
	}

	private FullController fullController;
	
	Proxy(Plane plane) {
		this.fullController = new FullController(plane);
	}

}
