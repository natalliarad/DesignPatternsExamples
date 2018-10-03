package behaviour.visitor.serialisationObjectsInXml.shapes;

import behaviour.visitor.serialisationObjectsInXml.visitors.Visitor;

public class Rectangle implements Shape {

    private int id;
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(final int id, final int x, final int y, final int width, final int height) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitRectangle(this);
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
