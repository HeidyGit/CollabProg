package P4CommandPattern.Ex01CarGAme;

public class cLeft implements cGameCommands {
    rCar car;

    public cLeft (rCar car){
        this.car = car;
    }

    public void execute(){
        this.car.left();
    }


    public void undo() {
        car.right();
    }

}
