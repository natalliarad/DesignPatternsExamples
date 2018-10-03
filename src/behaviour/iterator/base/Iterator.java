package behaviour.iterator.base;

public interface Iterator { //analog of the java.util.Iterator

    void first(); //beginning position

    boolean isDone(); // analog hasNext()

    void next(); // analog next()

    Object currentItem(); //extract current object
}
