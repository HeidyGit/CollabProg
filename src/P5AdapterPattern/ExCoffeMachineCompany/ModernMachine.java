package P5AdapterPattern.ExCoffeMachineCompany;

public class ModernMachine implements Machine {

    private OldMachine old;

    public ModernMachine(OldMachine old){
        this.old=old;
    }


    public int getNumberOfCapsules() {
        return old.getNumberOfCapsules();
    }

    @Override
    public void stop() {
        old.stop();
    }

    @Override
    public Engineer getEngineer(){
        return null;
    }

    public boolean isCompletelyUp(){
        return old.getState();
    }


}
