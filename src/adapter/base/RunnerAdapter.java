package adapter.base;

public class RunnerAdapter {

  public static void main(String[] args) {
    Adapter adapter = new ConcreteAdapter(new Adaptee());
    Client client = new Client(adapter);
    client.execute(adapter);
  }
}
