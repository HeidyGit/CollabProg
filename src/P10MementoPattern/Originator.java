package P10MementoPattern;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("Originator: Setting state to " + state);
    }

    public Memento createMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this.state);
    }

    public void setMemento(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + this.state);
    }

    public class Memento {
        private final String state;

        public Memento(String stateToSave) {
            this.state = stateToSave;
        }

        private String getSavedState() {
            return state;
        }
    }
}
