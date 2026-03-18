package P7StatePattern.Ex02ConversationState;

/*como argumento, el objeto que va a sufrir los cambios de estado.
Constructor tiene que tener como argumento el objeto que va a sufrir el cambio
suiguen une Overrides de las acciones de transición. Especificación de lo que va a pasar.
*/
public class inMeeting implements State {
    Person person;

    public inMeeting(Person person) {
        this.person = person;
    }

    @Override
    public void leave(){
        person.setState(person.getRegistered());
        System.out.println("Leaving meeting going to Registered state");
    }
    @Override
    public void ask(){
        person.setState(person.getWaitingToSpeak());
        System.out.println("Leaving inMeeting State going to Waiting to Speak state");
    };

    @Override
    public void enter(){};

    @Override
    public void handOver(){};

    @Override
    public void connect(){};

    @Override
    public void over(){};

}
