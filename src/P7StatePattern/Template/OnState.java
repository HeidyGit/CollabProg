package P7StatePattern.Template;

public class OnState implements State {
    private Context contextOn;
    public OnState(Context context) {
        this.contextOn = context;
    }

    @Override
    public void off() {
        contextOn.setState(contextOn.getOffState());
        System.out.println("Turning off from on");
    }

    @Override
    public void on() {
        System.out.println("Already on");
    }
}
