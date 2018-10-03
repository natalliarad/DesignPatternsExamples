package behaviour.visitor.serialisationObjectsInXml.shapes;

import java.util.ArrayList;
import java.util.List;

import behaviour.visitor.serialisationObjectsInXml.visitors.Visitor;

public class CompoundShape implements Shape {

    public int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(final int id) {
        this.id = id;
    }

    @Override
    public void move(final int x, final int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

    public int getId() {
        return id;
    }

    @Override
    public String accept(final Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(final Shape shape) {
        children.add(shape);
    }
}
