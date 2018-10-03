package behaviour.memento.base;

class Originator {

    private String state = "Initial state";

    void setMemento(final Memento memento) {
        state = memento.getState();
    }

    Memento createMemento() {
        final Memento memento = new Memento();
        memento.setState(state);

        return memento;
    }

    void execute() {
        state = "New state";
    }

    @Override
    public String toString() {
        return state;
    }
}
