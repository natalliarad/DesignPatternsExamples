package decorator.employee;

/**
 * Declares additional functionality {@link TeamLeadDecorator#assignTask()},
 * {@link TeamLeadDecorator#changeEmployee()} and {@link TeamLeadDecorator#closeTask()} necessary
 * for the developer, complementing (decorating) the functionality of the class {@link Employee}.
 */
public class TeamLeadDecorator extends EmployeeDecorator {
    //fields, methods

    public TeamLeadDecorator(final Employee employee) {
        super(employee);
    }

    @Override
    public void openTask() {
        super.openTask();
        assignTask();
    }

    @Override
    public void reopenTask() {
        super.reopenTask();
        changeEmployee();
    }

    @Override
    public void resolveTask() {
        super.resolveTask();
        closeTask();
    }

    private void assignTask() {
        System.out.println(employee.getName() + " is assigning task");
    }

    private void changeEmployee() {
        System.out.println(employee.getName() + " is changing employee");
    }

    private void closeTask() {
        System.out.println(employee.getName() + " is closing task");
    }
}
