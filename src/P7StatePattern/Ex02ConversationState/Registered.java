package P7StatePattern.Ex02ConversationState;

public class Registered implements State{
    private Person person;

    public Registered(Person person) {
        this.person = person;
    }

    @Override
    public void connect() {
        person.setState(person.getRegistered());
        System.out.println("Conextion successfull");

    }
    @Override
    public void enter(){
        person.setState(person.getInMeeting());
        System.out.println("Entering meeting");
    };

    @Override
    public void handOver(){};
    @Override
    public void ask(){};
    @Override
    public void leave(){};
    @Override
    public void over(){};

}
