package P10MementoPattern;

public class Test {
    public static void main (String[] args){
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("blue");
        careTaker.save(originator.createMemento());

        originator.setState("red");
        careTaker.save(originator.createMemento());

        //revert le dernier state saved
        careTaker.revert(originator);

    }
}
