package P5AdapterPattern.ExCoffeMachineCompany;

public class CapselMachine implements Machine {
    private final int numberOfCapsules;
    private boolean state;
    private final Engineer responsibleEngineer;

    public CapselMachine(int numberOfCapsules, Engineer responsibleEngineer) {
        this.numberOfCapsules = numberOfCapsules;
        this.responsibleEngineer = responsibleEngineer;
    }

    public int getNumberOfCapsules() {
        return numberOfCapsules;
    }

    public boolean isCompletelyUp() {
        return state;
    }

    public void stop() {
        this.state = false;
    }

    @Override
    public Engineer getEngineer() {
        return responsibleEngineer;
    }
}
