package ExamPreparation.State.SolarPanel;

public class User implements Observer {
	
	private String name;
	
	public User(String string) {
		this.name = string;
	}

	@Override
	public void update(ProductionLevel currentProductionLevel) {
		System.out.println("User " + this.name + " gets notified about the current Production level : " + currentProductionLevel.toString());
	}

}
