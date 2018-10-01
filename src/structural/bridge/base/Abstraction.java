package structural.bridge.base;

public interface Abstraction {

    static Implementor implementor = null;

    void operation();
}
