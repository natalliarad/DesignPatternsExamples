package behaviour.chainOfResponsibilities.authentificationHandler;

public abstract class AbstractHandler {

    private final MapEmployee mapEmployee;
    private AbstractHandler successor = DefaultHandleRequest.getHandleRequest();

    AbstractHandler(final AbstractHandler successor) {
        this.mapEmployee = new MapEmployee();
        this.successor = successor;
    }

    AbstractHandler() {
        this.mapEmployee = new MapEmployee();
    }

    void setSuccessor(final AbstractHandler successor) {
        this.successor = successor;
    }

    abstract void handleRequest(Employee employee);

    public void chain(final Employee user) {

        if (mapEmployee.containsUser(user)) {
            handleRequest(user);
            successor.chain(user);
        } else {
            System.out.println("user don't exist");
        }
    }

    private static final class DefaultHandleRequest extends AbstractHandler {

        private static final DefaultHandleRequest handler = new DefaultHandleRequest();

        private DefaultHandleRequest() {
        }

        static DefaultHandleRequest getHandleRequest() {
            return handler;
        }

        @Override
        public void handleRequest(final Employee employee) {
            //default handler if it exists
        }

        @Override
        public void chain(final Employee user) {
            //always empty
        }
    }
}
