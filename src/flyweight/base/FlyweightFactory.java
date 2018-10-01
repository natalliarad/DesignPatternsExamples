package flyweight.base;

public class FlyweightFactory {

  private Flyweight flyweight;

  public Flyweight getFlyweight() {
    return new ConcreteFlyweight();
  }
}
