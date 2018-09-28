package decorator.employee;

/**
 * Declares additional functionality {@link TesterDecorator#testing()} and
 * {@link TesterDecorator#reporting()} necessary for the developer, complementing (decorating)
 * the functionality of the class {@link Employee}.
 */
public class TesterDecorator extends EmployeeDecorator {
    //fields, methods

    public TesterDecorator(final Employee employee) {
        super(employee);
    }

    @Override
    public void openTask() {
        super.openTask();
        testing();
    }

    @Override
    public void reopenTask() {
        super.reopenTask();
        testing();
    }

    @Override
    public void resolveTask() {
        super.resolveTask();
        reopenTask();
    }

    private void testing() {
        System.out.println(employee.getName() + " testing task");
    }

    private void reporting() {
        System.out.println(employee.getName() + " create report");
    }
}
