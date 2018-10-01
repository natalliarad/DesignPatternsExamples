package structural.proxy.base;

public class Proxy implements BaseInterface {

  private BaseClass baseClass = null;

  @Override
  public void perform() {
    baseClass = new BaseClass();
    baseClass.perform();
  }
}
