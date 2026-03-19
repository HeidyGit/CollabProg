package P4CommandPattern.Ex01CarGAme;

public class cRight implements cGameCommands {
    rCar car;

    public cRight (rCar car){
        this.car=car;
    }

    public void execute(){
        this.car.right();
    }

    public void undo() {
        car.left();
    }
}
