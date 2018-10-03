package behaviour.memento.shapeEditor;

import java.awt.Color;

import behaviour.memento.shapeEditor.editor.Editor;
import behaviour.memento.shapeEditor.shapes.Circle;
import behaviour.memento.shapeEditor.shapes.CompoundShape;
import behaviour.memento.shapeEditor.shapes.Dot;
import behaviour.memento.shapeEditor.shapes.Rectangle;

public final class ShapeEditorDemo {

    public static void main(final String[] args) {
        final Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
