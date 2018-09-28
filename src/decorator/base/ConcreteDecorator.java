package decorator.base;

public class ConcreteDecorator extends Decorator {

  public void addedBehavior() {
    //more code
  }

  @Override
  public void operation() {
    super.operation();
    addedBehavior();
  }
}
