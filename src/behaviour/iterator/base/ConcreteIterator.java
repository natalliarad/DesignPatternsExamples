package behaviour.iterator.base;

public class ConcreteIterator implements Iterator {

    private final ConcreteAggregate concreteAggregate;

    public ConcreteIterator(final ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public void first() {
        //first element in concreteAggregate
    }

    @Override
    public boolean isDone() {
        //check whether the end is reached
        return false;
    }

    @Override
    public void next() {
        //next element in concreteAggregate
    }

    @Override
    public Object currentItem() {
        //return current item in concreteAggregate
        return null;
    }
}
