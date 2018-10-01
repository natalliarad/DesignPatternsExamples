package structural.facades.baseExample;

public final class Client {

    public static void main(final String[] args) {
        final SecuritySystem securitySystem = new SecuritySystem();
        final SubSystem subSystem = new SubSystem();
        final Facade facade = new Facade(securitySystem, subSystem);
        facade.generate();
    }
}
