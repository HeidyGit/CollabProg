package P7StatePattern.Ex02ConversationState;

public interface State {
    public void leave ();
    public void enter();
    public void ask ();
    public void handOver();
    public void connect();
    public void over();
}
