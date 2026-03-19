package ExamPreparation.Method;

import ExamPreparation.Method.ConcreteProducts.Chalet;
import ExamPreparation.Method.ConcreteProducts.Construction;
import ExamPreparation.Method.ConcreteProducts.FlatHouse;

public class ArchitectOffice {

	public static void main(String[] args) {
		Construction chalet = new Chalet();
		chalet.constructHouse();
		Construction flatsHouse = new FlatHouse();
		flatsHouse.constructHouse();
	}
}
