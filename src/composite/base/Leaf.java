package composite.base;

public class Leaf implements Component {

    @Override
    public void operation() {
        System.out.println("Leaf -> Performing operation");
    }

    @Override
    public void add(Component c) {
        System.out.println("Leaf -> add. Doing nothing");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Leaf -> remove. Doing nothing");
    }

    @Override
    public Object getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
