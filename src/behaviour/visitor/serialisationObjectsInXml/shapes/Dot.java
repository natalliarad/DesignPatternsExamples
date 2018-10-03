package behaviour.visitor.serialisationObjectsInXml.shapes;

import behaviour.visitor.serialisationObjectsInXml.visitors.Visitor;

public class Dot implements Shape {

    private int id;
    private int x;
    private int y;

    public Dot() {
    }

    public Dot(final int id, final int x, final int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(final int x, final int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

    @Override
    public String accept(final Visitor visitor) {
        return visitor.visitDot(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getId() {
        return id;
    }
}
