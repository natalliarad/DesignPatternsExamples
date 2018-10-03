package behaviour.memento.shapeEditor.history;

import behaviour.memento.shapeEditor.editor.Editor;

public class Memento {

    private String backup;
    private Editor editor;

    public Memento(final Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    void restore() {
        editor.restore(backup);
    }
}
