package behaviour.memento.shapeEditor.editor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

import javax.swing.JComponent;

import behaviour.memento.shapeEditor.commands.Command;
import behaviour.memento.shapeEditor.history.History;
import behaviour.memento.shapeEditor.history.Memento;
import behaviour.memento.shapeEditor.shapes.CompoundShape;
import behaviour.memento.shapeEditor.shapes.Shape;

public class Editor extends JComponent {

    private final Canvas canvas;
    private CompoundShape allShapes = new CompoundShape();
    private final History history;

    public Editor() {
        canvas = new Canvas(this);
        history = new History();
    }

    public void loadShapes(final Shape... shapes) {
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    public CompoundShape getShapes() {
        return allShapes;
    }

    public void execute(final Command c) {
        history.push(c, new Memento(this));
        c.execute();
    }

    void undo() {
        if (history.undo()) {
            canvas.repaint();
        }
    }

    void redo() {
        if (history.redo()) {
            canvas.repaint();
        }
    }

    public String backup() {
        try {
            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            final ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this.allShapes);
            oos.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (final IOException e) {
            return "";
        }
    }

    public void restore(final String state) {
        try {
            final byte[] data = Base64.getDecoder().decode(state);
            final ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            this.allShapes = (CompoundShape) ois.readObject();
            ois.close();
        } catch (final ClassNotFoundException e) {
            System.out.print("ClassNotFoundException occurred.");
        } catch (final IOException e) {
            System.out.print("IOException occurred.");
        }
    }
}
