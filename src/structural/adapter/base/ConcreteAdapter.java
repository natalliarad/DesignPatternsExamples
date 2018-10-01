package structural.adapter.base;

public class ConcreteAdapter implements Adapter {

    private Adaptee adaptee;

    ConcreteAdapter(final Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("Return type - void.");
        adaptee.specificRequest();
    }
}
