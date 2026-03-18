package P7StatePattern.Ex02ConversationState;

public class Speaking implements State {
    Person person;
    public Speaking(Person person) {
        this.person = person;
    }

    @Override
    public void leave() {
        person.setState(person.getRegistered());
        System.out.println("Leaving Speaking going to Registered state");
    }

    @Override
    public void over() {
        person.setState(person.getInMeeting());
        System.out.println("Leaving Speaking state going to InMeeting state");
    }
    @Override
    public void ask() {}
    @Override
    public void enter() {}
    @Override
    public void handOver() {}
    @Override
    public void connect() {}
}
