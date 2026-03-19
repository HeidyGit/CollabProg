package ExamPreparation.State.SolarPanel;
import java.util.ArrayList;
import java.util.List;



public class SolarInfrastructure implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	private State currentState;

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public SolarInfrastructure() {
		this.computeState = new StateCompute(this);
		this.offState = new StateOff(this);
		this.onState = new StateOn(this);
		this.currentState = offState;
	}

	public void start() {
		this.currentState.on();
	}

	public void stop() {
		this.currentState.off();
	}
	
	public void predict() {
		this.currentState.compute();
		this.currentState.on();
	}


	
	// STATES
	
	private State computeState;

	public State getComputeState() {
		return computeState;
	}

	private State offState;

	public State getOffState() {
		return offState;
	}

	private State onState;

	public State getOnState() {
		return onState;
	}


	private State transferState;

	public State getTransferState() {
		return transferState;
	}


	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(State.currentProductionLevel);
		}
	}

	
}
