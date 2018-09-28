package decorator.employee;

public class DecoratorRun {

    public static void main(String[] args) {
        IEmployee employee = new TesterDecorator(new Employee("Ivanov"));
        employee.reopenTask();
        employee = new TeamLeadDecorator(new Employee("Petrov"));
        employee.openTask();
    }
}
