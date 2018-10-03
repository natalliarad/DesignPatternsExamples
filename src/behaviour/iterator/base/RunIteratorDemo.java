package behaviour.iterator.base;

public final class RunIteratorDemo {

    public static void main(final String[] args) {
        final Aggregate aggregate = new ConcreteAggregate();
        final Iterator iterator = aggregate.createIterator();
        iterator.first();

        while (!iterator.isDone()) {
            final Object date = iterator.currentItem();
            iterator.next();
        }
    }
}
