package behaviour.memento.shapeEditor.commands;

import java.awt.Color;

import behaviour.memento.shapeEditor.editor.Editor;
import behaviour.memento.shapeEditor.shapes.Shape;

public class ColorCommand implements Command {

    private Editor editor;
    private Color color;

    public ColorCommand(final Editor editor, final Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (final Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}
