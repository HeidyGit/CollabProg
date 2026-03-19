package P7StatePattern.Ex1StatesOfACoffeeMachine.context;

import P7StatePattern.Ex1StatesOfACoffeeMachine.state.*;

public class CoffeeMachine {

    private double coinValue = 0.0;
    private final double coffeePrice = 2.2;
    private final State insertingCoinsState;
    private final State serviceNeededState;
    private final State makeCoffeeState;
    private final State userChooseState;
    private State idleState;
    private State state = idleState;

    public CoffeeMachine() {
        insertingCoinsState = new StateInsertingCoins(this);
        idleState = new StateIdle(this);
        serviceNeededState = new StateServiceNeeded(this);
        makeCoffeeState = new StateMakeCoffee(this);
        userChooseState = new StateUserChoose(this);
        this.setState(idleState);
    }

    public void coinInserted(double coinValue) {
        this.coinValue = coinValue;
        state.coinInserted();
    }

    public void buttonPushed() {
        state.buttonPushed();
    }

    public void coinReturn() {
        state.coinReturn();
    }

    public void cupRemoved() {
        state.cupRemoved();
    }

    public double getCoinValue() {
        return coinValue;
    }

    public void setCoinValue(int coinValue) {
        this.coinValue = coinValue;
    }

    public double getCoffeePrice() {
        return coffeePrice;
    }

    public State getInsertingCoinsState() {
        return insertingCoinsState;
    }

    public State getServiceNeededState() {
        return serviceNeededState;
    }

    public State getMakeCoffeeState() {
        return makeCoffeeState;
    }

    public State getUserChooseState() {
        return userChooseState;
    }

    public State getIdleState() {
        return idleState;
    }

    public void setState(State state) {
        this.state = state;
    }
}
