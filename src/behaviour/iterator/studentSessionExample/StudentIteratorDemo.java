package behaviour.iterator.studentSessionExample;

public final class StudentIteratorDemo {

    public static void main(final String[] args) {
        final StudentSession session = new StudentSession();
        session.addExam("MA", 9);
        session.addExam("TFCV", 10);
        session.addExam("DS", 8);
        System.out.println("The list of exams: ");
        final CustomIterator iterator = session.createIterator();

        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
