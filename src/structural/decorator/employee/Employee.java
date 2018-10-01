package structural.decorator.employee;

/**
 * Class, the functionality of which will be expanded due to the use of the structural.decorator.
 * In general, it may even prohibit inheritance (may be declared as final)
 */
public class Employee implements IEmployee {

    private String name;

    public Employee() {

    }

    Employee(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public void openTask() {
        System.out.println(this.getName() + " open task");
    }

    @Override
    public void reopenTask() {
        System.out.println(this.getName() + " reopen task");
    }

    @Override
    public void resolveTask() {
        System.out.println(this.getName() + " resolve task");
    }
}
