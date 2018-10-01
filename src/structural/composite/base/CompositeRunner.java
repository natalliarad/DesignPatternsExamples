package structural.composite.base;

public final class CompositeRunner {

    public static void main(final String[] args) {
        final Component composite = new Composite();
        final Component leaf = new Leaf();
        leaf.add(composite); //nothing happens
        composite.add(leaf);
        final Client client = new Client(composite);
        client.execute();
    }
}
