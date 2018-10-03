package behaviour.iterator.studentSessionExample;

import java.util.HashMap;

public class StudentSession implements Aggregate {

    private HashMap<String, Integer> exams = new HashMap<>();

    @Override
    public CustomIterator createIterator() {
        final CustomIterator iterator = new ExamsIterator(this);
        iterator.first();
        return iterator;
    }

    void addExam(final String name, final Integer mark) {
        exams.put(name, mark);
    }

    Integer getMark(final String name) {
        return exams.get(name);
    }

    HashMap<String, Integer> getExams() {
        return exams;
    }
}
