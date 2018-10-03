package behaviour.memento.base;

public final class MementoDemo {

    public static void main(final String[] args) {
        final Originator originator = new Originator();
        final Caretaker caretaker = new Caretaker(originator.createMemento());
        System.out.println(originator);
        originator.execute();
        System.out.println(originator);
        originator.setMemento(caretaker.getMemento());
        System.out.println(originator);
    }
}
