package ExamPreparation.Method.ConcreteProducts;

import ExamPreparation.Method.company.Carpentry;
import ExamPreparation.Method.heating.EcologicalHeating;

/**
 * Lab 16
 * @author scz
 */
public class Chalet extends Construction {

	public Chalet() {
		this.structureCompany = new Carpentry();
		this.heatingCompany = new EcologicalHeating();
	}
	
	@Override
	public void paint() {
		System.out.println("No painting is needed");
	}

	@Override
	public void createPlans() {
		System.out.println("Create the chalet plans");
	}

	@Override
	public void writeFinalReport() {
		System.out.println("Write final report for Chalet");
	}

}
