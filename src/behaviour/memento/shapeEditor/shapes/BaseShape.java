package behaviour.memento.shapeEditor.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class BaseShape implements Shape {

    int x, y;
    private int dx, dy;
    private Color color;
    private boolean selected;

    BaseShape(final int x, final int y, final Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void drag() {
        dx = x;
        dy = y;
    }

    @Override
    public void moveTo(final int x, final int y) {
        this.x = dx + x;
        this.y = dy + y;
    }

    @Override
    public void moveBy(final int x, final int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void drop() {
        this.x = dx;
        this.y = dy;
    }

    @Override
    public boolean isInsideBounds(final int x, final int y) {
        return x > getX() && x < (getX() + getWidth()) &&
                y > getY() && y < (getY() + getHeight());
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(final Color color) {
        this.color = color;
    }

    @Override
    public void select() {
        selected = true;
    }

    @Override
    public void unSelect() {
        selected = false;
    }

    @Override
    public boolean isSelected() {
        return selected;
    }

    void enableSelectionStyle(final Graphics graphics) {
        graphics.setColor(Color.LIGHT_GRAY);

        final Graphics2D g2 = (Graphics2D) graphics;
        final float dash1[] = {2.0f};
        g2.setStroke(new BasicStroke(1.0f,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                2.0f, dash1, 0.0f));
    }

    void disableSelectionStyle(final Graphics graphics) {
        graphics.setColor(color);
        final Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke());
    }

    @Override
    public void paint(final Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
        } else {
            disableSelectionStyle(graphics);
        }

        // ...
    }
}
