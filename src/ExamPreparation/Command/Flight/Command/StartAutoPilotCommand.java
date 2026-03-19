
package ExamPreparation.Command.Flight.Command;

import ExamPreparation.Command.Flight.Plane;

public class StartAutoPilotCommand implements Command {

	public StartAutoPilotCommand(Plane plane) {
		super();
		this.plane = plane;
	}

	@Override
	public void execute() {
		plane.startautopilot();
	}

	private Plane plane;

}
