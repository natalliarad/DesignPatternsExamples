package structural.composite.base;

public class Leaf implements Component {

    @Override
    public void operation() {
        System.out.println("Leaf -> Performing operation");
    }

    @Override
    public void add(final Component c) {
        System.out.println("Leaf -> add. Doing nothing");
    }

    @Override
    public void remove(final Component c) {
        System.out.println("Leaf -> remove. Doing nothing");
    }

    @Override
    public Object getChild(final int index) {
        throw new UnsupportedOperationException();
    }
}
