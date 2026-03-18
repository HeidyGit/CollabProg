package P7StatePattern.Ex02ConversationState;
/*dentro del objeto se pone
 argumentos -> todos los estados posibles
 En el costructor, la inicilisación de los estados que puede tener.
 1 solo set para el Estado
 get de todos los estados possibles
 las acciones de transición entre mis estados
 */
public class Person {
    private State currentState;
    private State inMeeting;
    private State registered;
    private State speaking;
    private State waitingToSpeak;

    public Person() {
        inMeeting = new inMeeting(this);
        registered = new Registered(this);
        speaking = new Speaking(this);
        waitingToSpeak = new WaitingToSpeak(this);
        currentState = registered; //estado de base que yo escojo.
    }

    //set l'état
    public void setState(State state) {
        currentState = state;
    }

    public State getInMeeting() {
        return inMeeting;
    }
    public State getRegistered() {
        return registered;
    }
    public State getSpeaking() {
        return speaking;
    }
    public State getWaitingToSpeak() {
        return waitingToSpeak;
    }

    //actions de transitions pour arriver aux états d'en haut
    public void leave() {
        currentState.leave();
    }
    public void enter() {
        currentState.enter();
    }
    public void ask() {
        currentState.ask();
    }
    public void handOver() {
        currentState.handOver();
    }
    public void connect() {
        currentState.connect();
    }

    public void over() {
        currentState.over();
    }

}
