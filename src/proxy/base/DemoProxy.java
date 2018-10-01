package proxy.base;

public class DemoProxy {

  public static void main(String[] args) {
    BaseInterface baseInterface = new Proxy();
    baseInterface.perform();
  }
}
