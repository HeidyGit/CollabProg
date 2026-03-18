package P7StatePattern.Ex02ConversationState;

public class WaitingToSpeak implements State {
    Person person;
    public WaitingToSpeak(Person person) {
        this.person = person;
    }

    @Override
    public void handOver() {
        person.setState(person.getSpeaking());
        System.out.println("Hading overs from Waiting to Speak to Speaking state");
    }
    @Override
    public void leave() {
        person.setState(person.getRegistered());
        System.out.println("Leaving Waiting to Speak going to Registered state");
    }
    @Override
    public void ask() {}
    @Override
    public void enter() {}
    @Override
    public void connect() {}
    @Override
    public void over() {}
}
