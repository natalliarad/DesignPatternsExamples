package composite.base;

public class Client {

    private final Component component;

    public Client(final Component component) {
        this.component = component;
    }

    public void execute() {
        component.operation();
    }
}
