package composite.base;

import java.util.ArrayList;

public class Composite implements Component {

    private final ArrayList<Component> components = new ArrayList<>();

    @Override
    public void operation() {
        System.out.println("Composite -> Call children operations");
        int size = components.size();
        for (int i = 0; i < size; i++) {
            components.get(i).operation();
        }
    }

    @Override
    public void add(final Component c) {
        System.out.println("Composite -> Adding component");
        components.add(c);
    }

    @Override
    public void remove(final Component c) {
        System.out.println("Composite -> Removing component");
        components.remove(c);
    }

    @Override
    public Object getChild(final int index) {
        System.out.println("Composite -> Getting component");
        return components.get(index);
    }
}
