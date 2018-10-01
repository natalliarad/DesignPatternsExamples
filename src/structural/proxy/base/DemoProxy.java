package structural.proxy.base;

public final class DemoProxy {

    public static void main(final String[] args) {
        final BaseInterface baseInterface = new Proxy();
        baseInterface.perform();
    }
}
