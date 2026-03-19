package ExamPreparation.Method.ConcreteProducts;

import ExamPreparation.Method.company.StructureCompany;
import ExamPreparation.Method.heating.HeatingCompany;

/**
 * Lab 16
 * @author scz
 */
public abstract class Construction {

	protected StructureCompany structureCompany;
	protected HeatingCompany heatingCompany;
	
	public final void constructHouse() {
		createPlans();
		createHouseStructure();
		installHeating();
		paint();
		writeFinalReport();
	}
	
	abstract void createPlans();
	
	void createHouseStructure() {
		structureCompany.constructStructure();
	}
	
	void installHeating() {
		heatingCompany.installGroundHeating();
	}
	public abstract void paint();
	
	abstract void writeFinalReport();
}
