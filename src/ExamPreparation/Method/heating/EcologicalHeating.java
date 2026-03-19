package ExamPreparation.Method.heating;

/**
 * Lab 16
 * @author scz
 */
public class EcologicalHeating extends HeatingCompany {

	@Override
	public void installGroundHeating() {
		installSolarPanels();
		System.out.println("Install the ground heating");
	}

	void installSolarPanels() {
		System.out.println("Install solar panels");
	}
	
}
