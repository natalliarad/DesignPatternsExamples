package chainOfResponsibilities.authentificationHandler;

public abstract class AbstractHandler {

  MapEmployee mapEmployee;
  AbstractHandler successor = DefaultHandleRequest.getHandleRequest();

  public AbstractHandler(AbstractHandler successor) {
    this.mapEmployee = new MapEmployee();
    this.successor = successor;
  }

  public AbstractHandler() {
    this.mapEmployee = new MapEmployee();
  }

  public void setSuccessor(AbstractHandler successor) {
    this.successor = successor;
  }

  abstract public void handleRequest(Employee employee);

  public void chain(Employee user) {
    if (mapEmployee.containsUser(user)) {
      handleRequest(user);
      successor.chain(user);
    } else {
      System.out.println("user don't exist");
    }
  }

  private static class DefaultHandleRequest extends AbstractHandler {

    private static DefaultHandleRequest handler = new DefaultHandleRequest();

    private DefaultHandleRequest() {
    }

    public static DefaultHandleRequest getHandleRequest() {
      return handler;
    }

    @Override
    public void handleRequest(Employee employee) {
      //default handler if it exists
    }

    @Override
    public void chain(Employee user) {
      //always empty
    }
  }
}
