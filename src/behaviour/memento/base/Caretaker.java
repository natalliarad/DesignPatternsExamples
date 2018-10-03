package behaviour.memento.base;

class Caretaker {

    private Memento memento;

    public Caretaker(final Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
