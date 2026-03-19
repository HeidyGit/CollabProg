
package ExamPreparation.Command.Flight;
public class Plane {
	
	String name;
	
	Plane(String name) {
		this.name = name;
	}
	
	void takeoff() {
		System.out.println("Plane " + name + " is taking off.");
	}
	
	void landing() {
		System.out.println("Plane " + name + " is landing.");
	}
	
	void startautopilot() {
		System.out.println("Plane " + name + " starts autopilot.");
	}

}
