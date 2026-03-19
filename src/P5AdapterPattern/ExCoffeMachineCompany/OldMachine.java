package P5AdapterPattern.ExCoffeMachineCompany;

public class OldMachine {
    Machine machine;
    boolean state = true;
    int numCapsules;

    public OldMachine (int num){
        this.numCapsules= num;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getState(){
        System.out.println("This machine is up");
        return state;
    }


    public int getNumberOfCapsules (){
        return numCapsules;
    }

    public void setNumberofCapsules(int num){
        this.numCapsules = num;
    }


    public boolean isCompletelyUp() {
        return state;
    }

    public void stop(){
        this.state = false;
        System.out.println("This machine is stoped");
    }


    @Override
    public String toString(){
        return "machine" + machine.hashCode() + "is currently processing" + numCapsules;
    }

}
