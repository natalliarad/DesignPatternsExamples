package structural.adapter.xmlAdapter;

public class XmlParserAdapter implements Parser {

    private final XmlParser xmlParser;
    private final double xmlVersion; //согласование параметров для адаптации
    private final String encoding; //согласование параметров для адаптации

    XmlParserAdapter(final XmlParser xmlParser, final double xmlVersion, final String encoding) {
        this.xmlParser = xmlParser;
        this.xmlVersion = xmlVersion;
        this.encoding = encoding;
    }

    @Override
    public Order parse(final String order) {
        return xmlParser.parseXml(order, xmlVersion, encoding);
    }
}
