package decorator.employee;

/**
 * Declares additional functionality {@link DeveloperDecorator#startProgress()} and
 * {@link DeveloperDecorator#stopProgress()} necessary for the developer, complementing (decorating)
 * the functionality of the class {@link Employee}.
 */
public class DeveloperDecorator extends EmployeeDecorator {
    //fields, methods

    public DeveloperDecorator(final Employee employee) {
        super(employee);
    }

    @Override
    public void openTask() {
        super.openTask();
        startProgress();
    }

    @Override
    public void reopenTask() {
        super.reopenTask();
        startProgress();
    }

    @Override
    public void resolveTask() {
        super.resolveTask();
        stopProgress();
    }

    private void startProgress() {
        System.out.println(employee.getName() + " starting task");
    }

    private void stopProgress() {
        System.out.println(employee.getName() + " stopping task");
    }
}
