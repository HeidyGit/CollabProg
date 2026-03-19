package P4CommandPattern.Ex01CarGAme;

import P8BuilderPattern.Ex01BuildingCar.Car;

public class MobileGame {
    public static void main(String[] args) {
        iGame game = new iGame();
        rCar car = new rCar();
        //setting cammands and keys.
        game.setCommandKey(new cLeft(car),0);

        cGameCommands cright = new cRight(car);
        game.setCommandKey(cright,1);

        cGameCommands cfoward = new cForward(car);
        game.setCommandKey(cfoward,2);

        cGameCommands cbackward = new cBackward(car);
        game.setCommandKey(cbackward,3);



        game.pushKey(2);
        game.pushKey(2);
        game.pushKey(3);
        game.pushKey(2);
        game.pushKey(0);
        game.pushKey(1);
        game.undo();
    }
}
