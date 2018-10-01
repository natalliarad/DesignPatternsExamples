package structural.facades.baseExample;

public class Facade implements IFacade {

    private final SecuritySystem securitySystem;
    private final SubSystem subSystem;

    Facade(final SecuritySystem securitySystem, final SubSystem subSystem) {
        //variants can be different
        this.securitySystem = securitySystem;
        this.subSystem = subSystem;
    }

    @Override
    public void generate() {
        //check user and user's rights
        securitySystem.checkUser();
        securitySystem.checkRights();
        //action
        subSystem.createNode();
    }

    @Override
    public void find() {
        //check user
        securitySystem.checkUser();
        subSystem.parse();
    }
}
