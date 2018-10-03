package behaviour.visitor.serialisationObjectsInXml.shapes;

import behaviour.visitor.serialisationObjectsInXml.visitors.Visitor;

public class Circle extends Dot {

    private int radius;

    public Circle(final int id, final int x, final int y, final int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(final Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}
