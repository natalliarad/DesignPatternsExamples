package structural.composite.base;

class Client {

    private final Component component;

    Client(final Component component) {
        this.component = component;
    }

    void execute() {
        component.operation();
    }
}
