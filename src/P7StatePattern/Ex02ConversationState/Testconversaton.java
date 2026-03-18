package P7StatePattern.Ex02ConversationState;

public class Testconversaton {
    public static void main (String[] args){
        Person person = new Person();
        person.connect();
        person.enter();
        person.ask();
        person.handOver();
        person.over();
        person.leave();
    }
}
