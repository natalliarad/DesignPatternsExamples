package adapter.base;

/**
 * Can interact only with instances, which implements interface Adapter.
 */
public class Client {

  private Adapter target;

  Client(Adapter target) {
    this.target = target;
  }

  public void execute(Adapter target) {
    target.request();
  }
}
