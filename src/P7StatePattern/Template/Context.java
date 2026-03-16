package P7StatePattern.Template;

public class Context {
    private State currentState;
    private State onState;
    private State offState;

    public Context() {
        onState = new OnState(this);
        offState = new OffState(this);
        currentState = offState; // Initial state is off un état de démarrage.
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getOnState() {
        return onState;
    }

    public State getOffState() {
        return offState;
    }

    //deleguer à l'etat current
    public void on(){
        currentState.on();
    }

    public void off(){
        currentState.off();
    }


}
