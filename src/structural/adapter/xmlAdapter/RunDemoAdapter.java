package structural.adapter.xmlAdapter;

public final class RunDemoAdapter {

    public static void main(final String[] args) {
        final String jSonOrder = "\"id\": \"1456\", \"firstName\": \"John\", \"lastName\": \"Smith\" ...";
        Parser parser = new JsonParser();
        Order order = parser.parse(jSonOrder);
        System.out.println(order.getOrderAmount());
        final String xmlOrder = "<order id=\"1456\"><person firstName=\"John\" ...";
        parser = new XmlParserAdapter(new XmlParser(), 1.0, "UTF-8");
        order = parser.parse(xmlOrder);
        System.out.println(order.getOrderAmount());
    }
}
