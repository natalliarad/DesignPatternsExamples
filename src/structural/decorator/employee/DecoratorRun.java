package structural.decorator.employee;

public final class DecoratorRun {

    public static void main(final String[] args) {
        IEmployee employee = new TesterDecorator(new Employee("Ivanov"));
        employee.reopenTask();
        employee = new TeamLeadDecorator(new Employee("Petrov"));
        employee.openTask();
    }
}
