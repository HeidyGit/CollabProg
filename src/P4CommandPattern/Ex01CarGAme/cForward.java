package P4CommandPattern.Ex01CarGAme;

public class cForward implements cGameCommands {
    rCar car;

    public cForward (rCar car){
        this.car=car;
    }

    public void execute(){
        this.car.forward();
    }


    public void undo() {
        car.backward();
    }
}
