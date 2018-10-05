package behaviour.command.commandCancellationEditor.commands;

import behaviour.command.commandCancellationEditor.editor.Editor;

public class CutCommand extends Command {

    public CutCommand(final Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText().isEmpty()) {
            return false;
        }

        backup();
        final String source = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(cutString(source));

        return true;
    }

    private String cutString(final String source) {
        final String start = source.substring(0, editor.textField.getSelectionStart());
        final String end = source.substring(editor.textField.getSelectionEnd());

        return start + end;
    }
}
