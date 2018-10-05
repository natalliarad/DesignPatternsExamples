package behaviour.command.commandCancellationEditor.commands;

import java.util.Stack;

public class CommandHistory {

    private final Stack<Command> history = new Stack<>();

    public void push(final Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
