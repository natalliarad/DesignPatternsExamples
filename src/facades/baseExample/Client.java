package facades.baseExample;

public class Client {

    public static void main(String[] args) {
        SecuritySystem securitySystem = new SecuritySystem();
        SubSystem subSystem = new SubSystem();
        Facade facade = new Facade(securitySystem, subSystem);
        facade.generate();
    }
}
