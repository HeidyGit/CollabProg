package ExamPreparation.Command.Flight;

import ExamPreparation.Command.Flight.Command.Command;

public class Cabin {

	private Command[] commands = new Command[3];

	
	public void pushKey(int key) {
		commands[key].execute();
	}

	public void setCommand(int key, Command command){
		commands[key] = command;
	}

}
