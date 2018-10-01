package structural.adapter.base;

/**
 * Can interact only with instances, which implements interface Adapter.
 */
class Client {

    private Adapter target;

    Client(final Adapter target) {
        this.target = target;
    }

    void execute(final Adapter target) {
        target.request();
    }
}
