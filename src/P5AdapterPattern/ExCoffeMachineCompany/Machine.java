package P5AdapterPattern.ExCoffeMachineCompany;

public interface Machine {
    int getNumberOfCapsules();
    boolean isCompletelyUp();
    void stop();
    Engineer getEngineer();
}
