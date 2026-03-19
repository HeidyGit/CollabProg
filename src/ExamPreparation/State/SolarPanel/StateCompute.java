package ExamPreparation.State.SolarPanel;
import java.util.ArrayList;
import java.util.List;



public class StateCompute extends State {
	
	public StateCompute(SolarInfrastructure solarInfrastructure) {
		super();
		this.solarInfrastructure = solarInfrastructure;
	}

	@Override
	public void on() {
		solarInfrastructure.setCurrentState(solarInfrastructure.getOnState());
	}

	@Override
	public void off() {
	}

	@Override
	public void compute() {
	}

}
