package adapter.xmlAdapter;

public class XmlParserAdapter implements Parser {

  private XmlParser xmlParser;
  private double xmlVersion; //согласование параметров для адаптации
  private String encoding; //согласование параметров для адаптации

  public XmlParserAdapter(XmlParser xmlParser, double xmlVersion, String encoding) {
    this.xmlParser = xmlParser;
    this.xmlVersion = xmlVersion;
    this.encoding = encoding;
  }

  @Override
  public Order parse(String order) {
    return xmlParser.parseXml(order, xmlVersion, encoding);
  }
}
