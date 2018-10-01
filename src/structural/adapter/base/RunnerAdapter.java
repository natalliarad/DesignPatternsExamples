package structural.adapter.base;

public final class RunnerAdapter {

    public static void main(final String[] args) {
        final Adapter adapter = new ConcreteAdapter(new Adaptee());
        final Client client = new Client(adapter);
        client.execute(adapter);
    }
}
