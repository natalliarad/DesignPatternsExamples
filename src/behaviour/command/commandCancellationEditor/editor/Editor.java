package behaviour.command.commandCancellationEditor.editor;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import behaviour.command.commandCancellationEditor.commands.Command;
import behaviour.command.commandCancellationEditor.commands.CommandHistory;
import behaviour.command.commandCancellationEditor.commands.CopyCommand;
import behaviour.command.commandCancellationEditor.commands.CutCommand;
import behaviour.command.commandCancellationEditor.commands.PasteCommand;

public class Editor {

    public JTextArea textField;
    public String clipboard;
    private CommandHistory history = new CommandHistory();

    public void init() {
        final JFrame frame = new JFrame("Text editor (type & use buttons, Luke!)");
        final JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);

        final JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        final JButton ctrlC = new JButton("Ctrl+C");
        final JButton ctrlX = new JButton("Ctrl+X");
        final JButton ctrlV = new JButton("Ctrl+V");
        final JButton ctrlZ = new JButton("Ctrl+Z");
        final Editor editor = this;
        ctrlC.addActionListener(e -> executeCommand(new CopyCommand(editor)));
        ctrlX.addActionListener(e -> executeCommand(new CutCommand(editor)));
        ctrlV.addActionListener(e -> executeCommand(new PasteCommand(editor)));
        ctrlZ.addActionListener(e -> undo());
        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCommand(final Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    private void undo() {
        if (history.isEmpty()) {
            return;
        }

        final Command command = history.pop();

        if (command != null) {
            command.undo();
        }
    }
}
