package behaviour.command.commandCancellationEditor.commands;

import behaviour.command.commandCancellationEditor.editor.Editor;

public class CopyCommand extends Command {

    public CopyCommand(final Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
