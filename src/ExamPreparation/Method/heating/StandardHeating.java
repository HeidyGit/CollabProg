package ExamPreparation.Method.heating;

/**
 * Lab 16
 * @author scz
 */
public class StandardHeating extends HeatingCompany {

	void installGazHeating() {
		System.out.println("install gaz heating");
	}

	@Override
	public void installGroundHeating() {
		installGazHeating();
		System.out.println("Install the ground heating");
	}
	
}
