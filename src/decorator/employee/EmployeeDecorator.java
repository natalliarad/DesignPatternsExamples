package decorator.employee;

/**
 * Defines the interface corresponding to the class interface {@link IEmployee} for the set
 * of decorators and creates the necessary references.
 */
public class EmployeeDecorator implements IEmployee {

    protected Employee employee;

    public EmployeeDecorator() {
        super();
    }

    public EmployeeDecorator(final Employee employee) {
        this.employee = employee;
    }

    @Override
    public void openTask() {
        employee.openTask();
    }

    @Override
    public void reopenTask() {
        employee.reopenTask();
    }

    @Override
    public void resolveTask() {
        employee.resolveTask();
    }
}
