package behaviour.iterator.studentSessionExample;

public class ExamsIterator implements CustomIterator {

    private final StudentSession session;
    private String current;
    private java.util.Iterator<String> iterator;
    private boolean done;

    ExamsIterator(final StudentSession session) {
        this.session = session;
    }

    @Override
    public void first() {
        iterator = session.getExams().keySet().iterator();
        next();
    }

    @Override
    public boolean isDone() {
        return done;
    }

    @Override
    public void next() {

        if (iterator.hasNext()) {
            current = iterator.next();
        } else {
            done = true;
        }
    }

    @Override
    public Object currentItem() {
        return current;
    }
}
