package ExamPreparation.Command.Flight.Command;

import ExamPreparation.Command.Flight.Pilot;

public interface Controller {
	void takeOff(Pilot pilot);
	void landing(Pilot pilot);
	void startAutoPilot(Pilot pilot);
}
