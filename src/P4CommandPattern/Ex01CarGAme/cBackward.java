package P4CommandPattern.Ex01CarGAme;

public class cBackward implements cGameCommands {
    rCar car;

    public cBackward (rCar car){
        this.car=car;
    }

    public void execute(){
        this.car.backward();
    }

    public void undo() {
        car.forward();
    }
}
