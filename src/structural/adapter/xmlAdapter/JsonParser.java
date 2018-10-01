package structural.adapter.xmlAdapter;

public class JsonParser implements Parser {

    @Override
    public Order parse(final String jsonOrder) {
        final Order order = new Order();
        System.out.println("Parse JSON.");

        return order;
    }
}
