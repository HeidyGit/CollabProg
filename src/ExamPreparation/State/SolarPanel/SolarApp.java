
package ExamPreparation.State.SolarPanel;
public class SolarApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SolarInfrastructure solar = new SolarInfrastructure();
		Observer user1 = new User("Matteo");
		Observer user2 = new User("Marc");
		solar.registerObserver(user1);
		
		solar.start();
		solar.predict();
		solar.stop();

		solar.registerObserver(user2);
		solar.start();
		solar.predict();
		solar.predict();
		solar.predict();
		solar.predict();
		solar.stop();
	}

}
