package P10MementoPattern;

import java.util.Stack;

public class CareTaker {
    Stack<Originator.Memento> snapshots = new Stack<Originator.Memento>();

    public void save(Originator.Memento state) {
        snapshots.push(state);
    }

    public void revert(Originator originator) {
        if (!snapshots.isEmpty())
            originator.setMemento(snapshots.pop());
        else
            System.out.println("Cannot undo !");
    }
}