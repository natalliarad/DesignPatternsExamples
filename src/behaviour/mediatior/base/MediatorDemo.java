package behaviour.mediatior.base;

public final class MediatorDemo {

    public static void main(final String[] args) {
        final ConcreteMediator concreteMediator = new ConcreteMediator();
        concreteMediator.setTrue();
        concreteMediator.setFalse();
    }
}
