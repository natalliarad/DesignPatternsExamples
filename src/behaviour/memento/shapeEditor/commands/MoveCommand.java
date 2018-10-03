package behaviour.memento.shapeEditor.commands;

import behaviour.memento.shapeEditor.editor.Editor;
import behaviour.memento.shapeEditor.shapes.Shape;

public class MoveCommand implements Command {

    private Editor editor;
    private int startX, startY;
    private int endX, endY;

    public MoveCommand(final Editor editor) {
        this.editor = editor;
    }

    @Override
    public String getName() {
        return "Move by X:" + (endX - startX) + " Y:" + (endY - startY);
    }

    public void start(final int x, final int y) {
        startX = x;
        startY = y;
        for (final Shape child : editor.getShapes().getSelected()) {
            child.drag();
        }
    }

    public void move(final int x, final int y) {
        for (final Shape child : editor.getShapes().getSelected()) {
            child.moveTo(x - startX, y - startY);
        }
    }

    public void stop(final int x, final int y) {
        endX = x;
        endY = y;
        for (final Shape child : editor.getShapes().getSelected()) {
            child.drop();
        }
    }

    @Override
    public void execute() {
        for (final Shape child : editor.getShapes().getSelected()) {
            child.moveBy(endX - startX, endY - startY);
        }
    }
}
