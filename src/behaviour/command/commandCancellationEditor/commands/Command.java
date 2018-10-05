package behaviour.command.commandCancellationEditor.commands;

import behaviour.command.commandCancellationEditor.editor.Editor;

public abstract class Command {

    public Editor editor;
    private String backup;

    Command(final Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
