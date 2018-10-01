package behaviour.chainOfResponsibilities.authentificationHandler;

class RoleManager extends AbstractHandler {

    public RoleManager() {
    }

    @Override
    void handleRequest(final Employee user) {
        checkPermission();
    }

    void checkPermission() {
        System.out.println("checking role");
        //checking role
    }
}
