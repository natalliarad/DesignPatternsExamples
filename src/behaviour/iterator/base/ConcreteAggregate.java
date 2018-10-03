package behaviour.iterator.base;

public class ConcreteAggregate implements Aggregate {

    @Override
    public Iterator createIterator() {
        System.out.println("Creating concrete iterator for concrete aggregate.");
        Iterator iterator = new ConcreteIterator(this);

        return iterator;
    }
}
