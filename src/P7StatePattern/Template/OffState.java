package P7StatePattern.Template;

public class OffState implements State {
    private Context context;

    public OffState(Context context) {
        this.context = context;
    }

    @Override
    public void on(){
        context.setState(context.getOnState());
        System.out.println("Turning on from off");
    }

    @Override
    public void off() {
        System.out.println("Already off");
    }
}
