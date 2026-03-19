package P7StatePattern.Ex1StatesOfACoffeeMachine.state;

public interface State {

    void coinInserted();
    void coinReturn();
    void rightAmountEntered();
    void buttonPushed();
    void cupRemoved();
    void problemDetected();
    void resetButton();
}
