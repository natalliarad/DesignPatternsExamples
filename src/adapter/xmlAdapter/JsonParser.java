package adapter.xmlAdapter;

public class JsonParser implements Parser {

  @Override
  public Order parse(String jsonOrder) {
    Order order = new Order();
    System.out.println("Parse JSON.");
    return order;
  }
}
